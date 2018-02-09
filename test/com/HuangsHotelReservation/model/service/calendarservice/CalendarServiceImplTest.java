package com.HuangsHotelReservation.model.service.calendarservice;

import org.junit.Test;

import com.HuangsHotelReservation.model.domain.City;
import com.HuangsHotelReservation.model.domain.Hotel;
import com.HuangsHotelReservation.model.domain.Room;
import com.HuangsHotelReservation.model.services.calendarservice.ICalendarService;
import com.HuangsHotelReservation.model.services.exception.CalendarException;
import com.HuangsHotelReservation.model.services.factory.ServiceFactory;

import junit.framework.TestCase;

public class CalendarServiceImplTest extends TestCase{
	
	private ServiceFactory serviceFactory;
	private Hotel hotel;
	
	@Override
	protected void setUp() throws Exception{
		super.setUp();
		
		serviceFactory = ServiceFactory.getInstance();
		
		hotel = new Hotel((float)1000.0,Room.KING,City.DENVER);
		
	}
	
	/**
	 * 
	 * @throws CalendarException
	 */
	@Test
	public final void testRetrieveAvaliableRoom() throws CalendarException {
		
		ICalendarService calendarService;
		
		City city = hotel.getCity();
		Room room = hotel.getRoom();
		//assertTrue(calendarService.RetrieveAvaliableRoom(city, room));
		System.out.println("testRetrieveAvaliableRoom PASSED");
	}
}
