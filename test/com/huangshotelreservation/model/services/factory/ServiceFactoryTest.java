package com.huangshotelreservation.model.services.factory;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.huangshotelreservation.model.business.exception.ServiceLoadException;
import com.huangshotelreservation.model.services.calendarservice.CalendarServiceImpl;
import com.huangshotelreservation.model.services.calendarservice.ICalendarService;
import com.huangshotelreservation.model.services.factory.ServiceFactory;
import com.huangshotelreservation.model.services.seegalleryservice.ISeeGalleryService;

public class ServiceFactoryTest {
	
	ServiceFactory serviceFactory;
	
	@Before
	public void setUp() throws Exception{
		serviceFactory = ServiceFactory.getInstance();
	}
	
	/**
	 * Test factory to return the seeGalleryService and assert it by
	 * checking it is an instance of seeGalleryService.
	 */
	@Test
	public void testGetSeeGallerySerivce() {
		ISeeGalleryService seeGalleryService;
		try {
			seeGalleryService = (ISeeGalleryService)serviceFactory.getService(ISeeGalleryService.NAME);
			assertTrue(seeGalleryService instanceof ISeeGalleryService);
		}catch (ServiceLoadException sle) {
			// TODO Auto-generated catch block
			sle.printStackTrace();
			fail("ServiceLoadException");
		}

	}
	@Ignore
	@Test
	public void testGetCalendarService() {
		ICalendarService calendarService;
		try {
			calendarService = (ICalendarService)serviceFactory.getService(ICalendarService.NAME);
			assertTrue(calendarService instanceof CalendarServiceImpl);
		}catch (ServiceLoadException sle) {
			// TODO Auto-generated catch block
			sle.printStackTrace();
			fail("ServiceLoadException");
		}
	}
}
