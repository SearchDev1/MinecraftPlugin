import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;git --version

public class MyPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Sunucu açıldığında bu kısmı çalıştır
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("Eklentim başarıyla aktif edildi!");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // Oyuncu girdiğinde mesaj gönderir
        event.getPlayer().sendMessage("Sunucumuza Hoşgeldin, " + event.getPlayer().getName() + '!');
    }
}