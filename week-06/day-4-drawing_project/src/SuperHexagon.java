import javafx.scene.chart.XYChart;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void mainDraw(Graphics graphics) {

        int side = 10;
        int halfSide = side / 2;
        int halfHeight = (int)(Math.sqrt(3)*side)/2;
        int w = WIDTH / 2;
        int h = HEIGHT / 2;
        int[] x = new int[]{w - halfSide, w + halfSide, w + side, w + halfSide, w - halfSide, w - side, };
        int[] y = new int[]{h - halfHeight, h - halfHeight, h, h + halfHeight, h + halfHeight, h};

   //     Polygon hex = new Polygon(w, y,side);
        int n = 6;
        graphics.setColor(Color.BLUE);
        graphics.drawPolygon(x, y, n);

        int hxNo = 7;
        int xY = 2;
        int[][] middleLineXYs = new int[hxNo][xY];
        middleLineXYs[0][0] = -hxNo/2 * (-3*halfSide);
        middleLineXYs[0][1] = -(hxNo/2+1) * (-3*halfSide);
        middleLineXYs[0][2] = -(hxNo/2+2) * (-3*halfSide);
        middleLineXYs[0][3] = -(hxNo/2+3) * (-3*halfSide);

        for (int i = -3; i < hxNo-3; i++) {
            middleLineXYs[i+3] = {



            }
            middleLineXYs

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