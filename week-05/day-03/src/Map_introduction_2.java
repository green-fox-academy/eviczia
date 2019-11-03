import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Map_introduction_2 {
    public static void main(String[] args) {
        //Create a map where the keys are strings and the values are strings
        HashMap<String, String> newMap = new HashMap<>();
        // with the following initial values
        //
        //Key	Value
        //978-1-60309-452-8	A Letter to Jo
        //978-1-60309-459-7	Lupus
        //978-1-60309-444-3	Red Panda and Moon Bear
        //978-1-60309-461-0	The Lab

        newMap.put ("978-1-60309-452-8",	"A Letter to Jo");
        newMap.put ("978-1-60309-459-7",	"Lupus");
        newMap.put ("978-1-60309-444-3",	"Red Panda and Moon Bear");
        newMap.put ("978-1-60309-461-0",	"The Lab");

        //Print all the key-value pairs in the following format
        //
        //A Letter to Jo (ISBN: 978-1-60309-452-8)
        //Lupus (ISBN: 978-1-60309-459-7)
        //Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
        //The Lab (ISBN: 978-1-60309-461-0)
        for (Map.Entry<String, String> thing : newMap.entrySet()) {
            System.out.printf(thing.getValue() + " (ISBN: %s)\n", thing.getKey());
        }
        System.out.println();

        //Remove the key-value pair with key 978-1-60309-444-3
        newMap.remove("978-1-60309-444-3");
        for (Map.Entry<String, String> thing : newMap.entrySet()) {
            System.out.printf(thing.getValue() + " (ISBN: %s)\n", thing.getKey());
        }
        System.out.println();
        //
        //Remove the key-value pair with value The Lab


        for (Map.Entry<String, String> thing : newMap.entrySet()) {
            System.out.printf(thing.getValue() + " (ISBN: %s)\n", thing.getKey());
        }
        //
        System.out.println();
        //Add the following key-value pairs to the map
        //
        //Key	Value
        //978-1-60309-450-4	They Called Us Enemy
        //978-1-60309-453-5	Why Did We Trust Him?

        newMap.put("978-1-60309-450-4",	"They Called Us Enemy");
        newMap.put("978-1-60309-453-5", "Why Did We Trust Him?");

        for (Map.Entry<String, String> thing : newMap.entrySet()) {
            System.out.printf(thing.getValue() + " (ISBN: %s)\n", thing.getKey());
        }
        //Print whether there is an associated value with key 478-0-61159-424-8 or not
        System.out.println("**" +  (newMap.get("478-0-61159-424-8") != null));
        //
        //Print the value associated with key 978-1-60309-453-5
        System.out.printf("The value associated with key 978-1-60309-453-5 is '%s'", newMap.get("978-1-60309-453-5"));
    }
}
