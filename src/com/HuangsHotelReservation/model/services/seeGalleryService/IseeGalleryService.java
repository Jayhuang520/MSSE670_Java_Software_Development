package com.HuangsHotelReservation.model.services.seeGalleryService;

import java.io.IOException;
import java.util.ArrayList;

import com.HuangsHotelReservation.model.domain.City;
import com.HuangsHotelReservation.model.domain.Room;
import com.HuangsHotelReservation.model.services.IService;
import com.HuangsHotelReservation.model.services.exception.SeeGalleryException;

public interface IseeGalleryService extends IService{
	
	public final String NAME = "IseeGalleryService";
	
	/*
	 * Declaration of retrievePicture
	 */
	public boolean RetrievePicture(ArrayList<?> availableRoomList);
	
	/*
	 * Declaration of RetreiveRoom
	 */
	public ArrayList<Room> RetrieveRoom(City city) 
			throws IOException, SeeGalleryException;
}
