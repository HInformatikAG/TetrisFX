package com.hoffrogge.tetris.javafx;

import com.hoffrogge.tetris.ui.TetrisGraphics;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

@SuppressWarnings("restriction")
public class JavaFXTetrisGraphics implements TetrisGraphics {

    private GraphicsContext graphicsContext;

    public JavaFXTetrisGraphics(GraphicsContext graphicsContext) {
        this.graphicsContext = graphicsContext;
    }

    @Override
    public boolean hasGraphics() {
        return graphicsContext != null;
    }

    @Override
    public void maleLinie(int x1, int y1, int x2, int y2) {

        graphicsContext.setFill(Color.GREEN);
        graphicsContext.setStroke(Color.BLUE);
        graphicsContext.setLineWidth(5);
        graphicsContext.strokeLine(x1, y1, x2, y2);
    }

    @Override
    public void fillRect(int x, int y, int breite, int tiefe) {
        // Auto-generated method stub

    }

    @Override
    public void setColor(int r, int g, int b) {
        // Auto-generated method stub
    }
}
