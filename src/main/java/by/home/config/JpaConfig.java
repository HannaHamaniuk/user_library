package by.home.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@EnableJpaRepositories
public class JpaConfig {
    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        return new HibernateJpaVendorAdapter();
    }
    @Bean(name="entityManageFactory")
    public LocalContainerEntityManagerFactoryBean factoryBean(JpaVendorAdapter jpaVendorAdapter){
        LocalContainerEntityManagerFactoryBean localContainer = new LocalContainerEntityManagerFactoryBean();
        localContainer.setJpaVendorAdapter(jpaVendorAdapter);
        localContainer.setPackagesToScan("by.home.model.entities");
        return localContainer;
    }
}
