package com.hoffrogge.tetris.ui;

import com.hoffrogge.tetris.TetrisModel;

public interface Canvas {

    void refresh(TetrisGraphics tetrisGraphics, TetrisModel tetrisModel);

    void render(TetrisGraphics tetrisGraphics, TetrisModel tetrisModel);

}