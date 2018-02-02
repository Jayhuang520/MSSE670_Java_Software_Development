package com.HuangsHotelReservation.model.services.calendarservice;

import com.HuangsHotelReservation.model.domain.City;
import com.HuangsHotelReservation.model.domain.Room;

public interface ICalendarService {
	public void RetrieveAvaliableRoom(City city,Room room);
}
