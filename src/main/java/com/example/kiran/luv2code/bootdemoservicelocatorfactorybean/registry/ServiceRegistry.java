package com.example.kiran.luv2code.bootdemoservicelocatorfactorybean.registry;

public interface ServiceRegistry {
	public <T> AdapterService<T> getService(String serviceName);
}
