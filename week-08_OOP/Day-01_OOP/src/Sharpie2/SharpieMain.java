package Sharpie2;

public class SharpieMain {
    public static void main(String[] args) {
        // these are my sharpies
        Sharpie yellow = new Sharpie("yellow", 6);
        Sharpie red = new Sharpie("red", 5);
        Sharpie blue = new Sharpie("blue", 4);
        Sharpie grey = new Sharpie("grey", 3);
        Sharpie green = new Sharpie("green", 4);
        Sharpie pink = new Sharpie("pink", 6);


        // add my new sharpies to my set
        SharpieSet myUsableSharpies = new SharpieSet();
        myUsableSharpies.sharpies.add(yellow);
        myUsableSharpies.sharpies.add(red);
        myUsableSharpies.sharpies.add(blue);
        myUsableSharpies.sharpies.add(grey);
        myUsableSharpies.sharpies.add(green);
        myUsableSharpies.sharpies.add(pink);

        // admire my beautiful set of sharpies and count them
        System.out.println(myUsableSharpies);
        System.out.println(myUsableSharpies.countUsable());

        // start using my sharpies
        for (int i = 0; i < 100; i++) {
            yellow.use();
            if ( i % 3 == 0) {
                green.use();
                pink.use();
                pink.use();
            }
        }
        // take a look at my sharpie set, and count usables
        System.out.println(myUsableSharpies);
        System.out.println(myUsableSharpies.countUsable());

        //throw out the useless ones
        myUsableSharpies.removeTrash();

        // admire my beautiful set of sharpies and count them
        System.out.println(myUsableSharpies);
        System.out.println(myUsableSharpies.countUsable());

    }
}
