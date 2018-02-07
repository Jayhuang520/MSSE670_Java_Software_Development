package com.HuangsHotelReservation.model.services.seeGalleryService;

import com.HuangsHotelReservation.model.domain.City;
import com.HuangsHotelReservation.model.domain.Room;
import com.HuangsHotelReservation.model.services.IService;

public interface IseeGalleryService extends IService{
	/*
	 * Declaration of retrievePicture
	 */
	public boolean RetrievePicture(Room room);
	
	/*
	 * Declaration of RetreiveRoom
	 */
	public boolean RetrieveRoom(City city);
}
