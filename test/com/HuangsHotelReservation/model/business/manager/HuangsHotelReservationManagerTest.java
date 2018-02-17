package com.HuangsHotelReservation.model.business.manager;

import java.util.ArrayList;

import com.HuangsHotelReservation.model.domain.City;
import com.HuangsHotelReservation.model.domain.Room;
import com.HuangsHotelReservation.model.services.exception.CalendarException;
import com.HuangsHotelReservation.model.services.exception.SeeGalleryException;
import com.HuangsHotelReservation.model.services.seeGalleryService.IseeGalleryService;

import junit.framework.TestCase;

/**
 * This unit test tests the HuangsHotelReservationManager class.
 * This unit test only test the happy path.
 * Should consider include more comprehensive negativee testing.
 * 
 */
public class HuangsHotelReservationManagerTest extends TestCase{

	private HuangsHotelReservationManager huangsHotelReservationManager;
	ArrayList<Room> availableRoom = null;
	
	protected void setUp() throws Exception{
		super.setUp();
		
		huangsHotelReservationManager = HuangsHotelReservationManager.getInstance();
		
		availableRoom = new ArrayList<Room>(2);
		availableRoom.add(Room.DOUBLE);
		availableRoom.add(Room.KING);
		
		
	}
	
	/**
	 * Test performAction method for seeGalleryService
	 * @throws CalendarException 
	 * @throws SeeGalleryException 
	 */
	public final void testPerformAcionOnSeeGalleryService() throws SeeGalleryException, CalendarException
	{
		boolean action = huangsHotelReservationManager.performAction("seeGalleryService", 
				availableRoom, City.DENVER, Room.DOUBLE);
		assertTrue(action);
	}
	
	public final void testSeeGallery() {
		boolean seeGallery = huangsHotelReservationManager.seeGalleryService(IseeGalleryService.NAME, availableRoom);
		assertTrue(seeGallery);
	}
		
}//End HuangsHotelReservationManagerTests
