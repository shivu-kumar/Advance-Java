/*Write a Java program to get the first (lowest) key and the last (highest) key currently in the 
following Treemap.
 ("C2", "Red"),("C1", "Green"), ("C4", "Black"), ("C3", "White") */


package lab2;

import java.util.*;
import java.util.TreeMap;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap< String,String> map1 = new TreeMap<>();
		map1.put( "c2", "Red");
		map1.put("c1", "Green");
		map1.put("c4", "Black");
		map1.put("c3", "White");
		System.out.println(map1);
		System.out.println("The first key is: "+map1.firstKey());
		System.out.println("The Last key is: "+map1.lastKey());

	}

}