package com.HuangsHotelReservation.model.service.factory;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.HuangsHotelReservation.model.business.exception.ServiceLoadException;
import com.HuangsHotelReservation.model.services.calendarservice.CalendarServiceImpl;
import com.HuangsHotelReservation.model.services.calendarservice.ICalendarService;
import com.HuangsHotelReservation.model.services.factory.ServiceFactory;
import com.HuangsHotelReservation.model.services.seeGalleryService.IseeGalleryService;
import com.HuangsHotelReservation.model.services.seeGalleryService.seeGalleryServiceImpl;

public class ServiceFactoryTest {
	
	ServiceFactory serviceFactory;
	
	@Before
	public void setUp() throws Exception{
		serviceFactory = ServiceFactory.getInstance();
	}
	
	/**
	 * Test factory to return seeGalleryService and assert it by checking\
	 * is it an instance of seeGallerySerivceImpl
	 */
	@Test
	public void testGetSeeGallerySerivce() {
		IseeGalleryService seeGalleryService;
		try {
			seeGalleryService = (IseeGalleryService)serviceFactory.
					getService(IseeGalleryService.NAME);
			assertTrue(seeGalleryService instanceof seeGalleryServiceImpl);
		}catch (ServiceLoadException sle) {
			// TODO Auto-generated catch block
			sle.printStackTrace();
			fail("ServiceLoadException");
		}
	}
	
	@Test
	public void testGetCalendarService() {
		ICalendarService calendarService;
		try {
			calendarService = (ICalendarService)serviceFactory.
					getService(ICalendarService.NAME);
			assertTrue(calendarService instanceof CalendarServiceImpl);
		}catch (ServiceLoadException sle) {
			// TODO Auto-generated catch block
			sle.printStackTrace();
			fail("ServiceLoadException");
		}
	}
}
