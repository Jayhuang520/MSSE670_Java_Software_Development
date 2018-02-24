package com.huangshotelreservation.view.seegalleryjframe;

import java.util.ArrayList;

import javax.swing.JButton;

import com.huangshotelreservation.model.domain.AvailableRoom;
import com.huangshotelreservation.model.domain.Room;

/**
 * 
 * @author Zhijie Huang
 * 
 * UI will take the city and room information from the previous page
 * and display an image. Since displaying an image is a more advanced
 * method in Swing. It is hard to incorporate it into a week.
 *
 */
public class SeeGalleryJFrame extends javax.swing.JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3454668569198348148L;

	private SeeGalleryJFrameController seeGalleryJFrameController;

	private Room jTextFieldRoom;

	private JButton jButtonOk;

	private JButton jButtonCancel;
	
	/**
	 * Create a new window for display gallery
	 */
	public SeeGalleryJFrame() {
		initComponents();
		seeGalleryJFrameController = new SeeGalleryJFrameController(this);
		
		this.setSize(600,650);
		this.setVisible(true);
	}

	private void initComponents() {
		
	}
	
	public ArrayList<Room> getSelectedData(){
		AvailableRoom availableRoomList = new AvailableRoom(1000.0f,true);
		availableRoomList.addRoom(jTextFieldRoom);
	}
	
	 public javax.swing.JButton getOkButton()
	 {
	     return jButtonOk;
	 }

	  public javax.swing.JButton getCancelButton()
	 {
	     return jButtonCancel;
	 }
}
