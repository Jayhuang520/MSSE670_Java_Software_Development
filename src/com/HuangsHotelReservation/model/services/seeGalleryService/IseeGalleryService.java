package com.HuangsHotelReservation.model.services.seeGalleryService;

import com.HuangsHotelReservation.model.domain.*;

public interface IseeGalleryService {
	/*
	 * Declaration of retrievePicture
	 */
	public void RetrievePicture(Room room);
	
	/*
	 * Declaration of RetreiveRoom
	 */
	public void RetrieveRoom(City city);
}
