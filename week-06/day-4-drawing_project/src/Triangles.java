import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        int w = WIDTH;
        int h = HEIGHT;
        int base = 10;
        int height = 15;
        int i1 =10;
        int j1 = 15;
        int i2 = 9;
        int j2 = 14;

        int[][] matrix1 = new int[i1][j1];
        int[][] matrix2 = new int[i2][j2];
        Arrays.fill(matrix1, 1);
        Arrays.fill((matrix2, 2));
        for (int i = 0; i < i1; i++) {
            for (int j = 0; j < j1; j++) {
                if ((i + j) < w/2) {
                     matrix1[i][j] = 0;

            }

        }

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