package com.HuangsHotelReservation.model.business.exception.manager;

import com.HuangsHotelReservation.model.business.exception.PropertyFileNotFoundException;
import com.sun.org.apache.xerces.internal.impl.PropertyManager;

public abstract class ManagerSuperType {

	/*
	 * static initializer block
	 * This get executed at the time when the class that contains it or extends it\
	 * referenced.
	 */
	static
	{
		try 
		{
			ManagerSuperType.loadProperties();
		}catch(PropertyFileNotFoundException pfnfe) {
			System.out.println("Application properties failed to loaded.\n"
					+ "Application existing.");
		}
		}

	public static void loadProperties() throws PropertyFileNotFoundException{
		// TODO Auto-generated method stub
		String propertyFileLocation = System.getProperty("propLocation");
		if(propertyFileLocation != null) {
			//Now we have successfully loaded the property file,
			//use propertyManager class to load it up.
			PropertyManager.loadProperties(propertyFileLocation);
		}else {
			System.out.println("Property file location not set.\n"
					+ "Passed in value is "propertyFileLocation + ".");
		}
	}
	
}
