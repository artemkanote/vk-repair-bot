package com.repairbot;
import java.io.IOException;
import java.util.Properties;
public class Config {
    private static Properties properties = new Properties();
    static {
        try {
            properties.load(Config.class.getClassLoader()
                    .getResourceAsStream("config.properties"));
        } catch (IOException e) {
            System.err.println("Error loading config: " + e.getMessage());
        }
    }
    public static String getGroupToken() {
        return properties.getProperty("group.token");
    }
    public static String getGroupId() {
        return properties.getProperty("group.id");
    }
    public static Integer getAdminUserId() {
        return Integer.parseInt(properties.getProperty("admin.user.id"));
    }
    public static String getConfirmationToken() {
        return properties.getProperty("confirmation.token");
    }
    public static String getApiVersion() {
        return properties.getProperty("api.version", "5.131");
    }
}