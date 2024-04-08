package com.codegym.module4.springconfigemail.Configuration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
@EnableWebMvc
public class WebMVCConfig implements WebMvcConfigurer {
    public void configureViewResolver(ViewResolverRegistry registry){
        registry.jsp("/WEB-INF/views/",".jsp");
    }
}
