package ir.server;

import java.util.Date;

public class Version {
    public static final String AppServerVersion = "1.0.0";
    public static final String AppServerBuild   = "1";
    public static final String AppServerMessage = "CSI4900 Honours Project";
    public static Date         upSince          = null;

    public static String showInfo() {
        return String.format("App Server Verion: %s\nBuild#: %s\nUpSince: %d",
                AppServerVersion, AppServerBuild, upSince);
    }
}
