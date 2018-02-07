package com.HuangsHotelReservation.model.service.factory;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.HuangsHotelReservation.model.services.calendarservice.CalendarServiceImpl;
import com.HuangsHotelReservation.model.services.calendarservice.ICalendarService;
import com.HuangsHotelReservation.model.services.factory.ServiceFactory;
import com.HuangsHotelReservation.model.services.seeGalleryService.IseeGalleryService;
import com.HuangsHotelReservation.model.services.seeGalleryService.seeGalleryServiceImpl;

public class ServiceFactoryTest {
	
	ServiceFactory serviceFactory;
	
	@Before
	public void setUp() throws Exception{
		serviceFactory = new ServiceFactory();
	}
	
	@Test
	public void testGetSeeGallerySerivce() {
		IseeGalleryService seeGalleryService = (IseeGalleryService)serviceFactory.getSeeGallerySerivce();
		assertTrue(seeGalleryService instanceof seeGalleryServiceImpl);
	}
	
	@Test
	public void testGetCalendarService() {
		ICalendarService calendarService = (ICalendarService)serviceFactory.getCalendarService();
		assertTrue(calendarService instanceof CalendarServiceImpl);
	}
}
