// Carrie Krueger
// 10-25-21
// Using the Random class to make random numbers

import java.util.Random;
// we are going to use a premade Java class called Random


public class RandomNumbers {
    public static void main(String[] args) {
        
        makeRandoms();  // method for making and printing random numbers 
    }
    
    // this method looks at making random integers in a range 
    public static void makeRandoms()  {
        
        // HOW TO MAKE RANDOM INTEGERS USING THE RANDOM CLASS
        
        // Step 1: Instantiate (create) a Random object
        // (make an instance of the Random class)
        // This is NOT the random number, but what we will use 
        // to get the random number
        
        Random rand = new Random();
        
        // Step 2: use the .nextInt(int) method to generate a 
        // random integer in a range
        // Integer generated is in the range 0 to value - 1
        // (exclusive of value)
        
        int randomNumber = rand.nextInt(100); // gives a number 0 - 99
        System.out.println(randomNumber);
        
        // How to get a random number between 1 and 100? 
        
        randomNumber = rand.nextInt(101); // gives 0 - 100...
        
        System.out.println(rand.nextInt(100) + 1); // YES! 1-100
                                //   0 - 99 + 1 = 1 - 100
        
        // How about a number 75-100?
        
        int randomNumber2 = rand.nextInt(26) + 75; 
                                    //   0 - 25 + 75 = 75 - 100
        
        // FORMULA/RULE
        // # inside () = number of random numbers in the range
        //             = max # - min # + 1
        // # added outside = starting number in range (min #)
        
        
        // How about a random integer between 20 and 50? 
        
        randomNumber2 = rand.nextInt(31) + 20;
                               //  0 - 30 + 20 = 20 - 50
        
        
        // LIVE CODE DEMO in Blackboard
        
        
       
        
        
    }
}
