package com.HuangsHotelReservation.model.service.seeGalleryService;

import com.HuangsHotelReservation.model.domain.City;
import com.HuangsHotelReservation.model.domain.Hotel;
import com.HuangsHotelReservation.model.domain.Room;
import com.HuangsHotelReservation.model.services.factory.ServiceFactory;
import com.HuangsHotelReservation.model.services.seeGalleryService.IseeGalleryService;

import junit.framework.TestCase;

public class seeGalleryServiceImplTest extends TestCase{

	private ServiceFactory serviceFactory;
	private Hotel hotel;
	
	@Override
	protected void setUp() throws Exception{
		super.setUp();
		
		serviceFactory = new ServiceFactory();
		
		hotel = new Hotel((float)1000.0,Room.KING,City.DENVER);
	}
	
	public final void testRetrievePicture() {
		Room room = hotel.getRoom();
		IseeGalleryService seeGalleryService = serviceFactory.getSeeGallerySerivce();
		assertTrue(seeGalleryService.RetrievePicture(room));
		System.out.println("testRetrievePicture PASSED");
	}
	
	public final void testRetrieveRoom() {
		City city = hotel.getCity();
		IseeGalleryService seeGalleryService = serviceFactory.getSeeGallerySerivce();
		assertTrue(seeGalleryService.RetrieveRoom(city));
		System.out.println("testRetrieveRoom PASSED");
	}
}
