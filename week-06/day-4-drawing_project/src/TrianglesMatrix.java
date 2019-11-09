import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TrianglesMatrix {
    public static void mainDraw(Graphics graphics) {
        int w = WIDTH;
        int h = HEIGHT;
        double divideW = 8;
        double divideH = Math.sqrt(3) / 2 * w / 8;

        int heightTr = (int) divideH;
        int xA = w /2;
        int yA = heightTr;
        int xB = xA - heightTr / 2;//(int) (height/Math.sqrt(3));
        int yB = yA + heightTr;
        int xC = xA + heightTr / 2;//(int) (height/Math.sqrt(3));
        int yC = yB;


        int[] corner = new int[]{xA, yA, xB, yB, xC, yC};
        for (int i = 1; i < 10; i++) {
            int[] newCorner = new int[i * 2];
            newCorner[0] = corner[2];
            newCorner[1] = corner[3];

        }
        drawTriangle(corner, graphics);
    }

    private static void drawTriangle(int[] corner, Graphics graphics) {
        graphics.drawLine(corner[0], corner[1], corner[2], corner[3]);
        graphics.drawLine(corner[2], corner[3], corner[4], corner[5]);
        graphics.drawLine(corner[4], corner[5], corner[0], corner[1]);
    }




/*        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                graphics.setColor(Color.BLUE);
                graphics.drawLine(0, (i+10) * 2, (i+10) * 2, 0);
                graphics.setColor(Color.BLUE);
                graphics.drawLine((i+10) * 2, 0, 0, (j+10) * 2);*/
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