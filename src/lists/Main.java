package lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("cat");
        words.add("dog");
        words.add("rat");
        words.add("bird");
        words.add("mouse");
        words.add("cat");
        words.add("cow");
        words.add("horse");
        words.add("bear");
        words.add("cat");

        String searchWord = "cat";
        System.out.println(Lists.countOccurrence(words, searchWord));

        Integer[] elements = {1, 2, 5, 8, 6, 14};
        System.out.println(Lists.toList(elements));

        List<Integer> randomElements = new ArrayList<>();
        randomElements.add(1);
        randomElements.add(1);
        randomElements.add(1);
        randomElements.add(986);
        randomElements.add(98);
        randomElements.add(543);
        randomElements.add(543);
        randomElements.add(21);
        randomElements.add(543);
        randomElements.add(105);

        System.out.println(Lists.findUnique(randomElements));

        Lists.calcOccurrence(words);

        Lists.findOccurrence(words);
    }
}
