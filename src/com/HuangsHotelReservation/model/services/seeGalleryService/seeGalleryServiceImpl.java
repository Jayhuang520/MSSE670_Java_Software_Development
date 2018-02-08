package com.HuangsHotelReservation.model.services.seeGalleryService;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.HuangsHotelReservation.model.domain.AvailableRoom;
import com.HuangsHotelReservation.model.domain.City;
import com.HuangsHotelReservation.model.domain.Room;
import com.HuangsHotelReservation.model.services.exception.SeeGalleryException;


public class seeGalleryServiceImpl implements IseeGalleryService{
	
	/*This method will output the image to the presentation layer
	* For now, just output a boolean for a place holder.
	* TODO: figure out how to output image.
	*/
	public boolean RetrievePicture(ArrayList<?> availableRoomList) {
		System.out.println("Entering method seeGallerySerivceImpl::"
				+ "Customer will be able to view pictures of the"
				+ "hotel room!!!");
		if(availableRoomList.size()>0) {
			return true;
		}else
			return false;
		
	}
	
	public ArrayList<Room> RetrieveRoom(City city) throws IOException, SeeGalleryException {
		//ObjectInputStream input = null;
		ObjectOutputStream oout = null;
		
		System.out.println("Entering method seeGallerySerivceImpl::"
				+ "Customer will be able to retrieve room based on the"
				+ "city");
		
		try {
			/**
			 * Retrieve Room would retrieve the available room
			 * based on the city
			 */
			
			/*input = new ObjectInputStream(new FileInputStream(
					"")); 
			*/
			AvailableRoom availableRoomList = new AvailableRoom();
			availableRoomList.addRoom(Room.DOUBLE);
			availableRoomList.addRoom(Room.SINGLE);
			availableRoomList.addRoom(Room.KING);
			
			FileOutputStream out = new FileOutputStream("test.txt");
			oout = new ObjectOutputStream(out);
			
			String s;
			switch (city) {
				case ASHEVILLE_NC:
					s = "Selected City Asheville_NC:";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case BOSTON:
					s = "Selected City Boston:";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case BRECKENRIDGE:
					s = "Selected City Breckenridge:";
					System.out.println(s);
					oout.writeObject(availableRoomList);
					break;
				case CHARLESTON:
					s = "Selected City Charleston:";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case DENVER:
					s = "Selected City Denver:";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case HAWAII:
					s = "Selected City Hawaii:";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case HONOLULU_OAHU:
					s = "Selected City Honolulu_Oahu:";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case KAUAI:
					s = "Selected City Kauai:";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case LOS_ANGELES:
					s = "Selected City Los Angeles:";
					System.out.println("Selected City Los Angeles:");
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case MIAMI:
					s = "Selected City Miami:";
					System.out.println("Selected City Miami:");
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case NEWYORK:
					s = "Selected City New york:";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case PARK_CITY:
					s = "Selected City Park city:";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case PHILADELPHIA:
					s = "Selected City Philadelphia:";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case SEATTLE:
					s = "Selected City Seattle:";
					System.out.println(s);
					oout.writeObject(s);
					oout.writeObject(availableRoomList);
					break;
				case YOSEMITE:
					s = "Selected City Yosemite:";
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
			}catch (IOException e) {
				/*Can close the stream.
				**Log the error
				*/
				e.printStackTrace();
			}
		}//end try/catch/finally
		return null;
	} // end Retrieve Room
}
