package main.java;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;

public class TestGUI {
	public static void main(String[] args) {
		try {
//			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			UIManager.setLookAndFeel(new MetalLookAndFeel()); // команда для изменения внешнего вида внутренних компонентов
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		JFrame.setDefaultLookAndFeelDecorated(true); // команда для изменения внешнего вида самого окна

		JFrame frame = new JFrame("Test Frame");
		frame.setIconImage(new ImageIcon("https://i-dgtl.ru/wp-content/uploads/2017/01/skype-icon-15.png").getImage());
//		frame.setIconImage(new ImageIcon("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTY2kUXD6LqDNvdN93NiHhQLlvxAkd8KTtJ6Q&usqp=CAU").getImage());

		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		frame.setLocationRelativeTo(null);

		FlowLayout fl = new FlowLayout();
		frame.setLayout(fl);

		JButton button = new JButton("Test Button");
		button.setSize(300, 200);

		JPanel panel = new JPanel(fl);
		panel.setBorder(BorderFactory.createEtchedBorder());
		panel.setSize(300, 300);
		panel.add(button);

		frame.getContentPane().add(panel);

	}
}
