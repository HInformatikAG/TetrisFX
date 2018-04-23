package com.hoffrogge.tetris.ui;

import com.hoffrogge.tetris.TetrisModel;

public interface Canvas {

    void refresh(TetrisGraphicsContext tetrisGraphics, TetrisModel tetrisModel);

    void render(TetrisGraphicsContext tetrisGraphics, TetrisModel tetrisModel);

}