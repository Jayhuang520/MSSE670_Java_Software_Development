package com.HuangsHotelReservation.model.services.calendarservice;

import com.HuangsHotelReservation.model.domain.City;
import com.HuangsHotelReservation.model.domain.Room;
import com.HuangsHotelReservation.model.services.IService;
import com.HuangsHotelReservation.model.services.exception.CalendarException;

public interface ICalendarService extends IService{
	public boolean RetrieveAvaliableRoom(City city,Room room) throws CalendarException;
}
