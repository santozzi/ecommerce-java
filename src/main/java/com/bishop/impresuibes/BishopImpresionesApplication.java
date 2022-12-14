package com.bishop.impresuibes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BishopImpresionesApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(BishopImpresionesApplication.class, args);
	}

	  //metodo agregado
	  @Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(BishopImpresionesApplication.class);
	  }


	  @Bean
	  public WebMvcConfigurer corsConfigurer() {
	      return new WebMvcConfigurer() {
	          @Override
	          public void addCorsMappings(CorsRegistry registry) {

	  registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST","PUT", "DELETE");
	          }
	      };
	  }
	
}
