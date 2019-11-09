import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TrianglesMatrix {
    public static void mainDraw(Graphics graphics) {
        int base = 40;              // parameter for little equilateral triangle side
        int xTop = WIDTH / 2;       // X coordinate of the triangle peak
        int yTop = 20;              // Y coordinate of the triangle peak
        double height = Math.sqrt(3) / 2 * base; // calculation of triangle height
        double w = WIDTH - (WIDTH % base); // calculation of big triangle base
        double h = (HEIGHT - ((HEIGHT - yTop) % height) - yTop);
        double divideW = w / base;
        double divideH = h / height;
        System.out.println(" height: " + height);
        System.out.println("w: " + w);
        System.out.println("h: " + h);
        System.out.println("divideW: " + divideW);
        System.out.println("divideH: " + divideH);

// Matrixes starting point

        for (int i = 0; i < divideH; i++) {
            for (int j = 0; j < i + 1; j++) {

                    int[] A = new int[]{xTop - j * base / 2, yTop + i * ((int) height)};
                    int[] BC = new int[]{createCornerBC(A, base, height)[0], createCornerBC(A, base, height)[1], createCornerBC(A, base, height)[2], createCornerBC(A, base, height)[3]};
                    drawTriangle(A, BC, graphics);
                    A = new int[]{xTop + j * base / 2, yTop + i * ((int) height)};
                    BC = new int[]{createCornerBC(A, base, height)[0], createCornerBC(A, base, height)[1], createCornerBC(A, base, height)[2], createCornerBC(A, base, height)[3]};
                    drawTriangle(A, BC, graphics);
            }
        }
    }

    private static int[] createCornerBC(int[] A, int base, double height) {
        return new int[]{A[0] - base / 2, A[1] + (int) height, A[0] + base / 2, A[1] + (int) height};
        }

    private static void drawTriangle(int[] A, int[] BC, Graphics graphics) {
        graphics.drawLine(A[0], A[1], BC[0], BC[1]);
        graphics.drawLine(BC[0], BC[1], BC[2], BC[3]);
        graphics.drawLine(BC[2], BC[3], A[0], A[1]);
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