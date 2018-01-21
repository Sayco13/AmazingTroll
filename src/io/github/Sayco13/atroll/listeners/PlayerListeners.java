package io.github.Sayco13.atroll.listeners;

import io.github.Sayco13.atroll.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerListeners
  implements Listener
{
  public Main plugin;
  
  public PlayerListeners(Main plugin)
  {
    this.plugin = plugin;
  }
  
  @EventHandler
  public void onPlayerMove(PlayerMoveEvent e)
  {
    Player p = e.getPlayer();
    if (TrollListeners.freeze.contains(e.getPlayer())) {
      e.setCancelled(true);
    }
  }
}
