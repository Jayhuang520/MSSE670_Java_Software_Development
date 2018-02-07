package com.HuangsHotelReservation.model.services.seeGalleryService;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.HuangsHotelReservation.model.domain.City;
import com.HuangsHotelReservation.model.domain.Room;


public class seeGalleryServiceImpl implements IseeGalleryService{
	
	
	public boolean RetrievePicture(Room room) {
		System.out.println("Entering method seeGallerySerivceImpl::"
				+ "Customer will be able to view pictures of the"
				+ "hotel room!!!");
		return true;
	}
	
	public boolean RetrieveRoom(City city) throws FileNotFoundException, IOException {
		ObjectInputStream input = null;
		boolean isValid = false;
		
		System.out.println("Entering method seeGallerySerivceImpl::"
				+ "Customer will be able to retrieve room based on the"
				+ "city");
		try {
			/**
			 * Retrieve Room would retrieve the available room
			 * based on the city
			 */
			input = new ObjectInputStream(new FileInputStream(
					"City")); 
			switch (city) {
				case ASHEVILLE_NC:
					break;
				case BOSTON:
					break;
				case BRECKENRIDGE:
					break;
				case CHARLESTON:
					break;
				case DENVER:
					break;
				case HAWAII:
					break;
				case HONOLULU_OAHU:
					break;
				case KAUAI:
					break;
				case LOS_ANGELES:
					break;
				case MIAMI:
					break;
				case NEWYORK:
					break;
				case PARK_CITY:
					break;
				case PHILADELPHIA:
					break;
				case SEATTLE:
					break;
				case YOSEMITE:
					break;
				default:
					break;
			}
		}finally {
			
		}
		
		return isValid;
	}
	

}
