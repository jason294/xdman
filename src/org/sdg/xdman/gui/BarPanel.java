package org.sdg.xdman.gui;

import java.awt.*;

import javax.swing.*;

public class BarPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5396480713429517585L;
	Image imgBar;

	public BarPanel() {
		super();
		imgBar = StaticResource.getIcon("bar.png").getImage();
		this.setOpaque(false);
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(imgBar, 0, 0, this.getWidth(), this.getHeight(), this);// ,
		super.paintComponent(g);
	}
}
