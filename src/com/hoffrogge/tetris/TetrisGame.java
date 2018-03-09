package com.hoffrogge.tetris;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.hoffrogge.tetris.ui.TetrisCanvas;
import com.hoffrogge.tetris.ui.TetrisGraphics;

public class TetrisGame implements Runnable {

    private static int       width   = 300;
    private static int       height  = width / 16 * 9;
    private static int       scale   = 3;

    private Thread           mainThread;
    private volatile boolean running = false;

    private TetrisCanvas     tetrisCanvas;
    private TetrisGraphics   tetrisGraphics;
    private TetrisModel      tetrisModel;

    public TetrisGame(TetrisCanvas tetrisCanvas, TetrisGraphics tetrisGraphics) {
        this.tetrisCanvas = tetrisCanvas;
        this.tetrisGraphics = tetrisGraphics;
        this.tetrisModel = new TetrisModel(this);
    }

    public float getWidht() {
        return width * (float) scale;
    }

    public float getHeight() {
        return height * (float) scale;
    }

    public synchronized void start() {

        running = true;

        mainThread = new Thread(this, "Display"); //$NON-NLS-1$
        mainThread.start();
    }

    @Override
    public void run() {

        int tickCounter = 0;

        while (running) {

            tickCounter++;
            tetrisModel.setCount(tickCounter);
            update();

            tetrisCanvas.refresh(tetrisGraphics, tetrisModel);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Logger.getGlobal().log(Level.OFF, e.getMessage(), e);
                Thread.currentThread().interrupt();
            }
        }
    }

    public synchronized void stop() throws InterruptedException {

        running = false;

        mainThread.join();
    }

    public void update() {
        /* Noch nichts zu tun hier */
    }
}
