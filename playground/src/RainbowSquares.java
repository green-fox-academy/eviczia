import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowSquares {
    public static void mainDraw(Graphics graphics){
//        System.out.println("Give me a number between 0 and 255!");
//        int usersGuess = getUserInput();

        // fill up rgb matrix
        int a = 128;
        int x = 0;
        int y = 0;
        rainbowSquareR128(a, x, y, graphics);
        a = 128;
        x = 256;
        y = 0;
        rainbowSquareG128(a, x, y, graphics);
        a = 128;
        x = 0;
        y = 256;
        rainbowSquareB128(a, x, y, graphics);
    }

    private static void rainbowSquareR128(int r, int x, int y, Graphics graphics) {
        for (int g = 0; g < 256; g++) {
            for (int b = 0; b < 256; b++) {
                graphics.setColor(new Color(r, g, b));
                graphics.fillRect(x + g,y + b,1,1);
            }
        }
    }

    private static void rainbowSquareG128(int g, int x, int y, Graphics graphics) {
        for (int r = 0; r < 256; r++) {
            for (int b = 0; b < 256; b++) {
                graphics.setColor(new Color(r, g, b));
                graphics.fillRect(x + r,y + b,1,1);
            }
        }
    }
    private static void rainbowSquareB128(int b, int x, int y, Graphics graphics) {
        for (int r = 0; r < 256; r++) {
            for (int g = 0; g < 256; g++) {
                graphics.setColor(new Color(r, g, b));
                graphics.fillRect(x + r,y + g,1,1);
            }
        }
    }

/*    private static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }*/


    // Don't touch the code below
    static int WIDTH = 512;
    static int HEIGHT = 512;

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