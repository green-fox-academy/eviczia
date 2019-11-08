import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TrianglesMatrix {
    public static void mainDraw(Graphics graphics) {
        graphics.drawLine();
        int h = 10;
        int xA = WIDTH/2;
        int yA = 20;
        int xB = xA - h/2;//(int) (height/Math.sqrt(3));
        int yB = yA + h;
        int xC = xA + h/2;//(int) (height/Math.sqrt(3));
        int yC = yB;


        int[] corner = new int[] {xA, yA, xB, yB, xC, yC};
        for (int i = 1; i < 10; i++) {
            int[] newCorner = new int [i*2];
            newCorner[0] = corner[2];
            newCorner[1] = corner[3];



        }
        drawTriangle (corner, graphics);
    }

    private static void drawTriangle(int[] corner, Graphics graphics) {
        graphics.drawLine(corner[0], corner[1], corner[2], corner[3]);
        graphics.drawLine(corner[2], corner[3], corner[4], corner[5]);
        graphics.drawLine(corner[4], corner[5], corner[0], corner[1]);
*/
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