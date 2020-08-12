package main.java.layouts_demo;

import javax.swing.*;
import java.awt.*;

public class AbsoluteLayoutDemo extends LayoutDefaultButtons {
	@Override
	public void useLayout(JPanel panel) {
		panel.setLayout(null);
	}

	@Override
	public void addButtonsToPanel(JPanel panel, int buttonCount) {
		JButton button1 = new JButton("Button1");
		button1.setSize(100,100);
		button1.setBounds(new Rectangle(150,200,170,20));

		JButton button2 = new JButton("Button2");
		button2.setBounds(new Rectangle(100,100,150,30));

		panel.add(button1);
		panel.add(button2);
	}
}
