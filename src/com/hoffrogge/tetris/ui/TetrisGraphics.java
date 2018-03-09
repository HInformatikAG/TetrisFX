package com.hoffrogge.tetris.ui;

public interface TetrisGraphics {

    boolean hasGraphics();

    void maleLinie(int x1, int y1, int x2, int y2);

    void setColor(int r, int g, int b);

    void fillRect(int x, int y, int breite, int tiefe);
}
