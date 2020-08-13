package main.java.calculator.listeners;

import main.java.TestGUI;
import main.java.calculator.gui.MyJTextField;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class CalcTextFieldFocusListener implements FocusListener {

	private MyJTextField field;

	public CalcTextFieldFocusListener(MyJTextField field) {
		this.field = field;
	}

	@Override
	public void focusGained(FocusEvent e) {
		if (field.getText().trim().equals(TestGUI.INPUT_NUMBER)) { // если дефолтное значении
			field.setText(""); // тогда убираем текст
			field.setForeground(Color.BLACK);
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		if (field.getText().trim().equals("")) { // если пользователем ничего не было введено
			field.setText(TestGUI.INPUT_NUMBER); // тогда опять вставляем дефолтную константу
			field.setForeground(Color.GRAY);
		}
	}
}
