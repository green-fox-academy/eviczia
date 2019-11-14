import javafx.scene.chart.XYChart;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void mainDraw(Graphics graphics) {

        int side = 30;
        int halfSide = side / 2;
        int halfHeight = (int)(Math.sqrt(3)*side)/2;
        int w = WIDTH / 2;
        int h = HEIGHT / 2;
        int[] x = new int[5];
        int[] y = new int[9];

   //     Polygon hex = new Polygon(w, y,side);


        for (int i = 0; i < x.length; i++) {
            x[i] = (int)(w + (i-2)*1.5 * side);
        }

        for (int i = 0; i < y.length; i++) {
            y[i] = h + (i-4) * halfHeight;
        }

        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (((i+j) % 2==0) && ((i+j!=0) && (i+j !=12) && (i-j !=8) && (j-i !=4))) {
                    int[] xx = new int[]{x[j] - side/2, x[j] + side/2, x[j] + side, x[j] + side/2, x[j] - side/2, x[j] - side, };
                    int[] yy = new int[]{y[i] - halfHeight, y[i] - halfHeight, y[i], y[i] + halfHeight, y[i] + halfHeight, y[i]};

                    //     Polygon hex = new Polygon(w, y,side);
                    int n = 6;
                    graphics.setColor(Color.BLUE);
                    graphics.drawPolygon(xx, yy, n);
                }
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