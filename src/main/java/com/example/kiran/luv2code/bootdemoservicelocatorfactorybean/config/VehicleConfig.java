package com.example.kiran.luv2code.bootdemoservicelocatorfactorybean.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.kiran.luv2code.bootdemoservicelocatorfactorybean.registry.ServiceRegistry;

@Configuration
public class VehicleConfig {
	
	@Bean
	public FactoryBean<?> factoryBean() {
		final ServiceLocatorFactoryBean bean = new ServiceLocatorFactoryBean();
		bean.setServiceLocatorInterface(ServiceRegistry.class);
		return bean;
	}
}
