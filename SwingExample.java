package com.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingExample {
	public static void main(String[] args) {
		JFrame frame=new JFrame("Swing Components Example");
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel=new JPanel();
		JLabel label=new JLabel("What is your name??");
		JTextField textfield=new JTextField(15);
		JButton button=new JButton("Submit");
		panel.add(label);
		panel.add(textfield);
		panel.add(button);
		frame.add(panel);
		frame.setVisible(true);
		
	}

}
