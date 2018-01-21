package io.github.Sayco13.atroll.listeners;

import io.github.Sayco13.atroll.Main;
import io.github.Sayco13.atroll.inventory.Selector;
import io.github.Sayco13.atroll.inventory.TrollGUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import me.libraryaddict.disguise.DisguiseAPI;
import me.libraryaddict.disguise.disguisetypes.DisguiseType;
import me.libraryaddict.disguise.disguisetypes.MobDisguise;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class TrollListeners
  implements Listener
{
  public Main plugin;
    TrollGUI tm = new TrollGUI(this.plugin);
  public static ArrayList<Player> freeze = new ArrayList();
  public static ArrayList<Player> playersocult = new ArrayList();
  public static ArrayList<Player> dragonmont = new ArrayList();
  
  public TrollListeners(Main plugin)
  {
    this.plugin = plugin;
  }
  
  @EventHandler
  public void onPlayerClickNull(InventoryClickEvent event)
  {
    if (!event.getInventory().getName().equals(Main.getInstance().getConfig().getString("GUI.Troll").replaceAll("&", "§"))) {
      return;
    }
    Player p = (Player)event.getWhoClicked();
    event.setCancelled(true);
    if ((event.getCurrentItem() == null) || (event.getCurrentItem().getType() == Material.AIR) || (!event.getCurrentItem().hasItemMeta()))
    {
      p.closeInventory();
      return;
    }
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Troll-FakeOP.name-inventory").replaceAll("&", "§")))
    {
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        if (t != null) {
          t.sendMessage(Main.getInstance().getConfig().getString("Troll-FakeOP.messages.fakeOPMessage1").replaceAll("&", "§"));
          t.sendMessage(Main.getInstance().getConfig().getString("Troll-FakeOP.messages.fakeOPMessage2").replaceAll("&", "§"));
        }
        p.sendMessage(Main.prefix + Main.getInstance().getConfig().getString("Troll-FakeOP.messages.fakeOPMessageSend").replaceAll("&", "§"));
        Main.target.remove(t);
        p.closeInventory();
        return;
      }
    }
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Troll-Spam.name-inventory").replaceAll("&", "§")))
    {
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        Main.target.get(p);
        p.closeInventory();
        p.sendMessage(Main.prefix + Main.getInstance().getConfig().getString("Troll-Spam.messages.TrollSpamMessageSend").replaceAll("&", "§"));
        for (int x = 0; x <= 3000; x++) {
          if (x <= 3000)
          {
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");                        
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");                        
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
          }
        }
        Main.target.remove(p);
        return;
      }
    }
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Troll-Ban.name-inventory").replaceAll("&", "§")))
    {
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        Main.target.get(t);
        if (t != null) {
          t.kickPlayer(Main.getInstance().getConfig().getString("Troll-Ban.messages.trollBanMessage").replaceAll("&", "§"));
        }
        p.sendMessage(Main.prefix + Main.getInstance().getConfig().getString("Troll-Ban.messages.trollBanMessageSend").replaceAll("&", "§"));
        Main.target.remove(t);
        p.closeInventory();
        return;
      }
    }
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Troll-TnT.name-inventory").replaceAll("&", "§")))
    {
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        Main.target.get(t);
        if (t != null)
        {
          Location tl = new Location(t.getWorld(), t.getLocation().getX() + 1.0D, t.getLocation().getY(), t.getLocation().getZ());
          Location tl1 = new Location(t.getWorld(), t.getLocation().getX() - 1.0D, t.getLocation().getY(), t.getLocation().getZ());
          Location tl2 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY(), t.getLocation().getZ() + 1.0D);
          Location tl3 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY(), t.getLocation().getZ() - 1.0D);
          Location tl4 = new Location(t.getWorld(), t.getLocation().getX() + 1.0D, t.getLocation().getY() + 1.0D, t.getLocation().getZ());
          Location tl5 = new Location(t.getWorld(), t.getLocation().getX() - 1.0D, t.getLocation().getY() + 1.0D, t.getLocation().getZ());
          Location tl6 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY() + 1.0D, t.getLocation().getZ() + 1.0D);
          Location tl7 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY() + 1.0D, t.getLocation().getZ() - 1.0D);
          Location tl8 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY() + 2.0D, t.getLocation().getZ());
          Location t20 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY() - 1.0D, t.getLocation().getZ());          
          Location tl9 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY() + 3.0D, t.getLocation().getZ());
          t.getWorld().strikeLightning(tl8);
          t.getWorld().getBlockAt(tl).setType(Material.TNT);
          t.getWorld().getBlockAt(tl1).setType(Material.TNT);
          t.getWorld().getBlockAt(tl2).setType(Material.TNT);
          t.getWorld().getBlockAt(tl3).setType(Material.TNT);
          t.getWorld().getBlockAt(tl4).setType(Material.TNT);
          t.getWorld().getBlockAt(tl5).setType(Material.TNT);
          t.getWorld().getBlockAt(tl6).setType(Material.TNT);
          t.getWorld().getBlockAt(tl7).setType(Material.TNT);
          t.getWorld().getBlockAt(tl8).setType(Material.TNT);
          t.getWorld().getBlockAt(tl9).setType(Material.FIRE);
          t.getWorld().getBlockAt(t20).setType(Material.TNT);
          t.getWorld().createExplosion(t.getLocation(), 5.0F);
          p.sendMessage(Main.prefix + Main.getInstance().getConfig().getString("Troll-TnT.messages.tntTrollMessageSend").replaceAll("&", "§"));
        }
        Main.target.remove(t);
        p.closeInventory();
        return;
      }
    }
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Troll-BedrockCage.name-inventory").replaceAll("&", "§")))
    {
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        Main.target.get(t);
        if (t != null)
        {
          Location tl = new Location(t.getWorld(), t.getLocation().getX() + 1.0D, t.getLocation().getY(), t.getLocation().getZ());
          Location tl1 = new Location(t.getWorld(), t.getLocation().getX() - 1.0D, t.getLocation().getY(), t.getLocation().getZ());
          Location tl2 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY(), t.getLocation().getZ() + 1.0D);
          Location tl3 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY(), t.getLocation().getZ() - 1.0D);
          Location tl4 = new Location(t.getWorld(), t.getLocation().getX() + 1.0D, t.getLocation().getY(), t.getLocation().getZ() + 1.0D);
          Location tl5 = new Location(t.getWorld(), t.getLocation().getX() - 1.0D, t.getLocation().getY(), t.getLocation().getZ() - 1.0D);
          Location tl6 = new Location(t.getWorld(), t.getLocation().getX() + 1.0D, t.getLocation().getY(), t.getLocation().getZ() - 1.0D);
          Location tl7 = new Location(t.getWorld(), t.getLocation().getX() - 1.0D, t.getLocation().getY(), t.getLocation().getZ() + 1.0D);
          Location tl8 = new Location(t.getWorld(), t.getLocation().getX() + 1.0D, t.getLocation().getY() + 1.0D, t.getLocation().getZ() + 1.0D);
          Location tl9 = new Location(t.getWorld(), t.getLocation().getX() - 1.0D, t.getLocation().getY() + 1.0D, t.getLocation().getZ() - 1.0D);
          Location tl10 = new Location(t.getWorld(), t.getLocation().getX() + 1.0D, t.getLocation().getY() + 1.0D, t.getLocation().getZ() - 1.0D);
          Location tl11 = new Location(t.getWorld(), t.getLocation().getX() - 1.0D, t.getLocation().getY() + 1.0D, t.getLocation().getZ() + 1.0D);
          Location tl12 = new Location(t.getWorld(), t.getLocation().getX() + 1.0D, t.getLocation().getY() + 2.0D, t.getLocation().getZ() + 1.0D);
          Location tl13 = new Location(t.getWorld(), t.getLocation().getX() - 1.0D, t.getLocation().getY() + 2.0D, t.getLocation().getZ() - 1.0D);
          Location tl14 = new Location(t.getWorld(), t.getLocation().getX() + 1.0D, t.getLocation().getY() + 2.0D, t.getLocation().getZ() - 1.0D);
          Location tl15 = new Location(t.getWorld(), t.getLocation().getX() - 1.0D, t.getLocation().getY() + 2.0D, t.getLocation().getZ() + 1.0D);
          Location tl16 = new Location(t.getWorld(), t.getLocation().getX() + 1.0D, t.getLocation().getY() + 2.0D, t.getLocation().getZ());
          Location tl17 = new Location(t.getWorld(), t.getLocation().getX() - 1.0D, t.getLocation().getY() + 2.0D, t.getLocation().getZ());
          Location tl18 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY() + 2.0D, t.getLocation().getZ() + 1.0D);
          Location tl19 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY() + 2.0D, t.getLocation().getZ() - 1.0D);
          Location tl20 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY() + 3.0D, t.getLocation().getZ());
          Location tl21 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY() + 1.0D, t.getLocation().getZ() - 1.0D);
          Location tl22 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY() + 1.0D, t.getLocation().getZ() + 1.0D);
          Location tl23 = new Location(t.getWorld(), t.getLocation().getX() - 1.0D, t.getLocation().getY() + 1.0D, t.getLocation().getZ());
          Location tl24 = new Location(t.getWorld(), t.getLocation().getX() + 1.0D, t.getLocation().getY() + 1.0D, t.getLocation().getZ());
          Location tl25 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY() - 1.0D, t.getLocation().getZ());
          Location tl26 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY() + 1.0D, t.getLocation().getZ());
          Location tl27 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY() + 2.0D, t.getLocation().getZ());
          Location tl28 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY(), t.getLocation().getZ());
          t.getWorld().getBlockAt(tl).setType(Material.BEDROCK);
          t.getWorld().getBlockAt(tl1).setType(Material.BEDROCK);
          t.getWorld().getBlockAt(tl2).setType(Material.BEDROCK);
          t.getWorld().getBlockAt(tl3).setType(Material.BEDROCK);
          t.getWorld().getBlockAt(tl4).setType(Material.BEDROCK);
          t.getWorld().getBlockAt(tl5).setType(Material.BEDROCK);
          t.getWorld().getBlockAt(tl6).setType(Material.BEDROCK);
          t.getWorld().getBlockAt(tl7).setType(Material.BEDROCK);
          t.getWorld().getBlockAt(tl8).setType(Material.BEDROCK);
          t.getWorld().getBlockAt(tl9).setType(Material.BEDROCK);
          t.getWorld().getBlockAt(tl10).setType(Material.BEDROCK);
          t.getWorld().getBlockAt(tl11).setType(Material.BEDROCK);
          t.getWorld().getBlockAt(tl12).setType(Material.BEDROCK);
          t.getWorld().getBlockAt(tl13).setType(Material.BEDROCK);
          t.getWorld().getBlockAt(tl14).setType(Material.BEDROCK);
          t.getWorld().getBlockAt(tl15).setType(Material.BEDROCK);
          t.getWorld().getBlockAt(tl16).setType(Material.BEDROCK);
          t.getWorld().getBlockAt(tl17).setType(Material.BEDROCK);
          t.getWorld().getBlockAt(tl18).setType(Material.BEDROCK);
          t.getWorld().getBlockAt(tl19).setType(Material.BEDROCK);
          t.getWorld().getBlockAt(tl20).setType(Material.BEDROCK);
          t.getWorld().getBlockAt(tl21).setType(Material.IRON_FENCE);
          t.getWorld().getBlockAt(tl22).setType(Material.IRON_FENCE);
          t.getWorld().getBlockAt(tl23).setType(Material.IRON_FENCE);
          t.getWorld().getBlockAt(tl24).setType(Material.IRON_FENCE);
          t.getWorld().getBlockAt(tl25).setType(Material.BEDROCK);
          t.getWorld().getBlockAt(tl26).setType(Material.AIR);
          t.getWorld().getBlockAt(tl27).setType(Material.AIR);
          t.getWorld().getBlockAt(tl28).setType(Material.AIR);
          t.setGameMode(GameMode.SURVIVAL);
        }
        p.sendMessage(Main.prefix + Main.getInstance().getConfig().getString("Troll-BedrockCage.messages.bedrockCageMessageSend").replaceAll("&", "§"));
        Main.target.remove(t);
        p.closeInventory();
        return;
      }
    }    
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Troll-ExtremeTroll.name-inventory").replaceAll("&", "§")))
    {
      p.closeInventory();
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        Main.target.get(t);
        if (t != null) {
          for (int x = 0; x <= 1000; x++) {
            if (x <= 1000)
            {
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");                        
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");                        
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
            t.sendMessage(ChatColor.GREEN + "§kASDIJASOIUDIOSNDIJAOSIJDAS12032013615A65SD13SA2D");
              t.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 3000, 1000));
              t.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 3000, 1000));
              t.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 3000, 1000));
              t.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 3000, 1000));
            }
          }
        }
        Main.target.remove(t);
        p.sendMessage(Main.prefix + Main.getInstance().getConfig().getString("Troll-ExtremeTroll.messages.extremeTrollMessageSend").replaceAll("&", "�"));
      }
      return;
    }
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Troll-Lava.name-inventory").replaceAll("&", "§")))
    {
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        Main.target.get(t);
        if (t != null)
        {
          Location tl = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY() - 1.0D, t.getLocation().getZ());
          Location tl1 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY() - 1.0D, t.getLocation().getZ() + 1.0D);
          Location tl2 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY() - 1.0D, t.getLocation().getZ() - 1.0D);
          Location tl3 = new Location(t.getWorld(), t.getLocation().getX() + 1.0D, t.getLocation().getY() - 1.0D, t.getLocation().getZ() + 1.0D);
          Location tl4 = new Location(t.getWorld(), t.getLocation().getX() - 1.0D, t.getLocation().getY() - 1.0D, t.getLocation().getZ() - 1.0D);
          Location tl5 = new Location(t.getWorld(), t.getLocation().getX() - 1.0D, t.getLocation().getY() - 1.0D, t.getLocation().getZ() + 1.0D);
          Location tl6 = new Location(t.getWorld(), t.getLocation().getX() + 1.0D, t.getLocation().getY() - 1.0D, t.getLocation().getZ() - 1.0D);
          Location tl7 = new Location(t.getWorld(), t.getLocation().getX() + 1.0D, t.getLocation().getY() - 1.0D, t.getLocation().getZ());
          Location tl8 = new Location(t.getWorld(), t.getLocation().getX() - 1.0D, t.getLocation().getY() - 1.0D, t.getLocation().getZ());
          
          Location tl19 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY() - 2.0D, t.getLocation().getZ());
          Location tl20 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY() - 2.0D, t.getLocation().getZ() + 1.0D);
          Location tl21 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY() - 2.0D, t.getLocation().getZ() - 1.0D);
          Location tl22 = new Location(t.getWorld(), t.getLocation().getX() + 1.0D, t.getLocation().getY() - 2.0D, t.getLocation().getZ() + 1.0D);
          Location tl23 = new Location(t.getWorld(), t.getLocation().getX() - 1.0D, t.getLocation().getY() - 2.0D, t.getLocation().getZ() - 1.0D);
          Location tl24 = new Location(t.getWorld(), t.getLocation().getX() - 1.0D, t.getLocation().getY() - 2.0D, t.getLocation().getZ() + 1.0D);
          Location tl25 = new Location(t.getWorld(), t.getLocation().getX() + 1.0D, t.getLocation().getY() - 2.0D, t.getLocation().getZ() - 1.0D);
          Location tl26 = new Location(t.getWorld(), t.getLocation().getX() + 1.0D, t.getLocation().getY() - 2.0D, t.getLocation().getZ());
          Location tl27 = new Location(t.getWorld(), t.getLocation().getX() - 1.0D, t.getLocation().getY() - 2.0D, t.getLocation().getZ());
          
          Location tl28 = new Location(t.getWorld(), t.getLocation().getX() + 2.0D, t.getLocation().getY(), t.getLocation().getZ() + 2.0D);
          Location tl29 = new Location(t.getWorld(), t.getLocation().getX() - 2.0D, t.getLocation().getY(), t.getLocation().getZ() - 2.0D);
          Location tl30 = new Location(t.getWorld(), t.getLocation().getX() + 2.0D, t.getLocation().getY(), t.getLocation().getZ() - 2.0D);
          Location tl31 = new Location(t.getWorld(), t.getLocation().getX() - 2.0D, t.getLocation().getY(), t.getLocation().getZ() + 2.0D);
          Location tl32 = new Location(t.getWorld(), t.getLocation().getX() + 2.0D, t.getLocation().getY(), t.getLocation().getZ());
          Location tl33 = new Location(t.getWorld(), t.getLocation().getX() - 2.0D, t.getLocation().getY(), t.getLocation().getZ());
          Location tl34 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY(), t.getLocation().getZ() + 2.0D);
          Location tl35 = new Location(t.getWorld(), t.getLocation().getX(), t.getLocation().getY(), t.getLocation().getZ() - 2.0D);
          Location tl36 = new Location(t.getWorld(), t.getLocation().getX() + 2.0D, t.getLocation().getY(), t.getLocation().getZ() + 1.0D);
          Location tl37 = new Location(t.getWorld(), t.getLocation().getX() - 2.0D, t.getLocation().getY(), t.getLocation().getZ() - 1.0D);
          Location tl38 = new Location(t.getWorld(), t.getLocation().getX() + 1.0D, t.getLocation().getY(), t.getLocation().getZ() - 2.0D);
          Location tl39 = new Location(t.getWorld(), t.getLocation().getX() - 1.0D, t.getLocation().getY(), t.getLocation().getZ() + 2.0D);
          Location tl40 = new Location(t.getWorld(), t.getLocation().getX() + 1.0D, t.getLocation().getY(), t.getLocation().getZ() + 2.0D);
          Location tl41 = new Location(t.getWorld(), t.getLocation().getX() - 1.0D, t.getLocation().getY(), t.getLocation().getZ() - 2.0D);
          Location tl42 = new Location(t.getWorld(), t.getLocation().getX() - 2.0D, t.getLocation().getY(), t.getLocation().getZ() + 1.0D);
          Location tl43 = new Location(t.getWorld(), t.getLocation().getX() + 2.0D, t.getLocation().getY(), t.getLocation().getZ() - 1.0D);
          
          t.getWorld().getBlockAt(tl).setType(Material.LAVA);
          t.getWorld().getBlockAt(tl1).setType(Material.LAVA);
          t.getWorld().getBlockAt(tl2).setType(Material.LAVA);
          t.getWorld().getBlockAt(tl3).setType(Material.LAVA);
          t.getWorld().getBlockAt(tl4).setType(Material.LAVA);
          t.getWorld().getBlockAt(tl5).setType(Material.LAVA);
          t.getWorld().getBlockAt(tl6).setType(Material.LAVA);
          t.getWorld().getBlockAt(tl7).setType(Material.LAVA);
          t.getWorld().getBlockAt(tl8).setType(Material.LAVA);
          t.getWorld().getBlockAt(tl19).setType(Material.LAVA);
          t.getWorld().getBlockAt(tl20).setType(Material.LAVA);
          t.getWorld().getBlockAt(tl21).setType(Material.LAVA);
          t.getWorld().getBlockAt(tl22).setType(Material.LAVA);
          t.getWorld().getBlockAt(tl23).setType(Material.LAVA);
          t.getWorld().getBlockAt(tl24).setType(Material.LAVA);
          t.getWorld().getBlockAt(tl25).setType(Material.LAVA);
          t.getWorld().getBlockAt(tl26).setType(Material.LAVA);
          t.getWorld().getBlockAt(tl27).setType(Material.LAVA);
          
          t.getWorld().getBlockAt(tl28).setType(Material.FENCE);
          t.getWorld().getBlockAt(tl29).setType(Material.FENCE);
          t.getWorld().getBlockAt(tl30).setType(Material.FENCE);
          t.getWorld().getBlockAt(tl31).setType(Material.FENCE);
          t.getWorld().getBlockAt(tl32).setType(Material.FENCE);
          t.getWorld().getBlockAt(tl33).setType(Material.FENCE);
          t.getWorld().getBlockAt(tl34).setType(Material.FENCE);
          t.getWorld().getBlockAt(tl35).setType(Material.FENCE);
          t.getWorld().getBlockAt(tl36).setType(Material.FENCE);
          t.getWorld().getBlockAt(tl37).setType(Material.FENCE);
          t.getWorld().getBlockAt(tl38).setType(Material.FENCE);
          t.getWorld().getBlockAt(tl39).setType(Material.FENCE);
          t.getWorld().getBlockAt(tl40).setType(Material.FENCE);
          t.getWorld().getBlockAt(tl41).setType(Material.FENCE);
          t.getWorld().getBlockAt(tl42).setType(Material.FENCE);
          t.getWorld().getBlockAt(tl43).setType(Material.FENCE);
          
          t.setGameMode(GameMode.SURVIVAL);
        }
        p.sendMessage(Main.prefix + Main.getInstance().getConfig().getString("Troll-Lava.messages.lavaTrollMessageSend").replaceAll("&", "§"));
        Main.target.remove(t);
        p.closeInventory();
        return;
      }
    }
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Troll-Facepalm.name-inventory").replaceAll("&", "§")))
    {
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        Main.target.get(t);
        if (t != null)
        {
          t.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 300, 100));
          t.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 300, 1));
        }
        p.sendMessage(Main.prefix + Main.getInstance().getConfig().getString("Troll-Facepalm.messages.FacepalmMessageSend").replaceAll("&", "§"));
        Main.target.remove(t);
        p.closeInventory();
        return;
      }
    }
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Troll-Launch.name-inventory").replaceAll("&", "§")))
    {
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        Main.target.get(t);
        if (t != null)
        {
          Vector launch = new Vector(0, 10, 0);
          t.setVelocity(launch);
        }
        p.sendMessage(Main.prefix + Main.getInstance().getConfig().getString("Troll-Launch.messages.launchMessageSend").replaceAll("&", "§"));
        Main.target.remove(t);
        p.closeInventory();
        return;
      }
    }
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Troll-Freeze.name-inventory").replaceAll("&", "§")))
    {
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        Main.target.get(t);
        if (t != null)
        {
          p.closeInventory();
          if (!freeze.contains(t))
          {
            freeze.add(t);
            p.sendMessage(Main.prefix + Main.getInstance().getConfig().getString("Troll-Freeze.messages.frozenMessageSend").replaceAll("&", "§"));
            return;
          }
          if (freeze.contains(t))
          {
            freeze.remove(t);
            p.sendMessage(Main.prefix + Main.getInstance().getConfig().getString("Troll-Freeze.messages.unFrozenMessageSend").replaceAll("&", "§"));
            return;
          }
        }
      }
    }
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Troll-Smite.name-inventory").replaceAll("&", "§")))
    {
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        Main.target.get(t);
        if (t != null)
        {
          p.getWorld().strikeLightning(t.getLocation());
          p.sendMessage(Main.prefix + Main.getInstance().getConfig().getString("Troll-Smite.messages.smiteTrollMessageSend").replaceAll("&", "§"));
          p.closeInventory();
          return;
        }
      }
    }
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Troll-Burn.name-inventory").replaceAll("&", "§")))
    {
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        Main.target.get(t);
        if (t != null)
        {
          t.setFireTicks(5000);
          p.sendMessage(Main.prefix + Main.getInstance().getConfig().getString("Troll-Burn.messages.burnTrollMessageSend").replaceAll("&", "§"));
          p.closeInventory();
          return;
        }
      }
    }
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Troll-Enderchest.name-inventory").replaceAll("&", "§")))
    {
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        Main.target.get(t);
        if (t != null) {
          p.openInventory(t.getEnderChest());
        }
        Main.target.remove(t);
        return;
      }
    }
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Troll-Inventory.name-inventory").replaceAll("&", "§")))
    {
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        Main.target.get(t);
        if (t != null) {
          Bukkit.dispatchCommand(p, "oi " + t.getName());
        }
        Main.target.remove(t);
        return;
      }
    }    
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Troll-ControlPlayer.name-inventory").replaceAll("&", "§")))
    {
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        Main.target.get(t);
        if (t != null) {
          this.plugin.startControlling(t, p);
        }
        Main.target.remove(t);
        p.closeInventory();
        return;
      }
    }
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Troll-BacktoBody.name-inventory").replaceAll("&", "§")))
    {
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        Main.target.get(t);
        if (t != null)
        {
          DisguiseAPI.undisguiseToAll(t);
          t.removeMetadata("iCU_P", this.plugin);
          t.setGameMode(GameMode.SURVIVAL);
          p.removeMetadata("iCU_H", this.plugin);
          t.setAllowFlight(false);
        }
        p.closeInventory();
        Main.target.remove(t);
        return;
      }
    }
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Troll-HidePlayers.name-inventory").replaceAll("&", "§")))
    {
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        Main.target.get(t);
        if (t != null) {
          if (playersocult.contains(t))
          {
            playersocult.remove(t);
            for (Player p2 : Bukkit.getOnlinePlayers()) {
              t.showPlayer(p2);
              p.sendMessage(Main.prefix + Main.getInstance().getConfig().getString("Troll-HidePlayers.messages.showPlayersMessageSend").replaceAll("&", "§"));
            }
          }
          else
          {
            playersocult.add(t);
            for (Player p2 : Bukkit.getOnlinePlayers()) {
              t.hidePlayer(p2);
              p.sendMessage(Main.prefix + Main.getInstance().getConfig().getString("Troll-HidePlayers.messages.hidePlayersMessageSend").replaceAll("&", "§"));
            }
          }
        }
        Main.target.remove(t);
        p.closeInventory();
        return;
      }
    }
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Troll-Matrix.name-inventory").replaceAll("&", "§")))
    {
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        Main.target.get(t);
        if (t != null)
        {
          t.kickPlayer("§a§kFAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_FAKE_");
          p.sendMessage(Main.prefix + Main.getInstance().getConfig().getString("Troll-Matrix.messages.matrixMessageSend").replaceAll("&", "§"));
          p.closeInventory();
        }
      }
    }
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Troll-Morphs.name-inventory").replaceAll("&", "§")))
    {
      Player t = (Player)Main.target.get(p);
      Main.target.get(t);
      Main.target.put(p, t);
      this.tm.openMorphs(p);
    }    
  }
  
    @EventHandler
  public void onPlayerClickNull1(InventoryClickEvent event)
  {
    if (!event.getInventory().getName().equals(Main.getInstance().getConfig().getString("GUI.Morph").replaceAll("&", "§"))) {
      return;
    }
    Player p = (Player)event.getWhoClicked();
    event.setCancelled(true);
    if ((event.getCurrentItem() == null) || (event.getCurrentItem().getType() == Material.AIR) || (!event.getCurrentItem().hasItemMeta()))
    {
      p.closeInventory();
      return;
    }
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Morph-Chicken.name").replaceAll("&", "§")))
    {
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        Main.target.get(t);
        if (t != null)
        {
          MobDisguise pollo = new MobDisguise(DisguiseType.CHICKEN);
          DisguiseAPI.disguiseToAll(t, pollo);
          t.setAllowFlight(false);
          p.sendMessage(Main.prefix + Main.getInstance().getConfig().getString("Morph-Chicken.messages.DisguiseMessage").replaceAll("&", "§").replaceAll("%player%", t.getName()));
          p.closeInventory();
        }
      }
    }
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Morph-Cow.name").replaceAll("&", "§")))
    {
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        Main.target.get(t);
        if (t != null)
        {
          MobDisguise cow = new MobDisguise(DisguiseType.COW);
          DisguiseAPI.disguiseToAll(t, cow);
          t.setAllowFlight(false);
          p.sendMessage(Main.prefix + Main.getInstance().getConfig().getString("Morph-Cow.messages.DisguiseMessage").replaceAll("&", "§").replaceAll("%player%", t.getName()));
          p.closeInventory();
        }
      }
    }
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Morph-Pig.name").replaceAll("&", "§")))
    {
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        Main.target.get(t);
        if (t != null)
        {
          MobDisguise pig = new MobDisguise(DisguiseType.PIG);
          DisguiseAPI.disguiseToAll(t, pig);
          t.setAllowFlight(false);
          p.sendMessage(Main.prefix + Main.getInstance().getConfig().getString("Morph-Pig.messages.DisguiseMessage").replaceAll("&", "§").replaceAll("%player%", t.getName()));
          p.closeInventory();
        }
      }
    }
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Morph-Creeper.name").replaceAll("&", "§")))
    {
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        Main.target.get(t);
        if (t != null)
        {
          MobDisguise creeper = new MobDisguise(DisguiseType.CREEPER);
          DisguiseAPI.disguiseToAll(t, creeper);
          t.setAllowFlight(false);
          p.sendMessage(Main.prefix + Main.getInstance().getConfig().getString("Morph-Creeper.messages.DisguiseMessage").replaceAll("&", "§").replaceAll("%player%", t.getName()));
          p.closeInventory();
        }
      }
    }
    if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.getInstance().getConfig().getString("Morph-Bat.name").replaceAll("&", "§")))
    {
      Set names = Main.target.keySet();
      Iterator localIterator = names.iterator();
      if (localIterator.hasNext())
      {
        Player t = (Player)Main.target.get(p);
        Main.target.get(t);
        if (t != null)
        {
          MobDisguise bat = new MobDisguise(DisguiseType.BAT);
          DisguiseAPI.disguiseToAll(t, bat);
          t.setAllowFlight(true);
          p.sendMessage(Main.prefix + Main.getInstance().getConfig().getString("Morph-Bat.messages.DisguiseMessage").replaceAll("&", "§").replaceAll("%player%", t.getName()));
          p.closeInventory();
        }
      }
    }    
  }
    @EventHandler
  public void onClick(InventoryClickEvent paramInventoryClickEvent)
  {
    ItemStack localItemStack = paramInventoryClickEvent.getCurrentItem();
    if ((localItemStack == null) || (localItemStack.getType() == Material.AIR) || (localItemStack.getItemMeta() == null)) {
      return;
    }
    Player localPlayer1 = (Player)paramInventoryClickEvent.getWhoClicked();
    Inventory localInventory = paramInventoryClickEvent.getInventory();
    Selector localGUI = new Selector();
    if ((localInventory.getName().equals(localGUI.invName)))
    {
      paramInventoryClickEvent.setCancelled(true);
      localPlayer1.closeInventory();
    }
    String str;
    Player localPlayer2;
    Object localObject;
    if (localInventory.getName().equals(localGUI.invName))
    {
      str = net.md_5.bungee.api.ChatColor.stripColor(localItemStack.getItemMeta().getDisplayName());
      localPlayer2 = Bukkit.getPlayer(str);
      if (localPlayer2 == null)
      {
        localPlayer1.closeInventory();paramInventoryClickEvent.setCancelled(true);
        localPlayer1.sendMessage(Main.prefix + Main.getInstance().getConfig().getString("Selector-Options.Error").replaceAll("%player%", str));
        return;
      }
      localPlayer1.closeInventory();
      Bukkit.dispatchCommand(localPlayer1, "troll " + str);
    }
  }
}