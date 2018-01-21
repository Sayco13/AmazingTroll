package io.github.Sayco13.atroll;

import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class Cooldown
  extends BukkitRunnable
{
  Main plugin;
  Player c;
  
  Cooldown(Main pl, Player cont)
  {
    this.plugin = pl;
    this.c = cont;
  }
  
  @Override
  public void run()
  {
    this.plugin.cd.remove(this.c.getName());
    cancel();
  }
}