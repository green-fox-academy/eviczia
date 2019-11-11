import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
// define data for equlateral triangle
        int base =50; //  little triangle's side
        int w = WIDTH - (WIDTH % base); //big triangle's base (side)
        int n = w / base; // number of lines in big triangle

        // Create arrays that contain the x and y coorinates for the two sloping sides (a and b)
        int[] aSideX = new int[n];
        int[] aSideY = new int[n];
        int[] bSideX = new int[n];
        int[] bSideY = new int[n];

        //  give the starting and end coordinates of sides a and be
        aSideX[0] = WIDTH/2;
        aSideY[0] = 20;
        bSideX[0] = aSideX[0];
        bSideY[0] = aSideY[0];

        // calculate the height of little triangle (height) and big triangle (h)
        int height = (int)(Math.sqrt(3)/2*base);
        int h = height * (n);

        // fill up the side a and b sides' coordinates AND then draw the triangles by connecting them
        for (int i = 1; i < n -1; i++) {
            aSideX[i] = aSideX[0] - i*base /2;
            aSideY[i] = aSideY[0] + i*height;
            bSideX[i] = bSideX[0] + i*base /2;
            bSideY[i] = bSideY[0] + i*height;
            //connect sides a and b with horizontal lines:
            graphics.drawLine(aSideX[i], aSideY[i], bSideX[i], bSideY[i]);

            // go from side b coordinates' to the base
            graphics.drawLine(bSideX[i-1], bSideY[i-1], (WIDTH - w) / 2 + i * base, aSideY[0] + height*(n-2));
            // go from side b coordinates' to the base
            graphics.drawLine(aSideX[i-1], aSideY[i-1], WIDTH - (WIDTH - w) / 2 - i * base, aSideY[0] + height*(n-2));
        }
    }

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