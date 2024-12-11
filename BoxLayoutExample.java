package com.swing;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayoutExample {
	public static void main(String[]args) {
		JFrame frame=new JFrame("BoxLayout Example");
		JPanel panel=new JPanel();
		panel.setLayout(new BoxLayout (panel,BoxLayout.LINE_AXIS));
		JButton button1=new JButton("Button 1");
		JButton button2=new JButton("Button 2");
		JButton button3=new JButton("Button 3");
		JButton button4=new JButton("Button 4");
		JButton button5=new JButton("Button 5");
		button5.setBackground(Color.blue);
	
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	panel.add(button5);
	frame.add(panel);
	frame.setSize(300,200);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	
}
}
