package main.java.layouts_demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public abstract class LayoutDefaultButtons extends LayoutDemo {

	@Override
	public void addButtonsToPanel(JPanel panel, int buttonCount) {
		for (int i = 0; i < buttonCount; i++) {
			panel.add(new JButton("Button " + (i + 1)));
		}

		Font font = new Font("Courier", Font.ITALIC, 12);

		//set font for JTextField

//		JTextField field = new JTextField("введите число", 20);
//
//		field.setFont(font);
//		field.setForeground(Color.gray);
//		field.addFocusListener(new FocusListener() {
//
//			@Override
//			public void focusGained(FocusEvent e) {
//				if (e.getSource() instanceof JTextField) {
//					JTextField field = ((JTextField) e.getSource());
//					if (field.getText().equals("введите число")) {
//
//						field.setText("");
//					}
//				}
//			}
//
//			@Override
//			public void focusLost(FocusEvent e) {
//				if (e.getSource() instanceof JTextField) {
//					JTextField field = ((JTextField) e.getSource());
//					if (field.getText().equals("")) {
//						field.setText("введите число");
//					}
//				}
//			}
//		});
//
//		panel.add(field);
	}
}
