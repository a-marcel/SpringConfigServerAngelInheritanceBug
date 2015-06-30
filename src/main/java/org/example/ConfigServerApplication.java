package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

@Configuration
@EnableAutoConfiguration
@EnableConfigServer
public class ConfigServerApplication
{

    public static void main( String[] args )
    {
        SpringApplication app = new SpringApplication( ConfigServerApplication.class );
        app.setDefaultProperties( StringUtils.splitArrayElementsIntoProperties( new String[] { "server.port=8888",
            "spring.profiles.active=native", "security.user.name=user", "security.user.password=pass",
            "spring.main.show_banner=false" }, "=" ) );
        app.run( args );
    }
}
