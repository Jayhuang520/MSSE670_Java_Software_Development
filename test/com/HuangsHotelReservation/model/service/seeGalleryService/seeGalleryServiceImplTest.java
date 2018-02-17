package com.HuangsHotelReservation.model.service.seeGalleryService;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import com.HuangsHotelReservation.model.business.exception.ServiceLoadException;
import com.HuangsHotelReservation.model.domain.City;
import com.HuangsHotelReservation.model.domain.Room;
import com.HuangsHotelReservation.model.services.exception.SeeGalleryException;
import com.HuangsHotelReservation.model.services.factory.ServiceFactory;
import com.HuangsHotelReservation.model.services.seeGalleryService.IseeGalleryService;

import junit.framework.TestCase;

public class seeGalleryServiceImplTest extends TestCase{

	private ServiceFactory serviceFactory;
	private ArrayList<Room> availableRoom = null;
	
	@Override
	protected void setUp() throws Exception{
		super.setUp();
		availableRoom = new ArrayList<Room>(2);
		availableRoom.add(Room.DOUBLE);
		availableRoom.add(Room.KING);
		serviceFactory = ServiceFactory.getInstance(); 
		
	}
	
	@Test
	public final void testRetrievePicture() throws SeeGalleryException {
		
		IseeGalleryService seeGalleryService;
		try {
			
			seeGalleryService = (IseeGalleryService) serviceFactory
					.getService(IseeGalleryService.NAME);
			assertTrue(seeGalleryService.RetrievePicture(availableRoom));
			System.out.println("testRetrievePicture PASSED");
		}catch (ServiceLoadException e) {
			e.printStackTrace();
			fail("ServiceLoadException");
		}
	}
	
	@Test
	public final void testRetrieveRoom() throws IOException, SeeGalleryException {
		IseeGalleryService seeGalleryService;
		try {
			seeGalleryService = (IseeGalleryService) serviceFactory
					.getService(IseeGalleryService.NAME);
			assertTrue(seeGalleryService.RetrieveRoom(City.DENVER));
			System.out.println("testRetrieveRoom PASSED");
		}catch (ServiceLoadException e) {
			e.printStackTrace();
			fail("ServiceLoadException");
		}
	}
}
