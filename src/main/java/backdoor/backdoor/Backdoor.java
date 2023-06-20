package backdoor.backdoor;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Backdoor extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("backdoor active lol");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("backdoor failure");
    }
}
