package main.java.layouts_demo;

import main.java.listeners.ButtonListener;

import javax.swing.*;
import java.awt.*;

public class AbsoluteLayoutDemo extends LayoutDefaultButtons {

	private JPanel panel;

	@Override
	public void useLayout(JPanel panel) {
		panel.setLayout(null);
	}

	@Override
	public void addButtonsToPanel(JPanel panel, int buttonCount) {
		ButtonListener buttonListener = new ButtonListener(panel);


		this.panel = panel;
		JButton button1 = new JButton("Button1");
		button1.setSize(100,100);
		button1.setBounds(new Rectangle(150,200,170,20));

		button1.addActionListener(buttonListener);

		JButton button2 = new JButton("Button2");
		button2.setBounds(new Rectangle(100,100,150,30));
		button2.addActionListener(buttonListener);


		panel.add(button1);
		panel.add(button2);
	}
}
