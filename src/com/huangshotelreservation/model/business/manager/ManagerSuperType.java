package com.huangshotelreservation.model.business.manager;

import java.util.ArrayList;

import com.huangshotelreservation.model.business.exception.PropertyFileNotFoundException;
import com.huangshotelreservation.model.domain.City;
import com.huangshotelreservation.model.domain.ReserveRoom;
import com.huangshotelreservation.model.domain.Room;
import com.huangshotelreservation.model.services.manager.PropertyManager;

/**
 * Applying manager for best practice.
 * @author Zhijie Huang
 *
 */
public abstract class ManagerSuperType {

	/**
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
	
	/**
	 * Generic method that all clients of this class can call to perform certain actions.
	 * @param commandString
	 * @param availableRoomList
	 * @param city
	 * @param room
	 * @return 
	 * 			false 
	 * 				 if action failed
	 * 			true
	 * 				 if action is successful
	 * 				
	 */
	
	public abstract boolean performAction(String commandString,
			ArrayList<Room> availableRoomList,City city,Room room,ReserveRoom reserveRoom);

	/**
	 * Loads the property file into memory.
	 * @throws PropertyFileNotFoundException
	 */
	public static void loadProperties() throws PropertyFileNotFoundException{
		String propertyFileLocation = System.getProperty("propLocation");
		if(propertyFileLocation != null) {
			//Now we have successfully loaded the property file,
			//use propertyManager class to load it up.
			PropertyManager.loadProperties(propertyFileLocation);
		}else {
			System.out.println("Property file location not set.\n"
					+ "Passed in value is "+ propertyFileLocation + ".");
			throw new PropertyFileNotFoundException("Property file locaiton"
					+ "not set",null);
		}
	}// end loadProperties
	
}
