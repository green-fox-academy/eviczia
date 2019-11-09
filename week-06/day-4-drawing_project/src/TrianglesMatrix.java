import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TrianglesMatrix {
    public static void mainDraw(Graphics graphics) {
        int base = 15;
        int xTop = WIDTH /2;
        int yTop = 20;
        double height = Math.sqrt(3)/2*base;
        double w = WIDTH - (WIDTH % base);
        double h = (HEIGHT - ((HEIGHT - yTop) % height) - yTop);
        double divideW = w / base;
        double divideH = h / height;
        System.out.println(" height: " + height);
        System.out.println("w: " + w);
        System.out.println("h: " + h);
        System.out.println("divideW: " + divideW);
        System.out.println("divideH: " + divideH);

// Matrixes starting point


        for (int i = 1; i < divideW; i++) {
            for (int j = 0; j < Math.pow(2, i); j++) {
                int[] A = new int[]{xTop, yTop + i*(int)height};
                int[] B = new int[]{A[0] - i * base / 2, A[1] + (int)height};
                int[] C = new int[]{A[0] + i * base / 2, A[1] + (int)height};
                drawTriangle(A, B, C, graphics);
                A = B;

            }
        }
    }

    private static void drawTriangle(int[] A, int[] B, int[] C, Graphics graphics) {
        graphics.drawLine(A[0], A[1], B[0], B[1]);
        graphics.drawLine(B[0], B[1], C[0], C[1]);
        graphics.drawLine(C[0], C[1], A[0], A[1]);
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