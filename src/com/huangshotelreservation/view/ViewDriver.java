package com.huangshotelreservation.view;

import javax.swing.UIManager;

import com.huangshotelreservation.view.mainjframe.MainJFrame;
import com.huangshotelreservation.view.mainjframe.MainJFrameController;

public class ViewDriver {
	
	public ViewDriver()
	{
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//Follows Model-View-Controller(MVC) approach
		// Create view class
		MainJFrame mainFrame = new MainJFrame();
		
		//Create controller class and set the view
		MainJFrameController mainJFrameController = 
				new MainJFrameController(mainFrame);
	}
	
	public static void main(String[] args) {
		new ViewDriver();
	}
	
}
