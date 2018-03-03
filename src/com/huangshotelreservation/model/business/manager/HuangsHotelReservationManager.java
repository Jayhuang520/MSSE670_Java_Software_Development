package com.huangshotelreservation.model.business.manager;

import java.util.ArrayList;

import com.huangshotelreservation.model.business.exception.ServiceLoadException;
import com.huangshotelreservation.model.domain.City;
import com.huangshotelreservation.model.domain.ReserveRoom;
import com.huangshotelreservation.model.domain.Room;
import com.huangshotelreservation.model.services.calendarservice.ICalendarService;
import com.huangshotelreservation.model.services.exception.CalendarException;
import com.huangshotelreservation.model.services.exception.SeeGalleryException;
import com.huangshotelreservation.model.services.factory.ServiceFactory;
import com.huangshotelreservation.model.services.seegalleryservice.ISeeGalleryService;

/**
 * This HuangsHotelReservationManager provides two key functionality:
 * 1.Has the properties files loaded by the propertyManager
 * 2.Calls the ServiceFactory class and executes the service being requested by
 * the controller.
 * 
 * @author JayHuang
 *
 */

public class HuangsHotelReservationManager extends ManagerSuperType{

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
	 * @throws CalendarException 
	 */
	
	public boolean performAction(String commandString,
			ArrayList<Room> availableRoomList,City city,Room room,ReserveRoom reserveRoom) {
		boolean action = false;
		if(commandString.equals("seeGalleryService")) {
			System.out.println("Perform " + commandString);
			action = seeGalleryService(ISeeGalleryService.NAME,availableRoomList);
			
		}else if(commandString.equals("calendarService")) {
			System.out.println("Perform " + commandString);
			action = CalendarService(ICalendarService.NAME,availableRoomList,reserveRoom);
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
		ISeeGalleryService iSeeGalleryService;
		
		try {
			iSeeGalleryService = (ISeeGalleryService) serviceFactory
					.getService(commandString);
			seeGallery = iSeeGalleryService.retrievePicture(availableRoomList);
			
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
	public boolean CalendarService(String commandString,ArrayList<Room> availableRoomList,ReserveRoom reserveRoom){
		boolean calendarService = false;
		
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		ICalendarService iCalendarService;
		
		try {
			iCalendarService = (ICalendarService) serviceFactory
					.getService(commandString);
			calendarService = iCalendarService.reserveRoomService(availableRoomList, reserveRoom);
			calendarService = true;
		}catch(ServiceLoadException sle) {
			System.out.println("HuangsHotelManager RetrieveAvailableRoom failed.");
		}catch(CalendarException ce) {
			System.out.println("HuangsHotelManager RetrieveAvailableRoom failed.");
		}
		
		return calendarService;
		
	}
	
}//End class HuangsHotelReservationManager
