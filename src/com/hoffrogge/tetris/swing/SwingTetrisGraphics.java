package com.hoffrogge.tetris.swing;

import java.awt.Color;
import java.awt.Graphics;

import com.hoffrogge.tetris.ui.TetrisGraphics;

public class SwingTetrisGraphics implements TetrisGraphics {

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
    public void setColor(int r, int g, int b) {
        graphics.setColor(new Color(r, g, b));
    }

    @Override
    public void fillRect(int x, int y, int breite, int tiefe) {
        graphics.fillRect(x, y, breite, tiefe);
    }
}
