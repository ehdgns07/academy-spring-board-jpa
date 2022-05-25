package com.nhnacademy.springjpa.config;

import com.nhnacademy.springjpa.controller.ControllerBase;
import com.nhnacademy.springjpa.interceptor.LoginCheckInterceptor;
import java.util.List;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

@EnableWebMvc
@Configuration
@ComponentScan(basePackageClasses = ControllerBase.class)
@EnableSpringDataWebSupport
public class WebConfig implements WebMvcConfigurer {
    // private ApplicationContext applicationContext;
    // private MessageSource messageSource;
    //
    // @Override
    // public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    //     this.applicationContext = applicationContext;
    // }
    //
    // @Override
    // public void setMessageSource(MessageSource messageSource) {
    //     this.messageSource = messageSource;
    // }
    //
    // @Override
    // public void configureViewResolvers(ViewResolverRegistry registry) {
    //     registry.viewResolver(thymeleafViewResolver());
    // }
    //
    // @Bean
    // public ViewResolver thymeleafViewResolver(){
    //     ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver();
    //     thymeleafViewResolver.setTemplateEngine(templateEngine());
    //     thymeleafViewResolver.setCharacterEncoding("UTF-8");
    //     thymeleafViewResolver.setOrder(1);
    //     return thymeleafViewResolver;
    // }
    //
    // public SpringTemplateEngine templateEngine(){
    //     SpringTemplateEngine templateEngine = new SpringTemplateEngine();
    //     templateEngine.setTemplateResolver(templateResolver());
    //     templateEngine.setTemplateEngineMessageSource(messageSource);
    //     return templateEngine;
    // }

    // public SpringResourceTemplateResolver templateResolver(){
    //     SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
    //     templateResolver.setApplicationContext(applicationContext);
    //     templateResolver.setCharacterEncoding("UTF-8");
    //     templateResolver.setPrefix("/WEB-INF/views/");
    //     templateResolver.setSuffix(".html");
    //     templateResolver.setTemplateMode(TemplateMode.HTML);
    //     templateResolver.
    //     return templateResolver;
    // }

    // @Bean
    // RequestMappingHandlerAdapter requestMappingHandlerAdapter(){
    //     RequestMappingHandlerAdapter requestMappingHandlerAdapter = new RequestMappingHandlerAdapter();
    //     requestMappingHandlerAdapter.setIgnoreDefaultModelOnRedirect(true);
    //     return requestMappingHandlerAdapter;
    // }

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
