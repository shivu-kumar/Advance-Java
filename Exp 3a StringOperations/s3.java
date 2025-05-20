/*Write a Java Program for Reversing the characters in a string using user defined function
reverseString(). */

package String_Functions;

public class s3 {
	   public static String reverseString(String str) {
	        if (str == null) {
	            return null;
	        }
	        StringBuilder reverseStr = new StringBuilder(str);
			// an inbuilt function is used to reverse the whole string
	        return reverseStr.reverse().toString();
	    }

	    public static void main(String[] args) {
	        String str1 = "hello";
	        System.out.println("Reversed '" + str1 + "': " + reverseString(str1)); 
	    }

}
