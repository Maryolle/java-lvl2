package lesson4;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String[] words = {"Apple", "Potato", "Orange", "Apple"};

        HashMap<String, Integer> uniqueWords = new HashMap<>();

        for (String word : words) {
            if (uniqueWords.containsKey(word)) {
                uniqueWords.put(word, uniqueWords.get(word) + 1);
            } else {
                uniqueWords.put(word, 1);
            }
        }

        System.out.println(uniqueWords);
    }
}