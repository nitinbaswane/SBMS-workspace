package com.nb.config;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "com.nb")
@EnableTransactionManagement
public class AppConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/sbms1_db");
        ds.setUsername("root");
        ds.setPassword("nitin@N33");
        return ds;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactoryBean() {
        LocalSessionFactoryBean factoryBean =new LocalSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        factoryBean.setPackagesToScan("com.nb.entity");
        Properties props= new Properties();
        props.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        props.put("hibernate.hbm2ddl.auto", "update");
        props.put("hibernate.show_sql", "true");
        props.put("hibernate.format_sql","true");

        factoryBean.setHibernateProperties(props);

        return  factoryBean;

    }

    @Bean
    public HibernateTemplate hibernateTemplate(SessionFactory sessionFactory){

        return new HibernateTemplate(sessionFactory);
    }

    @Bean
    public HibernateTransactionManager transactionManager(
            SessionFactory sessionFactory){

        return new HibernateTransactionManager(sessionFactory);
    }
}
