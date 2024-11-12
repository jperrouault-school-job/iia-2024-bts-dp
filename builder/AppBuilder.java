package builder;

public class AppBuilder {
    public static void main(String[] args) {
        // DbConfig config = new DbConfig("127.0.0.1", 5568, "admin", "123456", "mysql");

        // DbConfig config = new DbConfig.Builder()
        DbConfig config = DbConfig.builder()
            .host("127.0.0.1")
            .port(5568)
            .type("mysql")
            .username("admin")
            .password("123456")
            .build()
        ;
    }
}
