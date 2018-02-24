package com.huangshotelreservation.model.services.seegalleryservice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.huangshotelreservation.model.domain.AvailableRoom;
import com.huangshotelreservation.model.domain.City;
import com.huangshotelreservation.model.domain.Room;
import com.huangshotelreservation.model.services.exception.SeeGalleryException;


public class SeeGalleryServiceImpl implements ISeeGalleryService{
	
	/*This method will output the image to the presentation layer
	* For now, just output a boolean for a place holder.
	* TODO: figure out how to output image.
	*/
	public boolean retrievePicture(ArrayList<Room> availableRoomList) throws SeeGalleryException{
		System.out.println("Entering method seeGallerySerivceImpl:"
				+ "Customer will be able to view pictures of the"
				+ " hotel room!!!");
		if(availableRoomList.size()>0) {
			return true;
		}else
			return false;
		
	}
	
	public boolean retrieveRoom(City city) throws SeeGalleryException {
		//ObjectInputStream input = null;
		ObjectOutputStream oout = null;
		boolean successWrite = false;
		
		System.out.println("Entering method seeGallerySerivceImpl:\n"
				+ " Customer will be able to retrieve room based on the\n"
				+ "city");
		
		try {
			/**
			 * Retrieve Room would retrieve the available room
			 * based on the city
			 */
			
			AvailableRoom availableRoomList = new AvailableRoom(1000.0f,true);
			availableRoomList.addRoom(Room.DOUBLE);
			availableRoomList.addRoom(Room.SINGLE);
			availableRoomList.addRoom(Room.KING);
			
			FileOutputStream out = new FileOutputStream("D:\\Git_Repository\\MSSE670_Java_Software_Development\\Output\\test.txt");
			oout = new ObjectOutputStream(out);
			
			String s;
			switch (city) {
				case ASHEVILLE_NC:
					s = "Selected City: Asheville_NC";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case BOSTON:
					s = "Selected City: Boston";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case BRECKENRIDGE:
					s = "Selected City: Breckenridge";
					System.out.println(s);
					oout.writeObject(availableRoomList);
					break;
				case CHARLESTON:
					s = "Selected City: Charleston";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case DENVER:
					s = "Selected City: Denver";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case HAWAII:
					s = "Selected City: Hawaii";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case HONOLULU_OAHU:
					s = "Selected City: Honolulu_Oahu";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case KAUAI:
					s = "Selected City: Kauai";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case LOS_ANGELES:
					s = "Selected City: Los Angeles";
					System.out.println("Selected City Los Angeles:");
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case MIAMI:
					s = "Selected City: Miami";
					System.out.println("Selected City Miami:");
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case NEWYORK:
					s = "Selected City: New york";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case PARK_CITY:
					s = "Selected City: Park city";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case PHILADELPHIA:
					s = "Selected City: Philadelphia";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case SEATTLE:
					s = "Selected City: Seattle";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case YOSEMITE:
					s = "Selected City: Yosemite";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				default:
					throw new SeeGalleryException("The city"
							+ "you entered is not on the list"
							+ "of the city we provide service!");
			}
		}catch (IOException ioe) {
			throw new SeeGalleryException(""
					+ "");
		}finally {
			try {
				oout.close();
				successWrite = true;
			}catch (IOException e) {
				/*Can close the stream.
				**Log the error
				*/
				e.printStackTrace();
				successWrite = false;
			}
		}//end try/catch/finally
		return successWrite;
	} // end Retrieve Room
}
