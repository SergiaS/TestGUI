package main.java;

import com.jtattoo.plaf.aero.AeroLookAndFeel;
import main.java.hw._01.MyJButton;
import main.java.hw._01.MyJFrame;
import main.java.hw._01.MyJPanel;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestGUI {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(new AeroLookAndFeel()); // команда для изменения внешнего вида внутренних компонентов
		} catch (UnsupportedLookAndFeelException e) {
			Logger.getLogger(TestGUI.class.getName()).log(Level.SEVERE, null, e);
		}

		JFrame.setDefaultLookAndFeelDecorated(true); // команда для изменения внешнего вида самого окна

		MyJButton button1 = new MyJButton("Button");

		MyJPanel panel = new MyJPanel("Panel", 100, 100, button1);

		MyJFrame frame = new MyJFrame("Frame", 200, 200, panel);

	}
}
