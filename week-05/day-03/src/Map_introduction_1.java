import java.util.HashMap;

public class Map_introduction_1 {
    public static void main(String[] args) {
        //We are going to play with maps. Feel free to use the built-in methods where possible.
        //Create an empty map where the keys are integers and the values are characters
        HashMap<Integer, Character> nosChars = new HashMap<>();
        //
        //Print out whether the map is empty or not
        System.out.println(nosChars.isEmpty());
        //
        //Add the following key-value pairs to the map
        nosChars.put(97, 'a');
        nosChars.put(98, 'b');
        nosChars.put(99, 'c');
        nosChars.put(65, 'A');
        nosChars.put(66, 'B');
        nosChars.put(67, 'C');

        //
        //Key	Value
        //97	a
        //98	b
        //99	c
        //65	A
        //66	B
        //67	C
        //Print all the keys
        for (Integer number : nosChars.keySet()) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println(nosChars.keySet());
        //
        System.out.println();
        //Print all the values
        for (Character value : nosChars.values()) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println(nosChars.values());
        //
        //Add value D with the key 68
        nosChars.put(68, 'D');
        //
        //Print how many key-value pairs are in the map
        System.out.println(nosChars.size());
        //
        //Print the value that is associated with key 99
        System.out.println(nosChars.get(99));
        //
        System.out.println();

        System.out.println(nosChars.entrySet());
        //Remove the key-value pair where with key 97
        nosChars.remove(97);
        System.out.println(nosChars.entrySet());
        System.out.println(nosChars);
//
        System.out.println();
//        nosChars.put(100, null);
        //Print whether there is an associated value with key 100 or not
        System.out.println(nosChars.containsKey(100));
        System.out.println(nosChars.get(100) == null);
        //
        //Remove all the key-value pairs
        nosChars.clear();
        System.out.println(nosChars);

    }
}
