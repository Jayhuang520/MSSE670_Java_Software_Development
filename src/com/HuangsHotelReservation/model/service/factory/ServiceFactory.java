package com.HuangsHotelReservation.model.service.factory;

import com.HuangsHotelReservation.model.services.seeGalleryService.IseeGalleryService;
import com.HuangsHotelReservation.model.services.seeGalleryService.seeGalleryServiceImpl;

public class ServiceFactory 
{
	public IseeGalleryService getSeeGallerySerivce() 
	{
		return new seeGalleryServiceImpl();
	}
}//end Service Factory
