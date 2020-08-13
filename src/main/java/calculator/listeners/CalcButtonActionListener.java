package main.java.calculator.listeners;

import main.java.calculator.CalcOperations;
import main.java.calculator.gui.MyJTextField;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButtonActionListener implements ActionListener {

	private MyJTextField jtxtNumber1;
	private MyJTextField jtxtNumber2;
	private MyJTextField jtxtResult;

	public CalcButtonActionListener(MyJTextField jtxtNumber1, MyJTextField jtxtNumber2, MyJTextField jtxtResult) {
		this.jtxtNumber1 = jtxtNumber1;
		this.jtxtNumber2 = jtxtNumber2;
		this.jtxtResult = jtxtResult;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (!(e.getSource() instanceof JButton)) return;

		JButton tmpButton = (JButton) e.getSource();

		final double a = Double.parseDouble(jtxtNumber1.getText());
		final double b = Double.parseDouble(jtxtNumber2.getText());

		if (tmpButton.getActionCommand().equals("Сложение")) {
			jtxtResult.setText(String.valueOf(CalcOperations.add(a, b)));
		} else if (tmpButton.getText().equals("Вычитание")) {
			jtxtResult.setText(String.valueOf(CalcOperations.substract(a, b)));
		} else if (tmpButton.getText().equals("Деление")) {
			jtxtResult.setText(String.valueOf(CalcOperations.divide(a, b)));
		} else if (tmpButton.getText().equals("Умножение")) {
			jtxtResult.setText(String.valueOf(CalcOperations.multiply(a, b)));
		}
	}
}
