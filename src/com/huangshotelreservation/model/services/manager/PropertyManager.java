package com.huangshotelreservation.model.services.manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.huangshotelreservation.model.business.exception.PropertyFileNotFoundException;

public class PropertyManager 
{
	private static Properties properties;
	
	/**
	 * Load the properties file from the file location.
	 * So the content should be available for classes in the
	 * model tier.
	 * 
	 * @param propertyFileLocation
	 * @throws PropertyFileNotFoundException
	 * @throws IOException 
	 */
	
	public static void loadProperties(String propertyFileLocation) throws PropertyFileNotFoundException{
		properties = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(propertyFileLocation);
			properties.load(fis);
			System.out.println("Property file successfully load from: "+propertyFileLocation);
			System.out.println("Property contents: "+properties.toString());
			
		}catch(FileNotFoundException fnfe) {
			System.out.println("Property file not found.");
			System.out.println("Property Contents: "+properties.toString());
		}catch(IOException ioe) {
			throw new PropertyFileNotFoundException("File input/output"
					+ "exception while loading property file. ",ioe);
		}catch(Exception e) {
			System.out.println("Exception while loading property file");
			throw new PropertyFileNotFoundException("Exception while loading"
					+ "properties file",e);
			
		}finally {
			if(fis != null) {
				try {
					fis.close();
				}catch (IOException ioe) {
					//Can't do much beside logging
					ioe.printStackTrace();
				}
			}
		}//End finally
	}//End loadProperties()
	
	static public String getPropertyValue(String key)
	{
		return properties.getProperty(key);
	}
	
}//end class propertyManager
