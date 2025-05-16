//package com.example.trananhduong_ph55491_j6.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
public class Config {
//
//    @Bean
//    public UserDetailsService userDetailsService(){
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//
//        manager.createUser(
//                User.withUsername("user")
//                        .password("{noop}123")
//                        .roles("USER")
//                        .build()
//        );
//
//        manager.createUser(
//                User.withUsername("admin")
//                        .password("{noop}123")
//                        .roles("ADMIN")
//                        .build()
//        );
//        return manager;
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
//        http.csrf(csrf ->
//                {
//                    try {
//                        csrf.disable()
//                                .authorizeHttpRequests(auth -> auth
//                                        .requestMatchers("/sach/admin/**").hasRole("ADMIN")
//                                        .requestMatchers("/sach/**").hasRole("USER")
//                                        .anyRequest().permitAll()
//                                )
//                                .formLogin(login ->
//                                        login.loginProcessingUrl("/login")
//                                                .defaultSuccessUrl("/sach/phan-trang"));
//                    } catch (Exception e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//        );
//        return http.build();
    }
//}
