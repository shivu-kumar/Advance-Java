package interfacedemo;

import java.util.LinkedList;

// 3. Insert a specified element at the end of LinkedList using offerLast()
public class LinkedListOfferLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");

        list.offerLast("Pink");

        System.out.println("After insertion: " + list);
    }
}
