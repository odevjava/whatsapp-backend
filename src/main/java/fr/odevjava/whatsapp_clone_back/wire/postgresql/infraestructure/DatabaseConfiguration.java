package fr.odevjava.whatsapp_clone_back.wire.postgresql.infraestructure;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"fr.odevjava.whatsappclone"})
@EnableJpaAuditing

public class DatabaseConfiguration {
}
