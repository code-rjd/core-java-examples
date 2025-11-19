import java.util.ArrayList;
import java.util.List;

public class SequenceCollectionDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("BANANA");
        fruits.add("cherry");

        System.out.println("------------------------------------------------------");
        System.out.println("Original Collection: " + fruits);
        System.out.println("------------------------------------------------------");
        fruits.addFirst("papaya");
        fruits.addLast("Watermelon");
        System.out.println(" After adding first and last in collection: " + fruits);
        System.out.println("------------------------------------------------------");

        String firstFruit = fruits.getFirst();
        String lastFruit = fruits.getLast();
        System.out.println("First fruit: " + firstFruit);
        System.out.println("------------------------------------------------------");
        System.out.println("Last fruit: " + lastFruit);
        System.out.println("------------------------------------------------------");

        fruits.remove(firstFruit);
        System.out.println("After removing first in collection: " + fruits);
        System.out.println("------------------------------------------------------");

        List<String> reversedFruits = fruits.reversed();
        System.out.println("Reversed fruits: " + reversedFruits);
        System.out.println("------------------------------------------------------");
    }
}