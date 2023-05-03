package org.example;

import java.awt.*;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import static javax.swing.SwingUtilities.paintComponent;

public class GamePhysics extends Canvas implements ActionListener, KeyListener, Runnable {
    private Thread thread;
    private boolean running = false;
    public synchronized void start() {
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    public synchronized void stop() {
        try {
            thread.join();
            running = false;
        } catch (Exception e) {

        }
    }

    @Override
    public void run() {
        this.requestFocus();
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;

        while (running) {
            try {
                long now = System.nanoTime();
                delta += (now - lastTime) / ns;
                lastTime = now;

                while (delta >= 1) {
                    delta--;
                }

                if (running) {
                    paintComponent();
                }
                frames++;

                if (System.currentTimeMillis() - timer > 1000) {
                    timer += 1000;
                    System.out.println("FPS:  " + frames);
                    frames = 0;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.toString());
            }

        }
    }
    private void paintComponent() {
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null) {
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();

        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 0, 1366, 768);

        //Player
        g.setColor(Color.BLUE);
        g.fillRect(40,40,25,25);
        g.dispose();
        bs.show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
    /*

    public GamePhysics() {

    }
    void Objects() {

    }
    void VelocityModes() {

    }
    static void Camera() {

    }
    static void Move() {
    //    PlayerMove();

    //    CameraMove();

    //    void LevelMove();

    //    void EditorMove();

    }
     */
}

