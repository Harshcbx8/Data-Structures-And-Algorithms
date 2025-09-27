package Strings;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring (0, 5): " + str.substring(0, 5));

        //Comparison of Strings
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println("s1 == s2: " + (s1 == s2)); // true, same reference
        System.out.println("s1 == s3: " + (s1 == s3)); // false, different reference
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true, same content
        System.out.println("s1.compareTo(s2): " + s1.compareTo(s2)); // 0, same content
        System.out.println("s3.equals(s4): " + s3.equals(s4)); // true, same content
        System.out.println("s3.compareTo(s4): " + s3.compareTo(s4)); // 0, same content
        System.out.println("s3 == s4: " + (s3 == s4)); // false, different reference

        // == checks if reference variable is pointing to same objects

        // .equals() checks if values are same

        // new String() creates a new object in memory not the string object in string pool

        System.out.println(Arrays.toString(new int[]{1, 2, 3}));

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", World!");
        System.out.println("StringBuilder: " + sb.toString());
        sb.toString();
        //string builder functions
        sb.append("!");
        System.out.println("After append: " + sb.toString());
        sb.insert(5, ",");
        System.out.println("After insert: " + sb.toString());
        sb.replace(5, 6, " ");
        System.out.println("After replace: " + sb.toString());
        sb.delete(5, 6);
        System.out.println("After delete: " + sb.toString());
        
    }
}
