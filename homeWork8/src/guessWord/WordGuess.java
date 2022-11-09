package guessWord;

import java.util.Arrays;

public class WordGuess {
    private String[] words = {"apple", "orange", "lemon", "banana", "apricot",
            "avocado", "broccoli", "carrot", "cherry", "garlic",
            "grape", "melon", "leak", "kiwi", "mango",
            "mushroom", "nut", "olive", "pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin", "potato"};
    private String field = "###############";
    private String hiddenWord = words[(int) (Math.random() * words.length)];

    public boolean guessWord(String str) {
        return str.equals(hiddenWord);
    }

    public String guessSymbols(String str) {
        System.out.println(hiddenWord);
        char[] chars = field.toCharArray();

        for (int i = 0; i < hiddenWord.length(); i++) {

            if (hiddenWord.charAt(i) == str.charAt(i)) {
                chars[i] = str.charAt(i);
            }
        }

        return str = new String(chars);
    }
}
