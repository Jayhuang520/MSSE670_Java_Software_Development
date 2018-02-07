package com.HuangsHotelReservation.model.domain;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class AvailableRoomTest {

	/**
	 * @author Jay Huang
	 */
	private AvailableRoom avaRoom1,avaRoom2;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception{
	}
	
	@Test
	public void testEqualAvailableRoom() {
		System.out.println("Start the testEqualAvailableRoom: ");
		/*
		 * Validate method from avaRoom1 should assert true because all
		 * variable being passed to create a new AvailableRoom is valid.
		 */
		avaRoom1 = new AvailableRoom(80.0f,true);
		avaRoom2 = new AvailableRoom(80.0f,true);
		assertTrue(avaRoom1.equals(avaRoom2));
		System.out.println("testEqualAvailableRoom PASSED!!!!!");
	}
}
