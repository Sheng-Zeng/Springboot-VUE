package com.ccb.ems.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;  
//解决跨域问题
@Configuration  
public class CorsConfig extends WebMvcConfigurerAdapter {  

    @Override  
    public void addCorsMappings(CorsRegistry registry) {  
        registry.addMapping("/**")  
                .allowedOrigins("*")  
                .allowedHeaders("*")
                .allowCredentials(true)  
                .allowedMethods("*")  
                .maxAge(3600);  
    }  

}