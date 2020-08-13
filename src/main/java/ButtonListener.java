package main.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {

	private JPanel panel;

	public ButtonListener(JPanel panel) {
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// если была нажата кнопка
		if (e.getSource() instanceof JButton) {
			JButton tmpButton = (JButton) e.getSource();
			JOptionPane.showMessageDialog(panel, "test message from " + tmpButton.getText());
		}
	}
}
