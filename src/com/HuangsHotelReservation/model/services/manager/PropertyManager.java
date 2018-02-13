package com.HuangsHotelReservation.model.services.manager;

import java.io.FileInputStream;
import java.util.Properties;

import com.HuangsHotelReservation.model.business.exception.PropertyFileNotFoundException;

public class PropertyManager {
	private static Properties properties;
	
	public static void loadProperties(String propertyFileLocation) throws PropertyFileNotFoundException{
		properties = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(propertyFileLocation);
			properties.load(fis);
			System.out.println("Property file successfully load from: "+propertyFileLocation);
			System.out.println("Property contents: "+properties.toString());
			
		}catch() {
			
		}
	}
}
