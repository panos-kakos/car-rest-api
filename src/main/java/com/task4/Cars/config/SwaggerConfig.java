package com.task4.Cars.config;


import com.task4.Cars.api.CarsRestController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;


@Configuration
@EnableSwagger2
@ComponentScan(basePackageClasses = {
        CarsRestController.class
})
public class SwaggerConfig {


    private Contact contact = new Contact("Panos","panos.com", "pkakos1992@gmail.com" );

    private ApiInfo apiInfo = new ApiInfo("Cars resource",
            "Operations pertaining to Cars resource",
            "1.0",
            "",
            contact,
            "Internal company use only",
            "", new ArrayList<>());

    /**
     * A builder which is intended to be the primary interface into the swagger-springmvc framework.
     * Provides sensible defaults and convenience methods for configuration.
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.task4.Cars.api"))
                .paths(PathSelectors.any())
                .build();
    }
}
