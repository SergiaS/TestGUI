package main.java.hw._01;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {

	public MyJFrame(String title, int width, int height) {
		super(title);
		super.setSize(width, height);
		super.setLocationRelativeTo(null); // чтобы фрейм возникал по центру
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрывается по нажатию кнопки
		super.setLayout(new FlowLayout());
		super.setIconImage(new ImageIcon("src/main/resources/icon.jpg").getImage());
	}

	// конструктор добавлющий новый компонент в фрейм
	public MyJFrame(String title, int width, int height, Component comp) {
		this(title, width, height);
		super.getContentPane().add(comp);
	}

	public MyJFrame(String title, int width, int height, LayoutManager layout) {
		super(title);
		super.setSize(width, height);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setLayout(layout);
		super.setIconImage(new ImageIcon("src/main/resources/icon.jpg").getImage());
	}

	// конструктор добавлющий новые компоненты в фрейм
	public MyJFrame(String title, int width, int height, Component ... components) {
		this(title, width, height);

		for (Component component : components) {
			super.getContentPane().add(component);
		}
	}
}
