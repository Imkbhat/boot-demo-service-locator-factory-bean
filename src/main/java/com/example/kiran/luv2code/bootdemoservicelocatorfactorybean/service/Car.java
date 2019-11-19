package com.example.kiran.luv2code.bootdemoservicelocatorfactorybean.service;

import org.springframework.stereotype.Service;

import com.example.kiran.luv2code.bootdemoservicelocatorfactorybean.model.Vehicle;
import com.example.kiran.luv2code.bootdemoservicelocatorfactorybean.registry.AdapterService;

@Service("Car")
public class Car implements AdapterService<Vehicle> {
	
	@Override
	public void process(Vehicle request) {
		System.out.println("inside car service Vehicle Name is "+request.toString());
	}
}
