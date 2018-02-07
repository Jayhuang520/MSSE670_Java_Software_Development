package com.HuangsHotelReservation.model.services.calendarservice;

import com.HuangsHotelReservation.model.domain.City;
import com.HuangsHotelReservation.model.domain.Room;

/**
 * 
 * @author Jay Huang
 *
 */
public class CalendarServiceImpl implements ICalendarService{
	public boolean RetrieveAvaliableRoom(City city,Room room) 
	{
		System.out.println("Entering method CalendarSerivceImpl::"
				+ "Customer will be able to retrieve  available room "
				+ "based on the city and room input!");
		return true;
	}
}
