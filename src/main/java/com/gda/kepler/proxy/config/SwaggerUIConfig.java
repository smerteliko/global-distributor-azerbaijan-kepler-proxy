package com.gda.kepler.proxy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.ResourceHandlerRegistry;

@Configuration
public class SwaggerUIConfig {

//    @Bean
//    public WebMvcConfigurer swaggerUiConfig() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addResourceHandlers(ResourceHandlerRegistry registry) {
//                registry.addResourceHandler("/docs/**") // More specific mapping
//                    .addResourceLocations("classpath:/swagger/");
//                registry.addResourceHandler("/webjars/**")
//                    .addResourceLocations("classpath:/META-INF/resources/webjars/");
//            }
//
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**")
//                    .allowedOrigins("*")
//                    .allowedMethods("*")
//                    .allowedHeaders("*");
//            }
//        };
//    }
}
