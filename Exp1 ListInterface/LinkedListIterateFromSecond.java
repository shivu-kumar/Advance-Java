package interfacedemo;

import java.util.LinkedList;
import java.util.ListIterator;

// 1. Iterate through LinkedList starting from 2nd position using listIterator(index)
public class LinkedListIterateFromSecond {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        System.out.println(list);

        ListIterator<String> iterator = list.listIterator(1); // start from 2nd (index 1)

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
