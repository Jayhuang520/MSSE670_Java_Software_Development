package com.HuangsHotelReservation.model.business.factory;

import com.HuangsHotelReservation.model.business.exception.ServiceLoadException;
import com.HuangsHotelReservation.model.services.factory.ServiceFactory;
import com.HuangsHotelReservation.model.services.seeGalleryService.IseeGalleryService;
import com.HuangsHotelReservation.model.services.seeGalleryService.seeGalleryServiceImpl;

import junit.framework.TestCase;

public class ServiceFactoryTest extends TestCase{

	ServiceFactory serviceFactory;
	
	public void setUp() throws Exception{
		serviceFactory = ServiceFactory.getInstance();
	}
	
	public void testGetInstance() {
		assertNotNull(serviceFactory);
	}
	
	public void testGetSeeGalleryService() {
		IseeGalleryService seeGalleryService;
		try {
			seeGalleryService = (IseeGalleryService)serviceFactory.getService(
					IseeGalleryService.NAME);
			assertTrue(seeGalleryService instanceof seeGalleryServiceImpl);		}catch(ServiceLoadException sle) {
			sle.printStackTrace();
			fail("ServiceLoadException");
		}
	}
	
}
