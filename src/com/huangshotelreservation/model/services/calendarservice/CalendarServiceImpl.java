package com.huangshotelreservation.model.services.calendarservice;

import java.io.ObjectInputStream;

import com.huangshotelreservation.model.domain.City;
import com.huangshotelreservation.model.domain.Room;
import com.huangshotelreservation.model.services.exception.CalendarException;

/**
 * 
 * @author Zhijie Huang
 *
 */
public class CalendarServiceImpl implements ICalendarService{
	
	public boolean RetrieveAvaliableRoom(City city,Room room) 
					throws CalendarException
	{
		boolean isValid = false;
		System.out.println("Entering method CalendarSerivceImpl::"
				+ "Customer will be able to retrieve  available room "
				+ "based on the city and room input!");
		ObjectInputStream input = null;
		
		return isValid;
		
	}
}
