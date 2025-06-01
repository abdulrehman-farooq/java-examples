package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
         * ✅ One Dimensional Arrays
         * 1. Create array and add 3 values in it
         * 2. Initialize array with values 55, 3, 66, 8, 9, 0
         * 3. Sort ascending
         * 4. Sort descending primitive
         * 5. Sort descending non primitive
         * 6. Convert to List<Integer>
         * 7. Clone array
         * 8. Reverse the array
         */
        // 1. Create array and add 3 values in it
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 4;
        // 2. Initialize array with values 55, 3, 66, 8, 9, 0
        int[] array1 = new int[] { 55, 3, 66, 8, 9, 0 };
        // 3. Sort ascending array
        Arrays.sort(array1);
        // 4. Sort descending primitive
        Arrays.stream(array1).boxed().sorted((a,b) -> b - a).toArray();
        
        
        // 5. Sort descending non primitive 
        Integer[] array2 = new Integer[] { 55, 3, 66, 8, 9, 0 };
        Arrays.sort(array2, Collections.reverseOrder()); 
        // 6. Convert to List<Integer>
        List<Integer> list = Arrays.asList(array2);
        // 7. Clone array
        int[] cloneArray = array.clone();
        // 8. Array Stream 
        Collections.reverse(Arrays.stream(cloneArray).boxed().collect(Collectors.toList()));


        /*
         * ✅ Two Dimensional Arrays
         * 1. Initialize a 2D array with values [55, 3, 66], [8, 9, 0]
         * 2. Sort the matrix in ascending/descending order
         * 3. Print diagonals of the matrix
         * 4. Rotate matrix 90 degrees
         * 5. Transpose matrix
         * 6. Flatten to 1D array or list
         * 7. Convert to List<List<Integer>>
         * 8. Search for an element in a sorted 2D matrix
         */

        /*
         * ✅ Casting & Conversion
         * 1. Cast 1, 'a', and 'A' to int and normalize to 1
         * 2. Cast Integer to String
         * 3. Cast String "12" to int
         * 4. Cast double to int
         * 5. Convert char to String and vice versa
         */
         char integerCharacter = '1';
         int integerCasting = integerCharacter - '0';
    
        System.out.println("Integer Casting " + integerCasting);

        char loweCasting = 'a';
        int lowerIntegerValue = (int) loweCasting - 'a';
        System.out.println("Integer Casting " + lowerIntegerValue);

        char upperCasting = 'A';
        int upperIntegerValue = (int) upperCasting - 'A';
        System.out.println("Integer Casting " + upperIntegerValue);

        int mixedCastingUpper = (int) upperCasting - 'A';
        int mixedCastingLower = (int) loweCasting - 'A';
        System.out.println("Integer Casting " + mixedCastingUpper);
        System.out.println("Integer Casting " + mixedCastingLower);

        int convert = Integer.parseInt("12");
        String convertString = String.valueOf(convert);
        String convertString1 = convert + "";
        System.out.println("String Casting to integer " + convert);
        System.out.println("Integer Casting " + convertString);
        System.out.println("Integer Casting " + convertString1);


        /*
         * ✅ One Dimensional Lists
         * 1. Initialize 1D List with values 55, 3, 66, 8, 9, 0
         * 2. Sort ascending and descending
         * 3. Sort ascending with values divisible by 2 first
         * 4. Remove duplicates
         * 5. Convert List to Array
         * 6. Find median
         * 7. Count frequency of values
         * 8. Rotate list elements
         * 9. Partition list into sublists
         */

        /*
         * ✅ HashMap
         * 1. Add, remove keys and get default values
         * 2. Check if key or value exists
         * 3. Traverse keys, values, and entries
         * 4. Convert map to array
         * 5. Compare two maps
         * 6. Clear map
         * 7. Get size of map
         * 8. Group list by frequency
         * 9. Sort map by values
         */

        /*
         * ✅ Stack
         * 1. Push and pop values
         * 2. Peek top of stack
         * 3. Reverse a string using stack
         * 4. Check for balanced parentheses
         * 5. Implement min-stack
         * 6. Evaluate postfix expression
         */

        /*
         * ✅ StringBuilder
         * 1. Append, delete, insert, and reverse string
         * 2. Remove trailing characters
         * 3. Replace substring
         * 4. Convert to String
         * 5. Palindrome check using StringBuilder
         */

        /*
         * ✅ Set
         * 1. Add and remove values from HashSet
         * 2. Build a set from a list
         * 3. Find intersection of two sets
         * 4. Find union and difference
         * 5. Check for duplicates in array
         */

        /*
         * ✅ Queue
         * 1. Build a queue of integers
         * 2. Enqueue and dequeue values
         * 3. Peek head of queue
         * 4. Poll until queue is empty
         * 5. Reverse queue using stack
         * 6. Implement queue using two stacks
         */

        /*
         * ✅ Max Heap
         * 1. Build a max heap
         * 2. Insert/remove values
         * 3. Get max
         * 4. Sort k largest elements
         */

        /*
         * ✅ Min Heap
         * 1. Build a min heap
         * 2. Insert/remove values
         * 3. Get min
         * 4. Merge k sorted lists
         * 5. Find kth smallest element
         */

        /*
         * ✅ String Algorithms
         * 1. Reverse a string
         * 2. Check if two strings are anagrams
         * 3. Count vowels and consonants
         * 4. Find longest palindrome substring
         * 5. Substring with all unique characters
         * 6. String compression (e.g., "aaabb" → "a3b2")
         * 7. Find first non-repeating character
         * 8. Sliding window max substring
         */
    }
}