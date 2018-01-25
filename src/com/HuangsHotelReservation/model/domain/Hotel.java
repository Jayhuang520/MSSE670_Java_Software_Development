package com.HuangsHotelReservation.model.domain;

import java.io.*;

public class Hotel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5538770477273119572L;

	/**
	 * Domain Hotel class that holds the rental rate of the hotel room,
	 * room types
	 */
	
	/** Daily rate */
	private float rate;
	
	/**room type*/
	private Room room;
	
	
	
	/**
	 * @return Returns the rate.
	 */
	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Hotel(float rate,Room room) {
		super();
		this.rate = rate;
		this.room = room;
	}
}
