package com.example.exampleloginwithgithub.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;

@Controller
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        http.cors().and().csrf().disable();

        http.formLogin().permitAll();

        http.authorizeHttpRequests().anyRequest().authenticated();

        http.oauth2Login();

        return http.build();
    }
}
