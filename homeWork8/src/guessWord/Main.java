package guessWord;

import guessWord.WordGuess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        WordGuess word = new WordGuess();

        while (true) {
            String str = buf.readLine();

            if (word.guessWord(str)) {
                System.out.println(true);
                break;
            } else {
                System.out.println(word.guessSymbols(str));
            }
        }
    }
}
