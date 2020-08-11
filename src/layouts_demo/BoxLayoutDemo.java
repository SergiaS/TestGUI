package layouts_demo;

import javax.swing.*;

public class BoxLayoutDemo extends LayoutDefaultButtons {

	@Override
	public void useLayout(JPanel panel) {
		BoxLayout bl = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(bl);
	}
}
