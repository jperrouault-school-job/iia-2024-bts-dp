package builder;

public class DbConfig {
    private String host;
    private int port;
    private String username;
    private String password;
    private String type;

    // public DbConfig(String host, int port, String type, String username, String password) {
    //     this.host = host;
    //     this.port = port;
    //     this.username = username;
    //     this.password = password;
    //     this.type = type;
    // }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private DbConfig instance = new DbConfig();

        public DbConfig build() {
            return this.instance;
        }

        public Builder reset() {
            this.instance = new DbConfig();
            return this;
        }

        public Builder host(String host) {
            this.instance.host = host;
            return this;
        }

        public Builder port(int port) {
            this.instance.port = port;
            return this;
        }

        public Builder username(String username) {
            this.instance.username = username;
            return this;
        }

        public Builder password(String password) {
            this.instance.password = password;
            return this;
        }

        public Builder type(String type) {
            this.instance.type = type;
            return this;
        }
    }
}
