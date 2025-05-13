package main.java.com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListRandomizer {
    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>();

        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Orange");
        originalList.add("Pear");
        originalList.add("Grape");
        originalList.add("Pineapple");
        originalList.add("Watermelon");
        originalList.add("Strawberry");
        originalList.add("Kiwi");
        originalList.add("Mango");

        List<String> randomizedList = new ArrayList<>();
        Random random = new Random(11);

        while (randomizedList.size() < originalList.size()) {
            int index = random.nextInt(originalList.size());
            String item = originalList.get(index);
            if (!randomizedList.contains(item)) {
                randomizedList.add(item);
            }
        }
        System.out.println(originalList);

        System.out.println(randomizedList);
    }
}
