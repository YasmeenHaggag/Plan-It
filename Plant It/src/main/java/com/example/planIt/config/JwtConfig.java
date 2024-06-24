//package com.example.planIt.config;
//
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class JwtConfig {
//
//    @Bean
//    public FilterRegistrationBean<JwtTokenFilter> jwtFilter() {
//        FilterRegistrationBean<JwtTokenFilter> registrationBean = new FilterRegistrationBean<>();
//        registrationBean.setFilter(new JwtTokenFilter());
//        registrationBean.addUrlPatterns("/tourist/*"); // Adjust the URL pattern as needed
//
//        return registrationBean;
//    }
//}
