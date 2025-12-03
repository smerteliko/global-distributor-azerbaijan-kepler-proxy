package com.gda.kepler.proxy.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;

@Configuration
public class OpenApiI18nConfig {

    @Bean
    public static MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

//    // 2. EN Locale Resolver
//    @Bean
//    public WebProperties.LocaleResolver localeResolverEn() {
//        return new FixedLocaleResolver(Locale.ENGLISH);
//    }
//
//    // 3. RU Locale Resolver
//    @Bean
//    public WebProperties.LocaleResolver localeResolverRu() {
//        return new FixedLocaleResolver(new Locale("ru"));
//    }

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Knowledge direct API")
                .version("1.0")
                .description("API documentation for Knowledge direct API")
                .contact(new Contact()
                    .name("Support")
                    .email("nikolay.alex.makarov@gmail.com")
                )
                .summary("API documentation for Knowledge direct API")
                .termsOfService("http://localhost:8080/terms-of-service.html")
                .license(new License().name("Knowledge direct API").url("http://localhost:8080/license.html"))
            );
    }

    // 4. English Documentation Group: /api-docs/en
//    @Bean
//    public GroupedOpenApi englishApi() {
//        return GroupedOpenApi.builder()
//            .group("en")
//            .pathsToMatch("/**").displayName("English API")
//            .addOpenApiCustomizer(createCustomizer(Locale.ENGLISH, "en"))
//            .build();
//    }
//
//    @Bean
//    public GroupedOpenApi russianApi() {
//        return GroupedOpenApi.builder()
//            .group("ru")
//            .pathsToMatch("/**").displayName("Russian")
//            .addOpenApiCustomizer(createCustomizer(new Locale("ru"), "ru"))
//            .build();
//    }

    @Bean
    public GroupedOpenApi Refineries(MessageSource messageSource) {
        return GroupedOpenApi.builder()
            .group("Refineries")
            .displayName("Refineries")
            .pathsToMatch("/v2/refineries/**")
            .addOpenApiCustomizer(
                createCustomizer(messageSource, new Locale("ru"), "Refineries")
            )
            .build();
    }

    private OpenApiCustomizer createCustomizer(MessageSource messageSource,Locale locale, String groupName) {
        return openApi -> {
            openApi.setInfo(new Info()
                .title(messageSource.getMessage("doc.title." + groupName, null, locale))
                .version(messageSource.getMessage("doc.version." + groupName, null, locale))
                .description(messageSource.getMessage("doc.description." + groupName, null, locale))
                .summary(messageSource.getMessage("doc.summary." + groupName, null, locale))
                .contact(new Contact()
                    .name("Support")
                    .email("nikolay.alex.makarov@gmail.com")
                )
                .termsOfService("http://localhost:8080/terms-of-service.html")
                .license(new License().name("Knowledge direct API").url("http://localhost:8080/license.html"))
            );

            openApi.getTags().forEach(tag -> {
                String tagNameKey = tag.getName().toLowerCase()
                    .replaceAll("api", "")
                    .replaceAll("\\s|\\(|\\)", "")
                    .replaceAll("proxy", "")
                    .trim();

                String i18nKey = "doc.tag." + tagNameKey + "." + groupName;
                try {
                    tag.setDescription(messageSource.getMessage(i18nKey, null, locale));
                } catch (Exception e) {
                    // Используем имя тега по умолчанию, если перевод не найден
                }
            });
        };
    }
}