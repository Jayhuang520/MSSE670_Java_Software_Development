package com.HuangsHotelReservation.model.business.manager;

import java.util.ArrayList;

import com.HuangsHotelReservation.model.business.exception.ServiceLoadException;
import com.HuangsHotelReservation.model.domain.City;
import com.HuangsHotelReservation.model.domain.Room;
import com.HuangsHotelReservation.model.services.calendarservice.ICalendarService;
import com.HuangsHotelReservation.model.services.exception.CalendarException;
import com.HuangsHotelReservation.model.services.exception.SeeGalleryException;
import com.HuangsHotelReservation.model.services.factory.ServiceFactory;
import com.HuangsHotelReservation.model.services.seeGalleryService.IseeGalleryService;

/**
 * This HuangsHotelReservationManager provides two key functionality:
 * 1.Has the properties files loaded by the propertyManager
 * 2.Calls the ServiceFactory class and executes the service being requested by
 * the controller.
 * 
 * @author JayHuang
 *
 */
public class HuangsHotelReservationManager {

	public static HuangsHotelReservationManager _instance;
	
	/**
	 * keep the constructor private to prevent instantiation by outside callers.
	 */
	private HuangsHotelReservationManager() {
		//construct object.
	}
	
	/**
	 *  Assures that there is only one HuangsHotelReservationManager created.
	 * @return HuangsHotelReservationManager instance
	 */
	public static synchronized HuangsHotelReservationManager getInstance() {
		if(_instance == null) {
			_instance = new HuangsHotelReservationManager();
		}
		return _instance;
	}
	
	/**
	 *  Generic method that all clients of this class can call
	 *  to perform certain actions.
	 *  
	 * @param commandString
	 * @param availableRoomList
	 * @return 
	 * @throws SeeGalleryException
	 * @throws CalendarException 
	 */
	public boolean performAction(String commandString,
			ArrayList<Room> availableRoomList,City city,Room room)
					throws SeeGalleryException, CalendarException{
		boolean action = false;
		if(commandString.equals("seeGalleryService")) {
			action = seeGalleryService(IseeGalleryService.NAME,availableRoomList);
		}else if(commandString.equals("CalendarService")) {
			action = CalendarService(ICalendarService.NAME,city,room);
		}
		return action;
	}
	
	/**
	 * Method delegates to the ServiceFactory to execute a service.
	 * Good thing about this approach is that the manager knows the service by
	 * a string name - thus achieving the decooupling effect for MVC(model-view
	 * -controller) approach
	 * 
	 * @param commandString
	 * @param availableRoomList
	 * @return
	 */
	
	public boolean seeGalleryService(String commandString,
			ArrayList<Room> availableRoomList) {
		boolean seeGallery = false;
		
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		IseeGalleryService iSeeGalleryService;
		
		try {
			iSeeGalleryService = (IseeGalleryService) serviceFactory
					.getService(commandString);
			seeGallery = iSeeGalleryService.RetrievePicture(availableRoomList);
			
		}catch(ServiceLoadException sle) {
			System.out.println("HuangsHotelManager seeGallery failed.");
		}catch(SeeGalleryException sge) {
			System.out.println("HuangsHotelManager seeGallery failed.");
		}
		return seeGallery;
	}
	
	/**
	 * Invokes a calendar service for the second use case.
	 * @param commandString
	 * @param city
	 * @param room
	 * @return
	 * @throws CalendarException
	 */
	public boolean CalendarService(String commandString,City city,Room room) throws CalendarException {
		boolean calendarService = false;
		
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		ICalendarService iCalendarService;
		
		try {
			iCalendarService = (ICalendarService) serviceFactory
					.getService(commandString);
			calendarService = iCalendarService.RetrieveAvaliableRoom(city, room);
		}catch(ServiceLoadException sle) {
			System.out.println("HuangsHotelManager RetrieveAvailableRoom failed.");
		}catch(CalendarException ce) {
			System.out.println("HuangsHotelManager RetrieveAvailableRoom failed.");
		}
		
		
		return calendarService;
		
	}
	
	public static void main(String[] args) throws SeeGalleryException, CalendarException {
		HuangsHotelReservationManager huangsHotelReservationManager = HuangsHotelReservationManager
				.getInstance();
		ArrayList<Room> availableRoom = null;
		availableRoom = new ArrayList<Room>(2);
		availableRoom.add(Room.DOUBLE);
		availableRoom.add(Room.KING);
		
		boolean seeGallery = huangsHotelReservationManager.performAction(
				"seeGalleryService", availableRoom, City.DENVER, Room.DOUBLE);
		//This is the compressed version of logical statement in java
		//If seeGallery is true, output the first string,
		//else output the second string.
		String message = seeGallery ? "HuangsHotelReservationManager::main"
				+ "---- Successfully output image to customer" : "HuangsHotelReservationManager"
						+ "::Main ---- Failed to output image to customer!";
		System.out.println(message);
		
	}//End main
}//End class HuangsHotelReservationManager
