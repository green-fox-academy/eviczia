public class EmailValidator {
    
    public static void main(String[] args) {

        String email = "eviczia@gmail.com";

        System.out.println(emailValidator(email));

    }

    private static boolean emailValidator(String email) {
        if (email.contains(" ")) return false;
        String[] splitEmail = email.split("@");
        if (checkSplitText(splitEmail)) {
            String domain = splitEmail[1];
            String[] splitDomain = domain.split("\\.");
            return (checkSplitText(splitDomain));
        } else return false;
    }


    private static boolean checkSplitText(String[] splitText) {
        return splitText.length == 2 && splitText[0].length() > 0 && splitText[1].length() > 0;

    }
}
