package main.java.hw._01;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MyJFrame extends JFrame {

	public MyJFrame(String title, int width, int height) {
		super(title);
		super.setSize(width, height);
		super.setLocationRelativeTo(null); // чтобы фрейм возникал по центру
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрывается по нажатию кнопки
		super.setLayout(new FlowLayout());
		super.setIconImage(new ImageIcon("src/main/resources/icon.jpg").getImage());
		super.setVisible(true);
	}

	// конструктор добавлющий новый компонент в фрейм
	public MyJFrame(String title, int width, int height, Component comp) {
		this(title, width, height);
		super.getContentPane().add(comp);
	}

	// конструктор добавлющий новые компоненты в фрейм
	public MyJFrame(String title, int width, int height, Component ... components) {
		this(title, width, height);

		for (Component component : components) {
			super.getContentPane().add(component);
		}
	}
}
