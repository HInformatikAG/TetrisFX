package com.hoffrogge.tetris.swing;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;

import com.hoffrogge.tetris.TetrisGameLoop;
import com.hoffrogge.tetris.ui.TetrisCanvas;

@SuppressWarnings("serial")
public class TetrisSwingJFrame extends JFrame {

	private transient TetrisGameLoop tetrisGame;
	private transient SwingTetrisGraphics tetrisGraphics;
	private Canvas canvas;

	public TetrisSwingJFrame() {

		canvas = new Canvas();

		add(canvas);

		tetrisGraphics = new SwingTetrisGraphics();
		TetrisCanvas tetrisCanvas = new TetrisCanvas();

		tetrisGame = new TetrisGameLoop(tetrisCanvas, tetrisGraphics) {
			@Override
			public void update() {
				super.update();
				canvas.setVisible(true);
			}
		};

		setSize(new Dimension((int) tetrisGame.getWidht(), (int) tetrisGame.getHeight()));
		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {

				try {

					tetrisGame.stop();

				} catch (InterruptedException e1) {
					Logger.getGlobal().log(Level.OFF, e1.getMessage(), e1);
					Thread.currentThread().interrupt();
				}

				dispose();
				setVisible(false);
			}
		});

	}

	@Override
	public void setVisible(boolean b) {

		super.setVisible(b);

		Graphics graphics = canvas.getGraphics();
		tetrisGraphics.setGraphics(graphics);
		tetrisGame.setGraphics(graphics);

		BufferStrategy bufferStrategy = canvas.getBufferStrategy();

		if (bufferStrategy == null)
			canvas.createBufferStrategy(3);

		tetrisGame.start();
	}

	public static void main(String[] args) {

		TetrisSwingJFrame tetrisSwingJFrame = new TetrisSwingJFrame();
		tetrisSwingJFrame.setVisible(true);

	}
}
