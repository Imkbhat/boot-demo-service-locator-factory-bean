package com.example.kiran.luv2code.bootdemoservicelocatorfactorybean.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kiran.luv2code.bootdemoservicelocatorfactorybean.model.Vehicle;
import com.example.kiran.luv2code.bootdemoservicelocatorfactorybean.registry.ServiceRegistry;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	
	@Autowired
	private ServiceRegistry registry;
	
	@PostMapping
	public void processVehicleDetails(@RequestBody Vehicle vehicle) {
		registry.getService(vehicle.getVehicleType()).process(vehicle);
	}
}
