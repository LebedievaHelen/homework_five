package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {

    public static int countOccurrence(List<String> words, String searchWord) {
        int count = 0;
        for (String word : words) {
            if (word.equals(searchWord)) count++;
        }
        return count;
    }

    public static List<Integer> toList(Integer[] elements) {
        return Arrays.asList(elements);
    }

    public static List<Integer> findUnique(List<Integer> elements) {
        List<Integer> uniqueElements = new ArrayList<>();
        for (Integer element : elements) {
            if (!uniqueElements.contains(element)) uniqueElements.add(element);
        }
        return uniqueElements;
    }

    public static void calcOccurrence(List<String> words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (result.contains(word)) continue;
            int counter = 0;
            for (String w : words) {
                if (w.equals(word)) counter++;
            }
            System.out.println(word + ": " + counter);
            result.add(word);
        }
    }

    public static void findOccurrence(List<String> words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (result.contains(word)) continue;
            int counter = 0;
            for (String w : words) {
                if (w.equals(word)) counter++;
            }
            System.out.println("name: " + "\"" + word + "\"" + ", " + "occurence: " + counter);
            result.add(word);
        }
    }
}
