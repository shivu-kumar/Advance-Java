package interfacedemo;

import java.util.Collections;
import java.util.LinkedList;

// 5. Swap first and third elements in LinkedList using Collections.swap()
public class LinkedListSwapElements {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        System.out.println("Before swapping: " + list);
        Collections.swap(list, 0, 2); // swap first and third (index 0 and 2)

        System.out.println("After swapping: " + list);
    }
}
