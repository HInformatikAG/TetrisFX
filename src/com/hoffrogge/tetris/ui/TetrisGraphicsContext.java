package com.hoffrogge.tetris.ui;

import com.hoffrogge.lehreinheit03.Farbe;

public interface TetrisGraphicsContext {

	boolean hasGraphics();

	void maleLinie(int x1, int y1, int x2, int y2);

	void setColor(Farbe farbe);

	void fillRect(int x, int y, int breite, int tiefe);
}
