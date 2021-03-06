package com.hoffrogge.tetris.javafx;

import com.hoffrogge.tetris.TetrisGameLoop;
import com.hoffrogge.tetris.event.TetrisOnClosingEventHandler;
import com.hoffrogge.tetris.ui.TetrisCanvas;
import com.hoffrogge.tetris.ui.TetrisGraphicsContext;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class TetrisApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Canvas canvas = new Canvas(300, 600);
		GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

		TetrisGraphicsContext tetrisGraphics = new JavaFXTetrisGraphics(graphicsContext);
		TetrisCanvas tetrisCanvas = new TetrisCanvas();

		TetrisGameLoop tetrisGame = new TetrisGameLoop(tetrisCanvas, tetrisGraphics);

		primaryStage.setResizable(false);
		primaryStage.setTitle("Java FX Tetris"); //$NON-NLS-1$
		primaryStage.setWidth(tetrisGame.getWidht());
		primaryStage.setHeight(tetrisGame.getHeight());
		primaryStage.setOnCloseRequest(new TetrisOnClosingEventHandler(tetrisGame));

		Group root = new Group();

		root.getChildren().add(canvas);

		primaryStage.setScene(new Scene(root));
		primaryStage.show();
		tetrisGame.start();
	}

	public static void main(String[] args) {
		launch(args);
	}
}