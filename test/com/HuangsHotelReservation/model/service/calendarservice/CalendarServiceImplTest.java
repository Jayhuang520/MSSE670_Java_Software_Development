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
		
		serviceFactory = new ServiceFactory();
		
		hotel = new Hotel((float)1000.0,Room.KING,City.DENVER);
		
	}
	
	@Test
	public final void testRetrieveAvaliableRoom() throws CalendarException {
		City city = hotel.getCity();
		Room room = hotel.getRoom();
		ICalendarService calendarService = serviceFactory.getCalendarService();
		assertTrue(calendarService.RetrieveAvaliableRoom(city, room));
		System.out.println("testRetrieveAvaliableRoom PASSED");
	}
}
