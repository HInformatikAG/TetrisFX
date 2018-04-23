package com.hoffrogge.tetris.event;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.hoffrogge.tetris.TetrisGameLoop;

import javafx.event.EventHandler;
import javafx.stage.WindowEvent;

public class TetrisOnClosingEventHandler implements EventHandler<WindowEvent> {

	private TetrisGameLoop tetrisGame;

	public TetrisOnClosingEventHandler(TetrisGameLoop tetrisGame) {
		this.tetrisGame = tetrisGame;
	}

	@Override
	public void handle(WindowEvent event) {

		try {

			this.tetrisGame.stop();

		} catch (InterruptedException e) {
			Logger.getGlobal().log(Level.OFF, e.getMessage(), e);
			Thread.currentThread().interrupt();
		}
	}
}
