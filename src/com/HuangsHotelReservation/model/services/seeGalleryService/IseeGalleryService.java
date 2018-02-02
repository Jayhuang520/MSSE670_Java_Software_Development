package com.HuangsHotelReservation.model.services.seeGalleryService;

import com.HuangsHotelReservation.model.domain.*;

public interface IseeGalleryService {
	/*
	 * Declaration of retrievePicture
	 */
	public boolean RetrievePicture(Room room);
	
	/*
	 * Declaration of RetreiveRoom
	 */
	public boolean RetrieveRoom(City city);
}
