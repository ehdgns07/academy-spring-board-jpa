package com.nhnacademy.springjpa.config;

import com.nhnacademy.springjpa.controller.ControllerBase;
import com.nhnacademy.springjpa.interceptor.LoginCheckInterceptor;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@EnableWebMvc
@Configuration
@ComponentScan(basePackageClasses = ControllerBase.class)
@EnableSpringDataWebSupport
public class WebConfig implements WebMvcConfigurer{

    // @Override
    // public void addInterceptors(InterceptorRegistry registry) {
    //     registry.addInterceptor(new LoginCheckInterceptor())
    //             .excludePathPatterns("/login");
    // }

    // @Override
    // public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
    //     argumentResolvers.add( new PageableHandlerMethodArgumentResolver());
    // }

}
