package com.it.config;

import com.it.bean.JamesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ch
 * @date 2021-2-19
 */
@Configuration
public class Cap6MainConfig {

    @Bean
    public JamesFactoryBean jamesFactoryBean(){
        return new JamesFactoryBean();
    }

}
