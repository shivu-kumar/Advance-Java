package interfacedemo;

import java.util.ArrayList;

// 5. Write a Java program to delete nth element from ArrayList using remove by index
public class ColorDeleteNth {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        int n = 2; // 3rd element (index 2)
        if (n >= 0 && n < colors.size()) {
            colors.remove(n);
            System.out.println("List after deleting " + (n + 1) + "th element: " + colors);
        } else {
            System.out.println("Invalid index");
        }
    }
}
