package com.hoffrogge.tetris.ui;

import com.hoffrogge.tetris.TetrisModel;

public abstract class AbstractCanvas implements Canvas {

	@Override
	public void refresh(TetrisGraphicsContext tetrisGraphics, TetrisModel tetrisModel) {

		// if (tetrisGraphics.hasGraphics()) {
		//
		// tetrisGraphics.setColor(new Farbe(255, 255, 255));
		// tetrisGraphics.fillRect(0, 0, tetrisModel.getWidth(),
		// tetrisModel.getHeight());
		//
		// tetrisGraphics.setColor(new Farbe(50, 50, 50));
		//
		// render(tetrisGraphics, tetrisModel);
		// }

		render(tetrisGraphics, tetrisModel);
	}
}
