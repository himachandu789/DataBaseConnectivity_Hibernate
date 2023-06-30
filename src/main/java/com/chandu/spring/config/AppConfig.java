package com.chandu.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import com.chandu.spring.DAO.AppDAOImpl;
import javax.sql.DataSource;

@Configuration
public class AppConfig {

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydatabase?useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("chandu@789");

        return dataSource;
    }

    @Bean(name = "DAOBean")
    public AppDAOImpl appDAO() {
        return new AppDAOImpl(getDataSource());
    }
}
