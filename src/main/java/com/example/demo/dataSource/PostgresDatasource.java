package com.example.demo.dataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class PostgresDatasource {

    @Bean
    @Configuration("app.datasource")
    public class PostgresDataSource{

        public HikariDataSource hikariDataSource(){
            return DataSourceBuilder
                    .create()
                    .type(HikariDataSource.class)
                    .build();
        }

    }
}

