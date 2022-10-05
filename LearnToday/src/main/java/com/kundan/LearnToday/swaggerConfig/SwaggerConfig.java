package com.kundan.LearnToday.swaggerConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
	
	@Bean
	public Docket postsApi() {
    return new Docket (DocumentationType.SWAGGER_2 )
	.groupName("com.kundan")
	.apiInfo(apiInfo())
	.select()
	.paths(PathSelectors.any())
	.build();
	}
	public ApiInfo apiInfo() {
	return new ApiInfoBuilder().title("LearnToday")
	.description("Learn Today Application")
	.termsOfServiceUrl("https://www.luxoft.com/terms")
	.license ("Licence @ Luxoft")
	.licenseUrl("https://www.luxoft.com/licence")
	.version("1.0.0")
	.build();
	
	
}

}
