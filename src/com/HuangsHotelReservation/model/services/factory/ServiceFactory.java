package com.HuangsHotelReservation.model.services.factory;

import com.HuangsHotelReservation.model.services.calendarservice.CalendarServiceImpl;
import com.HuangsHotelReservation.model.services.calendarservice.ICalendarService;
import com.HuangsHotelReservation.model.services.seeGalleryService.IseeGalleryService;
import com.HuangsHotelReservation.model.services.seeGalleryService.seeGalleryServiceImpl;

public class ServiceFactory 
{
	public IseeGalleryService getSeeGallerySerivce() 
	{
		return new seeGalleryServiceImpl();
	}
	
	public ICalendarService getCalendarService()
	{
		return (ICalendarService) new CalendarServiceImpl();
	}
}//end Service Factory
