package org.example;

import java.util.logging.Logger;

public class SimpleDatabase {
    Logger logger = Logger.getLogger("com.api.jar");
    private static  SimpleDatabase sd;
    private String connection;
    private SimpleDatabase(String newConnection) {
        this.connection = newConnection;
    }
    public static SimpleDatabase getInstance(String newConnection) {
        if (sd == null) {
            sd = new SimpleDatabase(newConnection);
        }
        return sd;
    }

    public void newConnection(String newConnection) {
        this.connection = newConnection;
        String c = "Database connected : " + connection;
        logger.info(c);
    }

    public void closeConnection() {
        connection = "closed";
        logger.info("All connections are closed");
    }

    public String getConnection() {
        return connection;
    }
}

