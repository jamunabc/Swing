package com.swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayotExample {
	public static void main(String[] args) {
		JFrame frame= new JFrame("FlowLaout Example");
frame.setSize(400,200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
frame.add(new JButton("Button 1"));
frame.add(new JButton("Button 2"));
frame.add(new JButton("Button 3"));
frame.add(new JButton ("Button 4"));
frame.add(new JButton("Button 5"));
frame.setVisible(true);

}
}