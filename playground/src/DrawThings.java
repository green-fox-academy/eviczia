import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawThings {
    public static void mainDraw(Graphics graphics){
 /*       int[]xP = new int[] {10,20, 20, 10};
        int[]yP = new int[] {90,90,100, 100};
        Polygon p = new Polygon(xP, yP, 4);
        graphics.drawPolygon(p);*/

        // draw circle




        }





/*    private static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }*/


    // Don't touch the code below
    static int WIDTH = 512;
    static int HEIGHT = 512;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
yyyyyyyyyyyyy        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();

        // write text

        String text = "Hello, world;";
        char[] stringArray[] = text.toCharArray();
        for (char output: stringArray) {
            System.out.println(output);
        }

    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}