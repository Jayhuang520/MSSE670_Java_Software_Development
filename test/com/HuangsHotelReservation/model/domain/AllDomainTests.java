package com.HuangsHotelReservation.model.domain;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllDomainTests {
	
	public static Test suite() {
	TestSuite suite = new TestSuite("Test for com.HuangsHotelReservation.model.domain");
	//$JUnit begins$
	suite.addTestSuite(AvailableRoomTest.class);
	suite.addTestSuite(CustomerTest.class);
	suite.addTestSuite(HotelTest.class);
	//$JUnit end$
	return suite;
	}
	
}
