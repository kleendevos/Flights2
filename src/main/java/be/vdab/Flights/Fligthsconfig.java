package be.vdab.Flights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Configuration
public class Fligthsconfig {

    @Bean
    public DataSource dataSource () {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setUrl("jdbc:mysql://localhost:3306/Flights");
        ds.setUsername("root");
        ds.setPassword("");
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        return ds;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityMananger (DataSource ds, JpaVendorAdapter jva){
        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
        emf.setDataSource(ds);
        emf.setJpaVendorAdapter(jva);
        emf.setPackagesToScan("be.vdab.Flights");
        return emf;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter () {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setGenerateDdl(true);
        adapter.setShowSql(true);
        return adapter;
    }
    @Bean
    public PlatformTransactionManager transactionManager (EntityManagerFactory emf){
        return new JpaTransactionManager(emf);

    }
//
//    @Bean
//    public String myCoolBean() {
//        return "cool bean";
//    }
//
//
//    @Bean
//    public String myOtherBean() {
//        return "Something Else";
//    }
//
//    @Bean
//    public PassengerService myPassengerService (PassengerRepository pr){
//        return new PassengerService(pr);
//    }
//
//    @Bean
//    public PassengerRepository myPassengerRepository (){
//        return new PassengerRepository();
//    }
//
//
}
