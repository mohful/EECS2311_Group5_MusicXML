package tab2mxl;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //Event Handler package  

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Sample GUI class
 */

public class GUI implements ActionListener{ //event handler interface for responsible for handling all action events such as when the user clicks on a component
	
	private int count = 0;
	private JLabel label;
	private JFrame frame; 
	private JPanel panel;
	
	/**
	 * Default Constructor to make a default GUI
	 */
	public GUI() { 
		
		
		frame = new JFrame(); //make the frame..window 
		JButton button = new JButton("Convert File");
		button.addActionListener(this);
		label = new JLabel("Number of Files Coverted: 0");
		
		panel = new JPanel(); //creates the panel to store content inside the window
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30)); //static factory
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER); // add panel to the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set what happens when they close the frame
		frame.setTitle("File Converter");
		frame.pack(); //set the window to match a certain and size
		frame.setVisible(true); //set the window to be visible and focused
		
	}
	
	public static void main(String[]args) { 
		
		new GUI();
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		count++;
		label.setText("Number of Converted Files: " + count);
		if (count % 15 == 0) {
			label.setText("Number of Converted Files: " + count + " Files Converted! " );
		}
		
		
	}

}
