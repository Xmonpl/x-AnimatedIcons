package tk.xmon.animatedicons;

import com.google.gson.annotations.SerializedName;

public class Instance {
    @SerializedName("virutal-server-id")
    private int virtualServerId;
    @SerializedName("query-password")
    private String password;
    @SerializedName("query-address")
    private String ip;
    @SerializedName("query-port")
    private int port;
    @SerializedName("query-login")
    private String queryLogin;
    @SerializedName("groupid-id")
    private int groupid;
    @SerializedName("icons-id")
    private int[] iconid;
    @SerializedName("ms")
    private int ms;
    @SerializedName("debug")
    private boolean debug;

    public Instance(){
        this.virtualServerId = 1;
        this.ip = "127.0.0.1";
        this.queryLogin = "serveradmin";
        this.password = "passwd";
        this.port = 10011;
        this.groupid = 123;
        this.ms = 250;
        this.iconid = new int[]{
                (int) 2233609972L,
                (int) 152560062L,
                (int) 3436518964L,
                (int) 1999095658L,
                (int) 2530830093L,
                (int) 2255704170L,
                (int) 2016054964L,
                (int) 3606988156L};
        this.debug = false;
    }

    public int getVirtualServerId() {
        return virtualServerId;
    }
    public String getPassword() {
        return password;
    }
    public boolean getDebug(){
        return debug;
    }
    public String getQueryIp(){
        return ip;
    }
    public int getPort() {
        return port;
    }
    public int getMs(){
        return ms;
    }
    public String getQueryLogin() {
        return queryLogin;
    }
    public int getGroupid() {
        return groupid;
    }
    public int[] getIconid(){
        return iconid;
    }
}
