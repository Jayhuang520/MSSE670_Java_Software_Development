package com.huangshotelreservation.view.mainjframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.huangshotelreservation.view.MessageDialog;
import com.huangshotelreservation.view.Utils;
import com.huangshotelreservation.view.seegalleryjframe.SeeGalleryJFrame;

public class MainJFrameController implements ActionListener{

	private MainJFrame mainJFrame;

	//empty constructor to avoid error with empty parameter
	public MainJFrameController() {
	}
	
	
	public MainJFrameController(MainJFrame mainJFrame) {
		this.mainJFrame = mainJFrame;
		mainJFrame.getFileMenuItem().addActionListener(this);
		mainJFrame.getDatabaseMenuItem().addActionListener(this);
		mainJFrame.getGetReserveRoomButton().addActionListener(this);
		mainJFrame.getSeeGalleryButton().addActionListener(this);
		
		//Center the frame
		Utils.centerWindow(mainJFrame);
		mainJFrame.setVisible(true);
	}

	  public void actionPerformed(ActionEvent event) 
	  {

	    System.out.println ("Inside ItineraryJFrameController::actionPerformed");
	    
	    if (event.getSource().equals(mainJFrame.getFileMenuItem()))
	      menuFileOpen_actionPerformed(event);
	    else if (event.getSource().equals(mainJFrame.getDatabaseMenuItem()))
	      actionPerformed(event);
	    else if (event.getSource().equals(mainJFrame.getGetReserveRoomButton()))
	      getReserveRoom_actionPerformed(event);
	    else if (event.getSource().equals(mainJFrame.getSeeGalleryButton()))
	      getSeeGallery_actionPerformed(event);
	  }

	private void getReserveRoom_actionPerformed(ActionEvent event) {
		  System.out.println("Inside MainJFrameController");
		  MessageDialog dlg = new MessageDialog( "Reserve Room", "Not Implemented Yet!");    
		  Utils.centerWindow(dlg);
		  dlg.setModal(true);
		  dlg.show();
		  return;  
	}


	private void getSeeGallery_actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		SeeGalleryJFrame seeGalleryJFrame = new SeeGalleryJFrame();
	}


	void menuFileOpen_actionPerformed(ActionEvent actionEvent) 
	  {
	   /*
	    * This would call another controller to import data
	    * from a database.  
	    */
	    MessageDialog dlg = new MessageDialog( "File Open", " Read comments in callback code");    
	    Utils.centerWindow(dlg);
	    dlg.setModal(true);
	    dlg.show();

	      return;  
	  } //end of the menuFileOpen_actionPerformed
}
