package tab2mxl;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //Event Handler package  

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Sample GUI class
 */

public class GUI extends JFrame implements ActionListener{ //event handler interface for responsible for handling all action events such as when the user clicks on a component
	
	private int count = 0;
	private JButton button;
	private JLabel label;
	private JFrame frame; 
	private JPanel panel;
	private JComboBox dropDown;
	private JTextField text;
	
	
	/**
	 * Default Constructor to make a default GUI
	 */
	public GUI() { 
		
		//Technical Set-Up
		frame = new JFrame(); //make the frame..window 
		panel = new JPanel(); //creates the panel to store content inside the window
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30)); //static factory
		panel.setLayout(new GridLayout(0,1));
		frame.add(panel, BorderLayout.CENTER); // add panel to the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set what happens when they close the frame
		frame.setTitle("MusicXML Converter 3000");
		frame.setSize(500, 500);
	    frame.setLocation(430, 100);
		frame.pack(); //set the window to match a certain and size
		frame.setVisible(true); //set the window to be visible and focused
		
		// Creating the buttons
		createDropDown();
		gimmeTextFile();
		createConvertBox();
		
		
	}
	
	/**
	 * Generates a button that converts the file and pressing it 
	 * leads to the conversion 
	 */
	private void createConvertBox() { 
		button = new JButton("Convert File");
	
		button.addActionListener(this);
		label = new JLabel("Number of Files Coverted: 0");
		button.setBackground(Color.LIGHT_GRAY);
		button.setVisible(true);
		button.setSize(1,2);
		button.setLocation(4,4);
		
		panel.add(button);
		panel.add(label);
		
	}
	
	/**
	 * Generates a drop down menu containing three choices
	 * 
	 */
	private void createDropDown() { 
		
		//Instruction message
		JLabel lbl = new JLabel("Select and click one of the instruments");
		lbl.setVisible(true);
		panel.add(lbl);
		
		//Drop Down Menu
		String[] choices = {"Guitars", "Drums", "Bass"};
		dropDown = new JComboBox(choices);
		dropDown.setBackground(Color.white);
		panel.add(dropDown);
		
	
	}
	
	private void gimmeTextFile() { 
		JLabel msg = new JLabel("Provide the tablature to be converted");
		msg.setVisible(true);
		panel.add(msg);
		
		text = new JTextField();
		text.setVisible(true);
		panel.add(text);
		
		
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
		
		String choice = "";
		
		
	}
		
}
