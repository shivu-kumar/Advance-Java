package interfacedemo;

import java.util.ArrayList;
import java.util.Collections;

// 3. Write a Java program to sort colors in ArrayList using Collections.sort()
public class ColorSort {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("List: " + colors);
        Collections.sort(colors);

        System.out.println("Sorted list: " + colors);
    }
}
