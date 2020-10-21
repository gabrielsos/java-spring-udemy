package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SuppressWarnings("deprecation")
@Configuration
@EnableSwagger2WebMvc
public class SwaggerConfig {
	  public static final Contact DEFAULT_CONTACT
      = new Contact("Gabriel Silva", "https://github.com/gabrielsos", "gabrielsos99@gmail.com");
	  
  public static final ApiInfo DEFAULT_API_INFO
      = new ApiInfoBuilder()
      .title("Awesome Api Title")
      .description("Awesome Api Documentation")
      .version("1.0")
      .termsOfServiceUrl("urn:tos")
	  .contact(DEFAULT_CONTACT)
      .license("Apache 2.0")
      .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
      .build();
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO);
	}
}
