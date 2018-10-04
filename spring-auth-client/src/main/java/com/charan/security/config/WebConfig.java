package com.charan.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		super.addViewControllers(registry);
		registry.addViewController("/").setViewName("/index");
		registry.addViewController("/index");
		registry.addViewController("/secure");
		
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/*").addResourceLocations("/resources");
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	

}