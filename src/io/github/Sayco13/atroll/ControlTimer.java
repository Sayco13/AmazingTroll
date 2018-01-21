package io.github.Sayco13.atroll;

import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class ControlTimer
  extends BukkitRunnable
{
  Player c;
  Player v;
  Main plugin;
  
  ControlTimer(Player controller, Player victim, Main pl)
  {
    this.c = controller;
    this.v = victim;
    this.plugin = pl;
  }
 
  @Override
  public void run()
  {
    if ((this.c != null) && (this.v != null)) {
      this.plugin.stopControlling(this.v, this.c);
    }
    cancel();
  }
}
