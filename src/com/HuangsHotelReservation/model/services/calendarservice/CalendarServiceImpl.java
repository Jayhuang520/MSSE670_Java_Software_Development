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
	
	public boolean RetrieveAvaliableRoom(City city,Room room,int month,int day,
			int year) 
					throws CalendarException
	{
		boolean isValid = false;
		System.out.println("Entering method CalendarSerivceImpl::"
				+ "Customer will be able to retrieve  available room "
				+ "based on the city and room input!");
		ObjectInputStream input = null;
		
		try {
			/*
			 * The avaliable room will be the input of the service
			 * and the print out will be the output of the service
			 */
			
		}catch(CalendarException e){
			isValid = true;
		}
		return isValid;
		
	}
}
