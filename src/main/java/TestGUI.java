package main.java;

import main.java.hw._01.MyJButton;
import main.java.hw._01.MyJFrame;
import main.java.hw._01.MyJPanel;

import java.awt.*;

public class TestGUI {
	public static void main(String[] args) {
		MyJButton button1 = new MyJButton("Button 1");
		MyJButton button2 = new MyJButton("Button 2");
		MyJButton button3 = new MyJButton("Button 3");
		MyJButton button4 = new MyJButton("Button 4");

		MyJPanel panel1 = new MyJPanel("Panel", 100, 100, button1, button2, button3);
		panel1.setBackground(Color.RED);

		MyJPanel panel2 = new MyJPanel("Panel", 100, 100, button4);
		panel2.setBackground(Color.BLUE);

		MyJFrame frame = new MyJFrame("Frame", 400, 300, panel1, panel2);

	}
}
