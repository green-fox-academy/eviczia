package Sharpie2;

public class SharpieMain {
    public static void main(String[] args) {
        Sharpie yellow = new Sharpie("yellow", 6);
        Sharpie red = new Sharpie("red", 5);
        Sharpie blue = new Sharpie("blue", 4);
        Sharpie grey = new Sharpie("grey", 3);
        Sharpie green = new Sharpie("green", 4);
        Sharpie pink = new Sharpie("pink", 6);

        SharpieSet myUsableSharpies = new SharpieSet();
        myUsableSharpies.sharpies.add(yellow);
        myUsableSharpies.sharpies.add(red);
        myUsableSharpies.sharpies.add(blue);
        myUsableSharpies.sharpies.add(grey);
        myUsableSharpies.sharpies.add(green);
        myUsableSharpies.sharpies.add(pink);

        System.out.println(myUsableSharpies);
        System.out.println(myUsableSharpies.countUsable());


        for (int i = 0; i < 100; i++) {
            yellow.use();
            if ( i % 3 == 0) {
                green.use();
                pink.use();
                pink.use();
            }
        }
        System.out.println(myUsableSharpies);
        System.out.println(myUsableSharpies.countUsable());
        myUsableSharpies.removeTrash();
        System.out.println(myUsableSharpies);
        System.out.println(myUsableSharpies.countUsable());


    }
}
