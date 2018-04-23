package com.hoffrogge.tetris.swing;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit03.Farbe;
import com.hoffrogge.tetris.ui.TetrisGraphicsContext;

public class SwingTetrisGraphics implements TetrisGraphicsContext {

	private Graphics graphics;

	@Override
	public boolean hasGraphics() {
		return graphics != null;
	}

	public void setGraphics(Graphics graphics) {
		this.graphics = graphics;
	}

	@Override
	public void maleLinie(int x1, int y1, int x2, int y2) {
		graphics.drawLine(x1, y1, x2, y2);
	}

	@Override
	public void setColor(Farbe farbe) {
		graphics.setColor(farbe.konvertiereZuColor());
	}

	@Override
	public void fillRect(int x, int y, int breite, int tiefe) {
		graphics.fillRect(x, y, breite, tiefe);
	}
}
