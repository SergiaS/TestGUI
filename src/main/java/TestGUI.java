package main.java;

import javax.swing.*;
import java.awt.*;

public class TestGUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Test Frame");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		FlowLayout fl = new FlowLayout();
		frame.setLayout(fl);

		JButton button = new JButton("Test Button");
		button.setSize(300, 200);
		frame.add(button);
	}
}
