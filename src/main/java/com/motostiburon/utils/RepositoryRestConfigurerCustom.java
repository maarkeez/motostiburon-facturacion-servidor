package com.motostiburon.utils;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

public class RepositoryRestConfigurerCustom extends RepositoryRestConfigurerAdapter {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.getCorsRegistry().addMapping("/**").allowedOrigins("*");
	}

}