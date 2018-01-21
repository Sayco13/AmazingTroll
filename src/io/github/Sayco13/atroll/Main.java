package io.github.Sayco13.atroll;

import io.github.Sayco13.atroll.inventory.Selector;
import io.github.Sayco13.atroll.inventory.TrollGUI;
import io.github.Sayco13.atroll.listeners.PlayerListeners;
import io.github.Sayco13.atroll.listeners.TrollListeners;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import me.libraryaddict.disguise.DisguiseAPI;
import me.libraryaddict.disguise.disguisetypes.PlayerDisguise;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class Main
  extends JavaPlugin
{
  public static String prefix;
  TrollGUI tm = new TrollGUI(this);
  public static HashMap<Player, Player> target = new HashMap();
  private static Main instance;
  public TrollListeners tl;
  public PlayerListeners tl2;
  public static Iterator localIterator;
  public HashMap<String, ItemStack[]> inventory;
  public HashMap<String, ItemStack[]> armor;
  public List<String> cd;
  public int maxControlTime;
  public int cooldown;
  
  @Override
  public void onEnable()
  {
    hookDependiencies();
    saveDefaultConfig();
    instance = this;
    this.tl = new TrollListeners(this);
    this.tl2 = new PlayerListeners(this);
    getServer().getPluginManager().registerEvents(this.tl, this);
    getServer().getPluginManager().registerEvents(this.tl2, this);
    getServer().getPluginManager().registerEvents(new iListener(this), this);
    prefix = getInstance().getConfig().getString("prefix").replaceAll("&", "§");
    this.armor = new HashMap();
    this.inventory = new HashMap();
    this.maxControlTime = 0;
    this.cooldown = 0;
    this.cd = new ArrayList();

    }
  
  @Override
  public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String commandLabel, String[] args)
  {
    if (!(sender instanceof Player))
    {
      sender.sendMessage(getInstance().getConfig().getString("consoleNoRunCommand").replaceAll("&", "§"));
      return true;
    }
    Player p = (Player)sender;
    if (commandLabel.equalsIgnoreCase("troll"))
    {
      if (!sender.hasPermission(getInstance().getConfig().getString("permission-troll").replaceAll("&", "§")))
      {
        sender.sendMessage(prefix + getInstance().getConfig().getString("no-permission").replaceAll("&", "§"));
        return true;
      }
      if (args.length == 0)
      {
       Object localObject1;
       Player localPlayer1;
       Object localObject2;          
          
        localPlayer1 = (Player)sender;
        localObject2 = new Selector();
        ((Selector)localObject2).openGUI(localPlayer1);
      }
      if (args.length == 1)
      {
        Player t = Bukkit.getServer().getPlayer(args[0]);
        if (t == null)
        {
          p.sendMessage(prefix + getInstance().getConfig().getString("no-player-online").replaceAll("&", "§").replaceAll("%player%", args[0]));
          return true;
        }
        target.put(p, t);
        this.tm.openTroll(p);
        return true;
      }
      if (args.length >= 2)
      {
        p.sendMessage(prefix + getInstance().getConfig().getString("too-many-arguments").replaceAll("&", "§"));
        return true;
      }
    }
    return true;
  }
  
  public void hookDependiencies()
  {
    new BukkitRunnable()
    {
      @Override
      public void run()
      {
        if (!Bukkit.getPluginManager().isPluginEnabled("ProtocolLib"))
        {
          Bukkit.getConsoleSender().sendMessage("[TrollGUI] ProtocolLib not found, disabling the plugin...");
          Main.this.setEnabled(false);
        }
      }
    }
    
      .runTaskLater(this, 1L);
    
    new BukkitRunnable()
    {
      @Override
      public void run()
      {
        if (!Bukkit.getPluginManager().isPluginEnabled("LibsDisguises"))
        {
          Bukkit.getConsoleSender().sendMessage("[TrollGUI] LibsDisguises not found, disabling the plugin...");
          Main.this.setEnabled(false);
        }
      }
    }
    
      .runTaskLater(this, 1L);
    
    new BukkitRunnable()
    {
      @Override
      public void run()
      {
        if (!Bukkit.getPluginManager().isPluginEnabled("OpenInv"))
        {
          Bukkit.getConsoleSender().sendMessage("[TrollGUI] OpenInv not found, disabling the plugin...");
          Main.this.setEnabled(false);
        }
      }
    }
    
      .runTaskLater(this, 1L);    
  }
  
  public void stopControlling(Player v, Player c)
  {
    c.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 200, 1));
    
    v.removeMetadata("iCU_P", this);
    v.setGameMode(GameMode.SURVIVAL);
    
    c.removeMetadata("iCU_H", this);
    DisguiseAPI.undisguiseToAll(c);
    
    v.getInventory().setContents(c.getInventory().getContents());
    v.getInventory().setArmorContents(c.getInventory().getArmorContents());
    
    c.getInventory().setContents((ItemStack[])this.inventory.get(c.getName()));
    c.getInventory().setArmorContents((ItemStack[])this.armor.get(c.getName()));
    this.inventory.remove(c.getName());
    this.armor.remove(c.getName());
    
    v.teleport(c);
    if (this.cooldown > 0)
    {
      this.cd.add(c.getName());
      new Cooldown(this, c).runTaskLater(this, this.cooldown * 20);
    }
  }
  
  public void startControlling(Player v, Player c)
  {
    v.setMetadata("iCU_P", new FixedMetadataValue(this, c.getName()));
    c.setMetadata("iCU_H", new FixedMetadataValue(this, v.getName()));
    
    this.inventory.put(c.getName(), c.getInventory().getContents());
    this.armor.put(c.getName(), c.getInventory().getArmorContents());
    c.getInventory().setContents(v.getInventory().getContents());
    c.getInventory().setArmorContents(v.getInventory().getArmorContents());
    
    c.teleport(v);
    v.setGameMode(GameMode.SPECTATOR);
    
    PlayerDisguise disV = new PlayerDisguise(v.getName());
    DisguiseAPI.disguiseToAll(c, disV);
    
    new CheckVictim(v, c).runTaskTimer(this, 100L, 100L);
    
    c.sendMessage(prefix + getConfig().getString("controlPlayerMessageSend").replaceAll("&", "§"));
    if (this.maxControlTime > 0) {
      new ControlTimer(c, v, this).runTaskLater(this, this.maxControlTime * 20);
    }
  }
  
  public static Main getInstance()
  {
    return instance;
  }

    class inventory {

        public inventory() {
        }
    }
}