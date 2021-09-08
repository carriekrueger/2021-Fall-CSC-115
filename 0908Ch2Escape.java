// Carrie Krueger
// 9-8-21
// Chapter 2 Notes: Output and Escape Sequences

public class Ch2Escape {
   public static void main(String[] args) {
      escape(); // this method will explore output and escape sequences
   }
   
   // a method to investigate output and escape sequences
   public static void escape() {
   
      // print vs. println
      System.out.print("Hello Class!");  // next thing prints on the same line
      System.out.println("It is Wednesday."); // next thing prints on next line
      System.out.print("Tomorrow is Thursday.");
      System.out.println();  //prints blank line
      
      //OUTPUT
      System.out.println(2); // you can put text or numbers in a print statement
      System.out.println(1 + 2 * 3); // you can do math ... order of ops
      
      // ESCAPE SEQUENCES
      // special characters denoted with \ (the escape character)
      
      // \n --> new line
      System.out.print("Hello! \n\n\n\n");
      System.out.println("H\nello!");
      
      // \t --> tab
      System.out.println("Hi \t Hi");
      System.out.println("Hi \t\t\t Hi");
      
      // \\ --> \
      System.out.println("\\");
      
      // \" --> "
      System.out.println("She said \"Java is the best language!!!\" ");
      
      // You try!
      // Think of a quotation or saying that you know
      // Create a new class called PrintQuote.java
      // Output your saying with visible quotation marks in the output
      // Use a method other than main!
      
      // Example: "That's the way the cookie crumbles."
   
   }
}
