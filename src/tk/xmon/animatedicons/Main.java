package tk.xmon.animatedicons;

import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;

public class Main {
    public static void main(String[] args){
            long start = System.currentTimeMillis();
            System.out.println("Ładowanie configu..");
            ConfigManager configManager = new ConfigManager();
            Config c = ConfigManager.getConfig();
            System.out.println("Config załadowano poprawnie!");

            System.out.println("Trwa łączenie..");
            final TS3Config config = new TS3Config();
            config.setHost(c.getInstance().getQueryIp());
            config.setQueryPort(c.getInstance().getPort());
            config.setEnableCommunicationsLogging(c.getInstance().getDebug());
            final TS3Query query = new TS3Query(config);
            query.connect();
            System.out.println("Połączono poprawnie");

            System.out.println("Trwa logowanie..");
            final TS3Api api = query.getApi();
            api.login(c.getInstance().getQueryLogin(), c.getInstance().getPassword());
            api.selectVirtualServerById(c.getInstance().getVirtualServerId());
            api.setNickname("x-AnimatedIcons");
            System.out.println("Logowanie przebiegło pomyślnie!");
            System.out.println("Uruchomiono w " + (System.currentTimeMillis() - start) + "ms!");
            System.out.println("x-AnimatedIcons created by Xmon for PlayTS.eu (https://github.com/xmonpl)");
            int id = 0;
            try {
                while (true) {
                    if (id >= c.getInstance().getIconid().length) {
                        id = 0;
                    }
                    if (c.getInstance().getDebug()) {
                        System.out.println("[" + id + "]");
                    }
                    api.addServerGroupPermission(c.getInstance().getGroupid(), "i_icon_id", c.getInstance().getIconid()[id], false, false);
                    Thread.sleep(c.getInstance().getMs());
                    ++id;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}
