package com.HuangsHotelReservation.model.services.factory;

import com.HuangsHotelReservation.model.business.exception.ServiceLoadException;
import com.HuangsHotelReservation.model.services.IService;
import com.HuangsHotelReservation.model.services.manager.PropertyManager;

/**
 * 
 * @author Jay Huang
 * This factory taking a string name of a service, creates a class equivalent of it and 
 * returns it in this class interface form.
 *
 */
public class ServiceFactory 
{
	// Singleton Pattern:
	//Make the constructor private
	private ServiceFactory() {
	}
	
	//Call new on constructor
	private static ServiceFactory serviceFactory = new ServiceFactory();
	
	//create getInstance method to return serviceFactory
	public static ServiceFactory getInstance() {
		return serviceFactory;
	}
	
	/**
	 * 
	 * @param serviceName
	 * @return
	 * @throws ServiceLoadException
	 */
	public IService getService(String serviceName) throws ServiceLoadException{
		try {
			//<?> is a wild card, it can be any type
			Class<?> c = Class.forName(getImplName(serviceName));
			return (IService) c.newInstance();
		}catch(Exception e) {
			String errorMessage = serviceName + " not loaded";
			throw new ServiceLoadException(errorMessage,e);
		}
	}

	/* More robust way to take the property file is to
	*  use -D option in eclipse to load the property file.
	*  So the operator can pass in the above -D option with the java command.
	*/
	
	/* Using alternative way to load property file through property manager file
	private String getImplName(String serviceName) throws IOException {
		java.util.Properties prop = new java.util.Properties();
		
		String propertyFileLoc = System.getProperty("propLocation");
		
		System.out.println("Property file location is : "
				+ propertyFileLoc);
		java.io.FileInputStream fis = new java.io.FileInputStream(propertyFileLoc);
		
		prop.load(fis);
		fis.close();
		
		return prop.getProperty(serviceName);
	}
	*/
	
	private String getImplName(String serviceName) throws Exception{
		return PropertyManager.getPropertyValue(serviceName);
	}
	
}//end Service Factory
