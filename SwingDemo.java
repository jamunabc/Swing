package com.swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingDemo {
JFrame f;
SwingDemo(){
	f=new JFrame();
	JButton b=new JButton("click");
	b.setBounds(130,100,100,40);
	f.add(b);
	f.setSize(400,500);
	f.setLayout(null);
	f.setVisible(true);
	
}
public static void main(String[] args) {
	new SwingDemo();
}
}
