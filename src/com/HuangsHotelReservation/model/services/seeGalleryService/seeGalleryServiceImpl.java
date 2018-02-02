package com.HuangsHotelReservation.model.services.seeGalleryService;

import com.HuangsHotelReservation.model.domain.City;
import com.HuangsHotelReservation.model.domain.Room;

public class seeGalleryServiceImpl implements IseeGalleryService{
	
	public void RetrievePicture(Room room) {
		System.out.println("Entering method seeGallerySerivceImpl::"
				+ "Customer will be able to view pictures of the"
				+ "hotel room!!!");
	}
	
	public void RetrieveRoom(City city) {
		System.out.println("Entering method seeGallerySerivceImpl::"
				+ "Customer will be able to retrieve room based on the"
				+ "city");
	}
}
