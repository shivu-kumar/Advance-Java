package interfacedemo;

import java.util.LinkedList;
import java.util.Iterator;

// 2. Iterate LinkedList in reverse order using descendingIterator()
public class LinkedListReverseIterate {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        Iterator<String> desc = list.descendingIterator();

        while (desc.hasNext()) {
            System.out.println(desc.next());
        }
    }
}
