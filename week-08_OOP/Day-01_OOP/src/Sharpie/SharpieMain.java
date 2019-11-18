package Sharpie;

public class SharpieMain {
    public static void main(String[] args) {
        Sharpie neonYellow = new Sharpie("bright yellow", 6);

        System.out.println(neonYellow.color + " "+ neonYellow.width + " "+ neonYellow.inkAmount);

        for (int i = 0; i < 30; i++) {
            neonYellow.use();
        }
        System.out.println(neonYellow.color + " "+ neonYellow.width + " "+ neonYellow.inkAmount);


    }
}
