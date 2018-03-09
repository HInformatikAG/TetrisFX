package com.hoffrogge.tetris.ui;

import com.hoffrogge.tetris.TetrisModel;

public abstract class AbstractCanvas implements Canvas {

    @Override
    public void refresh(TetrisGraphics tetrisGraphics, TetrisModel tetrisModel) {

        if (tetrisGraphics.hasGraphics()) {

            tetrisGraphics.setColor(255, 255, 255);
            tetrisGraphics.fillRect(0, 0, tetrisModel.getWidht(), tetrisModel.getHeight());

            tetrisGraphics.setColor(50, 50, 50);

            render(tetrisGraphics, tetrisModel);
        }
    }
}
