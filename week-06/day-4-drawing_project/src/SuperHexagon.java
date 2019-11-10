import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void mainDraw(Graphics graphics) {

        int side = 6;
        int w = WIDTH / 2;
        int h = HEIGHT / 2;
        int[] x = new int[]{w - 20, w + 20, w + 30, w + 20, w - 20, w - 30, };
        int[] y = new int[]{h - 20, h - 20, h, h + 20, h + 20, h};

   //     Polygon hex = new Polygon(w, y,side);
        int n = 6;
        graphics.setColor(Color.BLUE);
        graphics.drawPolygon(x, y, n);
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