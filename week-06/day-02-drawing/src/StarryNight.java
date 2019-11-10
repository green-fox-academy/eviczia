import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0,0, WIDTH, HEIGHT);
        int starNo = 100;
        int starSize = 20;
        for (int i = 0; i < starNo; i++) {
            drawStar(starSize, graphics);
        }
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)



    }

    private static void drawStar(int starSize, Graphics graphics) {
        int[] randomCoord = {(int)(Math.random()*(WIDTH-starSize)), (int)(Math.random()*(HEIGHT-starSize))};
        graphics.setColor(new Color((int)(0 + Math.random()*20), (int)(0 + Math.random()*20),(int)(0 + Math.random()*20)));
        graphics.fillRect(randomCoord[0], randomCoord[1], starSize, starSize);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}