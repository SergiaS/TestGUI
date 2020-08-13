package main.java;

import javax.swing.*;
import java.awt.*;

public class TestApplet extends JApplet {

	private JPanel panel = new JPanel();
	private JLabel label = new JLabel();

	@Override
	public void init() {
		super.init();
		panel.setLayout(new FlowLayout());
		String paramLabel = getParameter("labelText");
		label.setText(paramLabel);
		panel.add(label);
		getContentPane().add(panel);
	}

	@Override
	public void destroy() {
		super.destroy();
	}
}
