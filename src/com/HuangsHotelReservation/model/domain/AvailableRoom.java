package com.HuangsHotelReservation.model.domain;

import java.io.Serializable;
import java.util.ArrayList;

public class AvailableRoom implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8540510908779711003L;
	
	/** Holds the state of rental room */
	private boolean available;
	
	/** state tax associated with this rental */
	private float stateTax;
	
	/**holds room objects*/
	private ArrayList<Room> availableRentalList = new ArrayList<Room>();
	
}
