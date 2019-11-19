package com.example.kiran.luv2code.bootdemoservicelocatorfactorybean.service;

import org.springframework.stereotype.Service;

import com.example.kiran.luv2code.bootdemoservicelocatorfactorybean.model.Vehicle;
import com.example.kiran.luv2code.bootdemoservicelocatorfactorybean.registry.AdapterService;

@Service("Truck")
public class Truck implements AdapterService<Vehicle>{
	
	@Override
	public void process(Vehicle request) {
		System.out.println("inside truck service Vehicle Name is "+request.toString());
	}
}
