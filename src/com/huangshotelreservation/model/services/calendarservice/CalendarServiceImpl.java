package com.huangshotelreservation.model.services.calendarservice;

import java.util.ArrayList;

import com.huangshotelreservation.model.domain.ReserveRoom;
import com.huangshotelreservation.model.domain.Room;
import com.huangshotelreservation.model.services.exception.CalendarException;

/**
 * 
 * @author Zhijie Huang
 *
 */
public class CalendarServiceImpl implements ICalendarService{
	
	public boolean reserveRoomService(ArrayList<Room> availableRoomList,ReserveRoom reserveRoom) 
				throws CalendarException{
		boolean isReserved;
		try {
			if(availableRoomList.size()>0 && reserveRoom.isAvailable()) {
				System.out.println("There is room available.");
				//Since the duration already an int, it will always be positive integer,
				//no float.
				
				System.out.println("Day:"+reserveRoom.getDay());
				System.out.println("Duration:"+reserveRoom.getDuration());
				System.out.println("Month"+reserveRoom.getMonth());
				System.out.println("Year"+reserveRoom.getYear());
				
				if(reserveRoom.getDuration() > 0 && reserveRoom.getDay() > 0
						&& reserveRoom.getMonth() > 0 && reserveRoom.getYear()>0) {
					System.out.println("Information entered were valid");
					isReserved = true;
				
					
					
				}else {
					isReserved = false;
					System.out.println("Invalid information enter!!!");
					throw new CalendarException("Invalid Input");
				}
			}else {
				System.out.println("There isn't any available room, please"
						+ "try again later.");
				isReserved = false;
			}
		}catch(Exception e) {
			throw new CalendarException("Calendar Service exception");
		}
		return isReserved;
	}
}
