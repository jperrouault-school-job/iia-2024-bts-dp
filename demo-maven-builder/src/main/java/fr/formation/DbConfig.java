package fr.formation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DbConfig {
    private String host;
    private int port;
    private String username;
    private String password;
    private String type;
}
