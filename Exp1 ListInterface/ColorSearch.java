package interfacedemo;

import java.util.ArrayList;

// 1. Write a Java program for getting different colors through ArrayList interface
// and search whether the color "Red" is available or not
public class ColorSearch {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        if (colors.contains("Red")) {
            System.out.println("Red is present in the list.");
        } else {
            System.out.println("Red is not present in the list.");
        }
    }
}
