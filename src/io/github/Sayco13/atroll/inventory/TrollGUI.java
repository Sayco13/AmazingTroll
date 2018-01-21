package io.github.Sayco13.atroll.inventory;

import io.github.Sayco13.atroll.Main;
import io.github.Sayco13.atroll.utils.ItemBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class TrollGUI
{
  public List<String> playerLore = new ArrayList();
  public List<String> lore = new ArrayList();
  public List<String> TNTlore = new ArrayList();
  public List<String> freezeLore = new ArrayList();
  public Main plugin;
  
  public TrollGUI(Main plugin)
  {
    this.plugin = plugin;
  }
  
  public void openTroll(Player p)
  {
    Inventory troll = Bukkit.getServer().createInventory(null, 27, Main.getInstance().getConfig().getString("GUI.Troll").replaceAll("&", "§"));
    
    ItemStack fakeop = new ItemStack(Material.WOOD_AXE);
    ItemMeta fakeopMeta = fakeop.getItemMeta();
    
    fakeopMeta.setDisplayName(Main.getInstance().getConfig().getString("Troll-FakeOP.name-inventory").replaceAll("&", "§"));
    fakeop.setItemMeta(fakeopMeta);
    
    ItemStack emerald = new ItemStack(Material.EMERALD);
    ItemMeta emeraldMeta = emerald.getItemMeta();
    
    emeraldMeta.setDisplayName(Main.getInstance().getConfig().getString("Troll-Spam.name-inventory").replaceAll("&", "§"));
    this.lore.clear();
    this.lore.add(Main.getInstance().getConfig().getString("Troll-Spam.lore-inventory").replaceAll("&", "§"));
    emeraldMeta.setLore(this.lore);
    emerald.setItemMeta(emeraldMeta);
    
    ItemStack fakeBan = new ItemStack(Material.IRON_INGOT);
    ItemMeta fakeBanMeta = fakeBan.getItemMeta();
    
    fakeBanMeta.setDisplayName(Main.getInstance().getConfig().getString("Troll-Ban.name-inventory").replaceAll("&", "§"));
    fakeBan.setItemMeta(fakeBanMeta);
    
    ItemStack tntTroll = new ItemStack(Material.TNT);
    ItemMeta tntTrollMeta = tntTroll.getItemMeta();
    
    tntTrollMeta.setDisplayName(Main.getInstance().getConfig().getString("Troll-TnT.name-inventory").replaceAll("&", "§"));
    this.TNTlore.clear();
    this.TNTlore.add(Main.getInstance().getConfig().getString("Troll-TnT.lore-inventory").replaceAll("&", "§"));
    tntTrollMeta.setLore(this.TNTlore);
    tntTroll.setItemMeta(tntTrollMeta);
    
    ItemStack bedrockCage = new ItemStack(Material.BEDROCK);
    ItemMeta bedrockCageMeta = bedrockCage.getItemMeta();
    
    bedrockCageMeta.setDisplayName(Main.getInstance().getConfig().getString("Troll-BedrockCage.name-inventory").replaceAll("&", "§"));
    this.TNTlore.clear();
    this.TNTlore.add(Main.getInstance().getConfig().getString("Troll-BedrockCage.lore-inventory").replaceAll("&", "§"));
    bedrockCageMeta.setLore(this.TNTlore);
    bedrockCage.setItemMeta(bedrockCageMeta);
    
    ItemStack extremeTroll = new ItemStack(Material.BEACON);
    ItemMeta extremeTrollMeta = extremeTroll.getItemMeta();
    
    extremeTrollMeta.setDisplayName(Main.getInstance().getConfig().getString("Troll-ExtremeTroll.name-inventory").replaceAll("&", "§"));
    extremeTroll.setItemMeta(extremeTrollMeta);
    
    ItemStack lavaTroll = new ItemStack(Material.LAVA_BUCKET);
    ItemMeta lavaTrollMeta = lavaTroll.getItemMeta();
    
    lavaTrollMeta.setDisplayName(Main.getInstance().getConfig().getString("Troll-Lava.name-inventory").replaceAll("&", "§"));
    this.TNTlore.clear();
    this.TNTlore.add(Main.getInstance().getConfig().getString("Troll-Lava.lore-inventory").replaceAll("&", "§"));
    lavaTrollMeta.setLore(this.TNTlore);
    lavaTroll.setItemMeta(lavaTrollMeta);
    
    ItemStack facepalm = new ItemStack(Material.SKULL_ITEM, 1, (short)SkullType.PLAYER.ordinal());
    ItemMeta facepalmMeta = facepalm.getItemMeta();
    
    facepalmMeta.setDisplayName(Main.getInstance().getConfig().getString("Troll-Facepalm.name-inventory").replaceAll("&", "§"));
    facepalm.setItemMeta(facepalmMeta);
    
    ItemStack launch = new ItemStack(Material.ARROW);
    ItemMeta launchMeta = launch.getItemMeta();
    
    launchMeta.setDisplayName(Main.getInstance().getConfig().getString("Troll-Launch.name-inventory").replaceAll("&", "§"));
    launch.setItemMeta(launchMeta);
    
    ItemStack freeze = new ItemStack(Material.ICE);
    ItemMeta freezeMeta = freeze.getItemMeta();
    
    freezeMeta.setDisplayName(Main.getInstance().getConfig().getString("Troll-Freeze.name-inventory").replaceAll("&", "§"));
    this.freezeLore.clear();
    this.freezeLore.add(Main.getInstance().getConfig().getString("Troll-Freeze.lore-inventory").replaceAll("&", "§"));
    freezeMeta.setLore(this.freezeLore);
    freeze.setItemMeta(freezeMeta);
    
    ItemStack smite = new ItemStack(Material.BLAZE_ROD);
    ItemMeta smiteMeta = smite.getItemMeta();
    
    smiteMeta.setDisplayName(Main.getInstance().getConfig().getString("Troll-Smite.name-inventory").replaceAll("&", "§"));
    smite.setItemMeta(smiteMeta);
    
    ItemStack burn = new ItemStack(Material.FLINT_AND_STEEL);
    ItemMeta burnMeta = burn.getItemMeta();
    
    burnMeta.setDisplayName(Main.getInstance().getConfig().getString("Troll-Burn.name-inventory").replaceAll("&", "§"));
    burn.setItemMeta(burnMeta);
    
    ItemStack matrix = new ItemStack(Material.ENDER_PORTAL_FRAME);
    ItemMeta matrixMeta = matrix.getItemMeta();
    
    matrixMeta.setDisplayName(Main.getInstance().getConfig().getString("Troll-Matrix.name-inventory").replaceAll("&", "§"));
    matrix.setItemMeta(matrixMeta);     
    
    troll.setItem(0, fakeop);
    troll.setItem(1, emerald);
    troll.setItem(2, fakeBan);
    troll.setItem(3, tntTroll);
    troll.setItem(4, extremeTroll);
    troll.setItem(5, bedrockCage);
    troll.setItem(6, lavaTroll);
    troll.setItem(7, facepalm);
    troll.setItem(8, launch);
    troll.setItem(9, freeze);
    troll.setItem(10, smite);
    troll.setItem(11, burn);    
    troll.setItem(12, new ItemBuilder(Material.ENDER_CHEST).setName(Main.getInstance().getConfig().getString("Troll-Enderchest.name-inventory").replaceAll("&", "§")).toItemStack());
    troll.setItem(13, new ItemBuilder(Material.CHEST).setName(Main.getInstance().getConfig().getString("Troll-Inventory.name-inventory").replaceAll("&", "§")).toItemStack());
    troll.setItem(14, new ItemBuilder(Material.REDSTONE_TORCH_ON).setName(Main.getInstance().getConfig().getString("Troll-HidePlayers.name-inventory").replaceAll("&", "§")).toItemStack());
    troll.setItem(15, new ItemBuilder(Material.SKULL_ITEM).setDurability((short)3).setName(Main.getInstance().getConfig().getString("Troll-ControlPlayer.name-inventory").replaceAll("&", "§")).toItemStack());
    troll.setItem(16, new ItemBuilder(Material.SKULL_ITEM).setDurability((short)3).setSkullOwner(p.getName()).setName(Main.getInstance().getConfig().getString("Troll-BacktoBody.name-inventory").replaceAll("&", "§")).toItemStack());
    troll.setItem(17, matrix);
    troll.setItem(18, new ItemBuilder(Material.WOOL).setDurability((short)5).setName(Main.getInstance().getConfig().getString("Troll-Morphs.name-inventory").replaceAll("&", "§")).toItemStack());    
    
    p.openInventory(troll);
  }
  
  public void openMorphs(Player p)
  {
    Set names = Main.target.keySet();
    Iterator localIterator = names.iterator();
    if (localIterator.hasNext())
    {
      Player t = (Player)Main.target.get(p);
      Main.target.get(t);
      if (t != null)
      {
        Inventory morph = Bukkit.getServer().createInventory(null, 9, Main.getInstance().getConfig().getString("GUI.Morph").replaceAll("&", "§"));
        
        morph.setItem(0, new ItemBuilder(Material.SKULL_ITEM).setDurability((short)3).setSkullOwner("MHF_Chicken").setName(Main.getInstance().getConfig().getString("Morph-Chicken.name").replaceAll("&", "§")).toItemStack());
        morph.setItem(1, new ItemBuilder(Material.SKULL_ITEM).setDurability((short)3).setSkullOwner("MHF_Cow").setName(Main.getInstance().getConfig().getString("Morph-Cow.name").replaceAll("&", "§")).toItemStack());
        morph.setItem(2, new ItemBuilder(Material.SKULL_ITEM).setDurability((short)3).setSkullOwner("MHF_Pig").setName(Main.getInstance().getConfig().getString("Morph-Pig.name").replaceAll("&", "§")).toItemStack());
        morph.setItem(3, new ItemBuilder(Material.SKULL_ITEM).setDurability((short)4).setName(Main.getInstance().getConfig().getString("Morph-Creeper.name").replaceAll("&", "§")).toItemStack());
        morph.setItem(4, new ItemBuilder(Material.SKULL_ITEM).setDurability((short)3).setSkullOwner("Bat").setName(Main.getInstance().getConfig().getString("Morph-Bat.name").replaceAll("&", "§")).toItemStack());
        
        p.openInventory(morph);
      }
    }
  }  
}