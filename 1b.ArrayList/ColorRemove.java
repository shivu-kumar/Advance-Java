package interfacedemo;

import java.util.ArrayList;

// 2. Write a Java program to remove the 2nd element and the color "Blue" from ArrayList
public class ColorRemove {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println("List: " + colors);
        colors.remove(1); // remove 2nd element (index 1)
        colors.remove("Blue"); // remove by object

        System.out.println("Updated list: " + colors);
    }
}
