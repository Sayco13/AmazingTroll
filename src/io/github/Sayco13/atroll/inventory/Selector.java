package io.github.Sayco13.atroll.inventory;

import io.github.Sayco13.atroll.Main;
import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class Selector
{
  public String invName = Main.getInstance().getConfig().getString("GUI.Selector").replaceAll("&", "§");
  private Inventory inv;
    public Main plugin;
  
  private Inventory createGUI()
  {
    int i = Bukkit.getOnlinePlayers().size();
    if (i < 9) {
      this.inv = Bukkit.createInventory(null, 9, this.invName);
    } else if (i < 18) {
      this.inv = Bukkit.createInventory(null, 18, this.invName);
    } else if (i < 27) {
      this.inv = Bukkit.createInventory(null, 27, this.invName);
    } else if (i < 36) {
      this.inv = Bukkit.createInventory(null, 36, this.invName);
    } else if (i < 45) {
      this.inv = Bukkit.createInventory(null, 45, this.invName);
    } else if (i < 54) {
      this.inv = Bukkit.createInventory(null, 54, this.invName);
    }
    for (Player localPlayer : Bukkit.getOnlinePlayers())
    {
      ItemStack localItemStack = new ItemStack(Material.SKULL_ITEM, 1, (short)SkullType.PLAYER.ordinal());
      SkullMeta localSkullMeta = (SkullMeta)localItemStack.getItemMeta();
      localSkullMeta.setOwner(localPlayer.getName());
      localSkullMeta.setDisplayName(ChatColor.RED + localPlayer.getName());
      
      
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(Main.getInstance().getConfig().getString("Selector-Options.1Information").replaceAll("&", "§").replaceAll("%player%", localPlayer.getName()));
      localArrayList.add("");
      localArrayList.add(Main.getInstance().getConfig().getString("Selector-Options.Information").replaceAll("&", "§").replaceAll("%player%", localPlayer.getName()));
      localArrayList.add(Main.getInstance().getConfig().getString("Selector-Options.Name").replaceAll("&", "§").replaceAll("%player%", localPlayer.getName()));
      localArrayList.add(Main.getInstance().getConfig().getString("Selector-Options.Gamemode").replaceAll("&", "§") + localPlayer.getGameMode());
      localSkullMeta.setLore(localArrayList);
      localItemStack.setItemMeta(localSkullMeta);
      this.inv.addItem(new ItemStack[] { localItemStack });
    }
    return this.inv;
  }
  
  public void openGUI(Player paramPlayer)
  {
    Inventory localInventory = createGUI();
    paramPlayer.openInventory(localInventory);
  }
}
