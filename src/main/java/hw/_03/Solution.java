package main.java.hw._03;

import com.jtattoo.plaf.smart.SmartLookAndFeel;
import main.java.hw._01.MyJButton;
import main.java.hw._01.MyJFrame;
import main.java.hw._01.MyJPanel;
import main.java.hw._01.MyJTextField;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Solution {

	private MyJButton btnAdd;
	private MyJButton btnSubtract;
	private MyJButton btnDivide;
	private MyJButton btnMultiply;

	private JLabel labelNumber1;
	private JLabel labelNumber2;
	private JLabel labelResult;

	private MyJTextField jtxtNumber1;
	private MyJTextField jtxtNumber2;
	private MyJTextField jtxtResult;

	private MyJPanel panel1;
	private MyJPanel panel2;
	private MyJPanel panel3;

	private MyJFrame frame;

	public static void main(String[] args) {

		try {
			UIManager.setLookAndFeel(new SmartLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			Logger.getLogger(Solution.class.getName()).log(Level.SEVERE, null, e);
		}

		JFrame.setDefaultLookAndFeelDecorated(true);

		Solution solution = new Solution();
		solution.createLabels();
		solution.createTextFields();
		solution.createButtons();
		solution.createPanels();
		solution.createFrame();
	}

	private void createButtons() {
		btnAdd = new MyJButton("Сложение");
		btnSubtract = new MyJButton("Вычитание");
		btnDivide = new MyJButton("Деление");
		btnMultiply = new MyJButton("Умножение");
	}

	private void createLabels() {
		labelNumber1 = new JLabel("Number 1");
		labelNumber2 = new JLabel("Number 2");
		labelResult = new JLabel("Result");
	}

	private void createTextFields() {
		jtxtNumber1 = new MyJTextField(10);
		jtxtNumber2 = new MyJTextField(10);

		jtxtResult = new MyJTextField(15, Color.RED);
		jtxtResult.setEditable(false); // не изменяемое поле мышей
		jtxtResult.setFocusable(false); // не изменяемое поле с клавы (TAB)
	}

	private void createPanels() {
		panel1 = new MyJPanel("panel1", 100, 100);
		panel1.setPreferredSize(new Dimension(200,50));
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT));

		panel2 = new MyJPanel("panel2", 100, 100);
		panel2.setPreferredSize(new Dimension(200,50));
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));

		panel3 = new MyJPanel("panel3", 100, 100);
		panel3.setPreferredSize(new Dimension(200,50));
		panel3.setLayout(new FlowLayout(FlowLayout.LEFT));

		panel1.add(labelNumber1);
		panel1.add(jtxtNumber1);
		panel1.add(labelNumber2);
		panel1.add(jtxtNumber2);

		panel2.add(btnAdd);
		panel2.add(btnSubtract);
		panel2.add(btnDivide);
		panel2.add(btnMultiply);

		panel3.add(labelResult);
		panel3.add(jtxtResult);
	}

	private void createFrame() {
		frame = new MyJFrame("Калькулятор", 430, 200, new BorderLayout(2, 2));
		frame.setMinimumSize(new Dimension(430, 200));

//		frame.setResizable(false); // запрещает приложению менять размер, +убирет кнопку свернуть/развернуть

		frame.getContentPane().add(panel1, BorderLayout.NORTH);
		frame.getContentPane().add(panel2, BorderLayout.CENTER);
		frame.getContentPane().add(panel3, BorderLayout.SOUTH);

		frame.setVisible(true);
	}
}
