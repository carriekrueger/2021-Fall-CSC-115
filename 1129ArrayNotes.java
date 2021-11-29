// Carrie Krueger
// 11-29-21
// All about arrays 

public class ArrayNotes {
    public static void main(String[] args) {
      
      
        /* template
        
              0   1   2   3   4   5   6
            -----------------------------
            | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
            -----------------------------
        */ 
        
        // ARRAY RULES
        
        // 1. You need to know the size of the array when you declare it. 
        // 2. Once the size of the array is set, you can't change it (no resizing an array)
        // 3. Array can hold only one type of data (all ints, all Strings, etc.)
        // 4. Arrays are indexed from 0 to length - 1 (ArrayIndexOutOfBounds Exception error)
        
        // Let's make an array to hold daily temperatures for one week 
        
        int[] temps = new int[7];  // DECLARE the array and set the length
        
        
         /* 
        
              0   1   2   3   4   5   6         // positions 0 to length - 1
            -----------------------------
            | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
            -----------------------------       // initially filled with 0s
        */ 
        
        
        // put values into array
        
        temps[0] = 29;
        temps[1] = 31;
        temps[2] = 41;
        temps[3] = 16;
        temps[4] = 30;
        temps[5] = 30;
        temps[6] = 30;
        
        
        
         /* 
        
              0    1    2    3     4    5   6        
            -----------------------------------
            | 29 | 31 | 41 | 16 | 30 | 30 |30 |
            -----------------------------------      
        */ 
        
        System.out.println(temps[3]);  // 16
        
        // can do anything with array elements that you can do with regular variables
        double weekendAverage = (temps[0] + temps[1]) / 2.0;
        System.out.println(weekendAverage); // 30.0
        
        temps[3] = 26;  // no output, just changed a value
        
        /* 
        
              0    1    2    3     4    5   6        
            -----------------------------------
            | 29 | 31 | 41 | 26 | 30 | 30 |30 |
            -----------------------------------      
        */ 
        
         System.out.println(temps[3]);  // 26
         
        
        // print the first element in the array:  position 0
        
        System.out.println("First element: " + temps[0]);  
         
        // print the last element in this array:  position 6
        
        System.out.println("Last element: " + temps[6]);  
        
        // position 7?
    
        //System.out.println(temps[7]);  
        
        // print last element in any array?  position length - 1
        
        System.out.println(temps[temps.length - 1]);
        
        // how about printing the entire array? 
    
        System.out.println(temps);  // prints memory address 
        
        // use a for loop to print every element 
        
        for(int i = 0; i < temps.length; i++) {
            System.out.print(temps[i] + " ");
        }
        
        System.out.println();  // so next thing prints on next line 
        
        String s = "abcdefg";  // 7 characters
        System.out.println(s.length()); // 7
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(6));
       // System.out.println(s.charAt(7));
        System.out.println(s.charAt(s.length() - 1)); // length is a method for Strings
                                                     // and a variable for arrays
                                                     
                                                     
        
        // sending an array as a parameter to a method
        
        printArray(temps);
         
        
    }
    
    // This method will take an array and print it out 
    // Note: when you send an array as a parameter to a method, and you change the array in the method, 
    // then the changes will stick when the method is done. 
    
    public static void printArray(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println();
    }
    
    
}
       
