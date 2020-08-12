package main.java.hw._03;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyCalc {

	private JButton buttonAdd;
	private JButton buttonSubtract;
	private JButton buttonDivide;
	private JButton buttonMultiply;

	private JLabel labelNumber1;
	private JLabel labelNumber2;
	private JLabel labelResult;

	private JTextField textFieldNumber1;
	private JTextField textFieldNumber2;
	private JTextField textFieldResult;

	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;

	private JFrame frame;

	public static void main(String[] args) {

		try {
			UIManager.setLookAndFeel(new AcrylLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			Logger.getLogger(MyCalc.class.getName()).log(Level.SEVERE, null, e);
		}

		JFrame.setDefaultLookAndFeelDecorated(true);


		MyCalc myCalc = new MyCalc();
		myCalc.createButtons();
		myCalc.createLabels();
		myCalc.createTextFields();
		myCalc.createPanels();
		myCalc.createFrame();
	}


	private void createButtons() {
		buttonAdd = new JButton(" + ");
		buttonSubtract = new JButton(" - ");
		buttonDivide = new JButton(" * ");
		buttonMultiply = new JButton(" / ");
	}

	private void createLabels() {
		labelNumber1 = new JLabel("Number 1");
		labelNumber2 = new JLabel("Number 2");
		labelResult = new JLabel("Result");
	}

	private void createTextFields() {
		textFieldNumber1 = new JTextField(10);
		textFieldNumber2 = new JTextField(10);

		textFieldResult = new JTextField(15);
		textFieldResult.setForeground(Color.RED);
		textFieldResult.setEditable(false);
		textFieldResult.setFocusable(false);
	}

	private void createPanels() {
		panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel1.setName("panel1");
		panel1.setSize(100, 100);
		panel1.setPreferredSize(new Dimension(200, 50));
		panel1.setBorder(BorderFactory.createEtchedBorder());

		panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel2.setName("panel2");
		panel2.setSize(100, 100);
		panel2.setPreferredSize(new Dimension(200, 50));
		panel2.setBorder(BorderFactory.createEtchedBorder());

		panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel3.setName("panel3");
		panel3.setSize(100, 100);
		panel3.setPreferredSize(new Dimension(200, 50));
		panel3.setBorder(BorderFactory.createEtchedBorder());

		panel1.add(labelNumber1);
		panel1.add(textFieldNumber1);
		panel1.add(labelNumber2);
		panel1.add(textFieldNumber2);

		panel2.add(buttonAdd);
		panel2.add(buttonSubtract);
		panel2.add(buttonDivide);
		panel2.add(buttonMultiply);

		panel3.add(labelResult);
		panel3.add(textFieldResult);
	}

	private void createFrame() {
		frame = new JFrame("Calculator");
		frame.setSize(430, 200);
		frame.setMinimumSize(new Dimension(430,200));
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout(2,2));
		frame.setIconImage(new ImageIcon("src/main/resources/icon.jpg").getImage());

		frame.setResizable(false);

		frame.getContentPane().add(panel1, BorderLayout.NORTH);
		frame.getContentPane().add(panel2, BorderLayout.CENTER);
		frame.getContentPane().add(panel3, BorderLayout.SOUTH);

		frame.setVisible(true);
	}
}
