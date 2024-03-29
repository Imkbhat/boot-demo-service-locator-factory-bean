package com.example.kiran.luv2code.bootdemoservicelocatorfactorybean.model;

import java.io.Serializable;

public class Vehicle implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String vehicleName;
	private String vehicleType;
	
	public Vehicle() {

	}

	public Vehicle(String vehicleName, String vehicleType) {
		super();
		this.vehicleName = vehicleName;
		this.vehicleType = vehicleType;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleName=" + vehicleName + ", vehicleType=" + vehicleType + "]";
	}
}
