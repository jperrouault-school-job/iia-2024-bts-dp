package factory;

public class AppFactory {
    public static void main(String[] args) {
        DbConfig config = new DbConfig();

        config.setHost("localhost");
        config.setPort(3335);

        // String mysqlCS = "mysql://" + config.getHost() + ":" + config.getPort();
        // String postgresCS = "postgresql://" + config.getHost() + ":" + config.getPort();
        String mysqlCS = ConnectionStringFactory.createConnectionString("mysql", config);
        String postgresCS = ConnectionStringFactory.createConnectionString("postgresql", config);

        System.out.println(mysqlCS);
        System.out.println(postgresCS);
    }
}
