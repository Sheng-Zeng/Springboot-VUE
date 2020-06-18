package com.ccb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@Configuration
public class BeansConfig {

    @Bean
    public Calendar getCalendar() {
        return Calendar.getInstance();
    }

}
