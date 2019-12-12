public class AnagramForTesting {

    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        } else {
            int counter = 0;
            for (int i = 0; i < word1.length(); i++) {
                for (int j = 0; j < word2.length(); j++) {
                    if (word1.substring(i, i + 1).equals(word2.substring(j, j + 1))) {
                        counter++;
                        word1 = word1.substring(0, i) + "#" + word1.substring(i + 1);
                        word2 = word2.substring(0, j) + "*" + word2.substring(j + 1);
                    }
                }
            }
            return counter == word1.length();
        }
    }
}
