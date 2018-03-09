package com.hoffrogge.tetris;

public class TetrisModel {

	private int count;
	private TetrisGame tetrisGame;

	public TetrisModel(TetrisGame tetrisGame) {
		this.tetrisGame = tetrisGame;
	}

	public int getWidht() {
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
}
