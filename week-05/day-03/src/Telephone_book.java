import java.util.HashMap;
import java.util.Map;

public class Telephone_book {
        //We are going to represent our contacts in a map where the keys are
        // going to be strings and the values are going to be strings as well.

    public static void main(String[] args) {
        //Create a map with the following key-value pairs.

        HashMap<String, String> phoneBook = new HashMap<String, String>();
        phoneBook.put ("William A. Lathan", "405-709-1865");
        phoneBook.put ("John K. Miller", "402-247-8568");
        phoneBook.put ("Hortensia E. Foster", "606-481-6467");
        phoneBook.put ("Amanda D. Newland", "319-243-5613");
        phoneBook.put ("Brooke P. Askew", "307-687-2982");
        System.out.println(phoneBook);

        //Create an application which solves the following problems.
        //
        //What is John K. Miller's phone number?
        System.out.printf("John K. Miller's phone number is: %s\n\n", phoneBook.get("John K. Miller"));

        //Whose phone number is 307-687-2982?
        String mysteryNo = "307-687-2982";
        String NumberID = "whoisit";
        for (Map.Entry<String, String> number: phoneBook.entrySet()) {
            if (number.getValue() == mysteryNo) {
                NumberID = number.getKey();
            }
        }
        System.out.printf("The mystery number %s belongs to %s.\n\n", mysteryNo, NumberID);

        //Do we know Chris E. Myers' phone number?
        System.out.println(phoneBook.containsKey("Chris E. Myers"));
    }
}
