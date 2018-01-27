/**
 * 
 */
package com.HuangsHotelReservation.model.domain;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

/**
 * @author JayHu
 *
 */
class CustomerTest {
	
	private static Customer cus1,cus2;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	static void setUp() throws Exception {
		
		cus1 = new Customer("Alexander","John","JAlexander",
				"password", "email@harris.com", "123-456-7890",
				"10-111-0000");
		cus2 = new Customer("Huang","Jay","JHuang",
				"password", "email@harris.com", "103-456-7890",
				"10-111-2222");
	}

	/**
	 * Test method for 
	 * {@link com.HuangsHotelReservation.model.domain.Customer#validate()}}.
	 */
	@Test
	void testValidateCustomer() {
		System.out.println("Start the testValidateCustomer: ");
		/*
		 * validate method from cus1 should assert to true because
		 * all variables being passed to create a new customer is valid.
		 */
		assertTrue(cus1.validate());
		System.out.println("testValidateCustomer PASSED!!!!");
	}

}
