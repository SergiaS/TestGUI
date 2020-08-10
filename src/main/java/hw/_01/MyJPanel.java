package main.java.hw._01;

import javax.swing.*;
import java.awt.*;

public class MyJPanel extends JPanel {

	public MyJPanel(String name, int width, int height) {
		super.setName(name);
		super.setSize(width, height);
		super.setBorder(BorderFactory.createEtchedBorder()); // создает рамку
	}

	// добавляет компонент на панель
	public MyJPanel(String name, int width, int height, Component component) {
		this(name, width, height);
		super.add(component);
	}

	// добавляет компонент на панель
	public MyJPanel(String name, int width, int height, Component ... components) {
		this(name, width, height);

		for (Component component : components) {
			super.add(component);
		}
	}

	// указывает расположение
	public MyJPanel(String name, int width, int height, LayoutManager layout) {
		this(name, width, height);
		super.setLayout(layout);
	}

	// указывает расположение и добавляет компонент на панель
	public MyJPanel(String name, int width, int height, LayoutManager layout, Component component) {
		this(name, width, height);
		super.add(component);
		super.setLayout(layout);
	}

	public MyJPanel(String name, int width, int height, Color color) {
		this(name, width, height);
		super.setBorder(BorderFactory.createEtchedBorder());
		super.setBackground(color);
	}

}
