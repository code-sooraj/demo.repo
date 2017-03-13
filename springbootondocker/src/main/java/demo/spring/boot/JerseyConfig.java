package demo.spring.boot;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import demo.spring.boot.service.GuildTopicsService;

/**
 * Jersey Resource configuration.
 */
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(GuildTopicsService.class);
    }
}
