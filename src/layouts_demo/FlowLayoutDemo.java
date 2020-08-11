package layouts_demo;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends LayoutDefaultButtons {

	@Override
	public void useLayout(JPanel panel) {
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
	}
}
