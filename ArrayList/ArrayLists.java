package ArrayList;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        // ArrayList is a resizable array implementation of the List interface
        // It allows for dynamic resizing and can hold objects of any type
        ArrayList<Integer> list1 = new ArrayList<>(); // Syntax1
        ArrayList<String> list2 = new ArrayList<>(10); // Syntax2 with initial capacity    
        list1.add(10); // Adding elements
        list1.add(20);
        list1.add(30);
        list2.add("Hello");
        list2.add("World");

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);  

        // ArrayLists are mutable data structures
        // They can grow and shrink in size dynamically
        // They are heterogeneous data structures, meaning they can hold different types of objects 

        list1.add(1, 15); // Inserting at index 1
        System.out.println("List1 after insertion: " + list1);
        list2.remove("World"); // Removing an element
        System.out.println("List2 after removal: " + list2);

        list1.set(0, 5); // Updating an element at index 0
        System.out.println("List1 after update: " + list1);

        // ArrayLists can contain null values
        list2.add(null);
        System.out.println("List2 after adding null: " + list2);

        list1.clear(); // Clearing the list
        System.out.println("List1 after clearing: " + list1);       

        list2.contains("Hello"); // Checking if an element exists
        System.out.println("List2 contains 'Hello': " + list2.contains("Hello"));

        // ArrayLists can be iterated using for-each loop
        for (String item : list2) {
            System.out.println("Item in List2: " + item);
        }
        // ArrayLists can also be iterated using traditional for loop
        for (int i = 0; i < list2.size(); i++) {
            System.out.println("Item at index " + i + ": " + list2.get(i));
        }
        // ArrayLists can be converted to arrays
        String[] arrayFromList2 = list2.toArray(new String[0]);
        System.out.println("Array from List2: " + java.util.Arrays.toString(arrayFromList2));
        // ArrayLists can be sorted using Collections.sort()
        java.util.Collections.sort(list1);
        System.out.println("List1 after sorting: " + list1);
        // ArrayLists can be reversed using Collections.reverse()
        java.util.Collections.reverse(list2);
        System.out.println("List2 after reversing: " + list2);
        // ArrayLists can be resized, and they do not have a fixed size like arrays
        list1.ensureCapacity(20);
        System.out.println("List1 after ensuring capacity: " + list1);  

    }
}
