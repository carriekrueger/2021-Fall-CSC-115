// Carrie Krueger
// 10-4-21
// Efficiently using if-statements and multiple conditionals

import java.util.Scanner;

public class MoreIfs {
    public static void main(String[] args) {
        
        betterIfs();  // efficient if statements
        multipleIfs(); // handling multiple conditionals
       
    }
    
    // a method that shows the preferred way to handle 
    // code that is being reused
    public static void betterIfs() {
        
        // When you have code that ends up being reused in your program: 
        
        // preferred way
        
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = sc.nextInt();
        
        if(age >= 65) {
            System.out.println("Age is just a number!");
           
        }
        
        System.out.println(age + " is a good age."); 
       
        
        
        // less preferred way 
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = sc.nextInt();
        
        if(age >= 65) {
            System.out.println("Age is just a number!");
            System.out.println(age + " is a good age.");
        }
        
        if(age < 65) {
            System.out.println(age + " is a good age.");
        }
        */
        
    }
    
    // this method looks at ways to do multiple conditionals
    public static void multipleIfs() {
        
        int num = 142; 
        
        // let's compare to 10 in a better way than we did before
        // mulitple ways to handle multiple conditionals 
        
        // only one outcome possible
        // NESTED 
        // note the indentation - if/else { --> next line indented
        
        if(num > 10) {
            System.out.println("Greater!");
        } else {
            if(num < 10) {
                System.out.println("Less!");
            } else {
                System.out.println("Equal!");
            }
        }
        
        // only one outcome possible
        // neater nesting --> else if
        
        if(num > 10) {
            System.out.println("Greater!");
        } else if(num < 10) {
            System.out.println("Less!");
        } else {
            System.out.println("Equals!");
        }
        
        
        // more than one outcome possible
        // not nested --> stacked
        
        if(num > 10) {
            System.out.println("Greater!");
        }
        
        if(num > 100) {
            System.out.println("Really big number!!!");
        }
        
        // boolean logic operators: and &&  and  or ||
        
        num = 75;
        
        // logical or
        if(num >= 40 || num <= 10) {
            System.out.println("You win!");
        }
        
        // logical and    ** short-circuit **
        if(num >= 40 && num <= 60) {
            System.out.println("Num is in range!");
        }
        
        // Another option: SWITCH STATEMENTS
        // Textbook 6.3
        
        // Pros and cons:
        // if/else can handle ranges
        // switch statements can only handle exact values
        // switch statements can only be used with certain primitives and Strings
        // if/else can messy with {  } , more prone to error (both syntax and logic)
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
