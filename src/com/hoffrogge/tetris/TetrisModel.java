package com.hoffrogge.tetris;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit04.GeometrischeFigur;

public class TetrisModel {

	private int count;
	private TetrisGameLoop tetrisGame;

	private GeometrischeFigur fallenderStein;
	// private List<GeometrischeFigur> gefalleneSteine;

	public TetrisModel(TetrisGameLoop tetrisGame) {
		this.tetrisGame = tetrisGame;
	}

	public int getWidth() {
		return (int) tetrisGame.getWidht();
	}

	public int getHeight() {
		return (int) tetrisGame.getHeight();
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void update(Graphics graphics) {

		if (fallenderStein == null)
			fallenderStein = randomNeue();

		/* Ist das Spiel vorbei? */

		/* Ermitteln, ob der gefallene Stein nun zu den gefallenen gehört */

		// for (GeometrischeFigur geometrischeFigur : gefalleneSteine)
		// geometrischeFigur.zeichnen(tetrisGraphics);

		fallenderStein.zeichnen(graphics);
	}

	private GeometrischeFigur randomNeue() {

		int x = getWidth() / 2;
		int y = 100;

		return new TetrominoBlock(x, y);
	}
}
