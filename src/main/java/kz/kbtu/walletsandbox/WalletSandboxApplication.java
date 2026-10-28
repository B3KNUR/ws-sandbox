package kz.kbtu.walletsandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class WalletSandboxApplication {

    public static void main(String[] args) {
        SpringApplication.run(WalletSandboxApplication.class, args);
    }

}
