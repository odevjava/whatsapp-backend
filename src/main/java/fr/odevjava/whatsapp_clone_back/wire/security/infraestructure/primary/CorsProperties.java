package fr.odevjava.whatsapp_clone_back.wire.security.infraestructure.primary;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;

@Configuration
public class CorsProperties {

    @Bean
    @ConfigurationProperties(prefix = "application.cors", ignoreInvalidFields = false)
    public CorsConfiguration corsConfiguration() {
        return new CorsConfiguration();
    }

}
