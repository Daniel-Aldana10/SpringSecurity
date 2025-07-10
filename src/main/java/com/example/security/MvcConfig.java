package com.example.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * MVC configuration class for mapping simple URL paths directly to view names without the need for a controller.
 * <p>
 * This configuration is useful for static pages or simple views that do not require backend logic.
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    /**
     * Registers view controllers that map specific URL paths to view templates.
     * <p>
     * These mappings avoid the need for explicit controller methods for each route.
     *
     * @param registry the ViewControllerRegistry used to register view controllers.
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/register").setViewName("register");
    }
}
