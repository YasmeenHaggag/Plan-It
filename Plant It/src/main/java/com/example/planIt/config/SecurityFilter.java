//package com.example.planIt.config;
//
//import com.example.YaRab.entity.Permissions;
//import com.example.YaRab.service.JwtAuthFilter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityFilter {
//    @Autowired
//    AuthenticationProvider authenticationProvider;
//    @Autowired
//    JwtAuthFilter jwtAuthFilter;
//
//
////    @Bean
////    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
////
////        http
////                .csrf(csrfConfig -> csrfConfig.disable())
////                .sessionManagement(sessionMangConfig -> sessionMangConfig.sessionCreationPolicy
////                        (SessionCreationPolicy.STATELESS))
////                .authenticationProvider(authenticationProvider)
////                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)
////                .authorizeHttpRequests( authConfig -> {
////                    authConfig.requestMatchers(HttpMethod.POST, "/auth/authenticate").permitAll();
////                    authConfig.requestMatchers(HttpMethod.POST, "/auth/register").permitAll();
////                    authConfig.requestMatchers(HttpMethod.POST, "/auth/generate-otp").permitAll();
////                    authConfig.requestMatchers(HttpMethod.POST, "/auth/validate-otp").permitAll();
////                    authConfig.requestMatchers("/error").permitAll();
////                    authConfig.requestMatchers(HttpMethod.GET, "/products").hasAuthority(Permissions.READ_ALL_PRODUCTS.name());
////                    authConfig.requestMatchers(HttpMethod.POST, "/products").hasAuthority(Permissions.SAVE_PRODUCT.name());
////                    authConfig.anyRequest().denyAll();
////                });
////        return http.build();
////    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(csrf -> csrf.disable())
//                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                .authenticationProvider(authenticationProvider)
//                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)
//                .authorizeHttpRequests(auth -> {
//                    auth.requestMatchers(HttpMethod.POST, "/auth/authenticate").permitAll();
//                    auth.requestMatchers(HttpMethod.POST, "/auth/register").permitAll();
//                    auth.requestMatchers(HttpMethod.POST, "/auth/generate-otp").permitAll();
//                    auth.requestMatchers(HttpMethod.POST, "/auth/validate-otp").permitAll();
//                    auth.requestMatchers("/error").permitAll();
//                    auth.requestMatchers(HttpMethod.GET, "/products").hasAuthority(Permissions.READ_ALL_PRODUCTS.name());
//                    auth.requestMatchers(HttpMethod.POST, "/products").hasAuthority(Permissions.SAVE_PRODUCT.name());
//                    auth.anyRequest().denyAll();
//                });
//        return http.build();
//    }
//}
