package factory;

public class ConnectionStringFactory {
    public static String createConnectionString(String type, DbConfig config) {
        return "jdbc:" + type + "://" + config.getHost() + ":" + config.getPort();
    }
}
