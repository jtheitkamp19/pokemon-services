package com.uneventomcat.pokemonservices.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
    /*@Value("${DB_URL}")
    private String databaseURL;

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url(databaseURL);

        System.out.println("Custom Datasource set");
        return builder.build();
    }*/
}
