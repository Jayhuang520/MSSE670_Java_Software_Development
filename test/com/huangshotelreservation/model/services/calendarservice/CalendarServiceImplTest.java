package com.huangshotelreservation.model.services.calendarservice;

import org.junit.Test;

import com.huangshotelreservation.model.domain.City;
import com.huangshotelreservation.model.domain.Hotel;
import com.huangshotelreservation.model.domain.Room;
import com.huangshotelreservation.model.services.exception.CalendarException;
import com.huangshotelreservation.model.services.factory.ServiceFactory;

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

}
