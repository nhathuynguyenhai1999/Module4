package com.codegym.blogapp.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/public/**").permitAll() // Các URL công khai
//                .anyRequest().authenticated() // Các URL khác yêu cầu xác thực
//                .and()
//                .formLogin() // Sử dụng form login
//                .loginPage("/login") // Trang đăng nhập
//                .permitAll()
//                .and()
//                .logout() // Xử lý đăng xuất
//                .permitAll();
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("user").password("{noop}password").roles("USER"); // Tạo một người dùng trong bộ nhớ để kiểm tra
//    }
//}
