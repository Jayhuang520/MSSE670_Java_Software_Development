package com.HuangsHotelReservation.model.services.calendarservice;

import java.io.ObjectInputStream;

import com.HuangsHotelReservation.model.domain.City;
import com.HuangsHotelReservation.model.domain.Room;
import com.HuangsHotelReservation.model.services.exception.CalendarException;

/**
 * 
 * @author Jay Huang
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
