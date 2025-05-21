package interfacedemo;

import java.util.ArrayList;
import java.util.List;

// 4. Write a Java program to extract 1st and 2nd elements using subList()
public class ColorSubList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        
        System.out.println("List: " + colors);

        List<String> subColors = colors.subList(0, 2);

        System.out.println("Sublist (1st and 2nd): " + subColors);
    }
}
