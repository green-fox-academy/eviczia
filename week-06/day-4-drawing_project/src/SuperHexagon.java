import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void mainDraw(Graphics graphics) {

// define parameters
        int side = 30; // side length of one hexagon
        int halfSide = side / 2;
        int halfHeight = (int) (Math.sqrt(3) * side) / 2; // half height of one hexagon (height of "side" based eq.triangle)
        int w = WIDTH / 2;
        int h = HEIGHT / 2;
        int layers = 3; // number of concentric circles of hexagons (including middle)
        // if we want to change the layers, we need to manually set the x,y array length and then
        // the if condition to omit hexagons
        int[] x = new int[layers + 2]; // define array to hold x coordinates of hexagon centers
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (w + (i - layers + 1) * 1.5 * side);
        }
        int[] y = new int[layers + 6]; // define array to hold y coordinates of hexagon centers
        for (int i = 0; i < y.length; i++) {
            y[i] = h + (i - layers - 1) * halfHeight;
        }
// pair the xy coordinates to form the center of the hexagons,
// from starting from hexagon center, define  each hexagons' angles' coordinates as parameters.
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < x.length; j++) {
                // we do not want to draw hexagon to every X-Y coordinate pair
                see:
                https:
//docs.google.com/spreadsheets/d/1jblIqXlIv7JqDDyNh1l_XEoDsoPMjIdWxOJtttl0ltA/edit#gid=852833476
                if (((i + j) % 2 == 0) && ((i + j != 0) && (i + j != 12) && (i - j != 8) && (j - i != 4))) {
                    int[] xx = new int[]{x[j] - side / 2, x[j] + side / 2, x[j] + side, x[j] + side / 2, x[j] - side / 2, x[j] - side,};
                    int[] yy = new int[]{y[i] - halfHeight, y[i] - halfHeight, y[i], y[i] + halfHeight, y[i] + halfHeight, y[i]};

                    //     Polygon hex = new Polygon(xx, yy,side);
                    int n = 6;
                    graphics.setColor(Color.BLUE);
                    graphics.drawPolygon(xx, yy, n);
                }
            }
        }
    }

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