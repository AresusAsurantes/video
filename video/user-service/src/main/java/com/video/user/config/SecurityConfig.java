package com.video.user.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.DefaultLoginPageConfigurer;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 俩都得要，不然404
        // 暂时不懂什么原理
        http.csrf().disable().authorizeRequests().anyRequest().permitAll().and().logout().permitAll();
        http.removeConfigurer(DefaultLoginPageConfigurer.class);
    }
}
