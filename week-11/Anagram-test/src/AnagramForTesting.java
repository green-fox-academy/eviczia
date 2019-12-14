public class AnagramForTesting {

    public static boolean isAnagram(String word1, String word2) {
        System.out.println(word1 + " " + word2);
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        for (int i = 0; i < word1.length(); ) {
            if (word1.substring(i, i + 1).equals(" ")) i++;
            else {
                for (int j = 0; j < word2.length(); j++) {
                    if (word1.substring(i, i + 1).equals(word2.substring(j, j + 1))) {
                        word1 = word1.substring(0, i) + " " + word1.substring(i + 1);
                        word2 = word2.substring(0, j) + " " + word2.substring(j + 1);
                    }
                }
                i++;
                System.out.println(i + word1 + " " + word2);
            }
        }
        System.out.println("done");
        word1 = word1.replace(" ", "");
        word2 = word2.replace(" ", "");
        System.out.println(word1 + " " + word2);
        return word1.equals(word2);

    }
}
