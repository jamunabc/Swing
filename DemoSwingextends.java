package com.swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DemoSwingextends extends JFrame {
	DemoSwingextends(){
		JButton b=new JButton("click");
		b.setBounds(130,100,100,40);
		add(b);
		setSize(400,500);
		setLayout(null);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new DemoSwingextends();
		
	}
}

