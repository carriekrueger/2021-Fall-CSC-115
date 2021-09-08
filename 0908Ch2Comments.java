// Carrie Krueger
// 9-8-21
// Chapter 2 Notes: Comments

public class Ch2Comments {
   public static void main(String[] args) {
      comments(); // in this method we will look at comments
   
   }
   
   // a method to investigate comments
   public static void comments() {
      // anything you type in a comment is NOT read by the computer 
      
      // We use comments for:
      // -Adding name/description to the program
      // As you go along, to explain to others (and yourself) what your code should do 
      
      // Also... DEBUGGING
      // If there code that doesn't work quite yet
      // If there's a bunch of lines of code that don't work and you want to isolate them
      
      // GIVE CREDIT
      // IF you use someone else's code, use comments to credit them 
      // ex. shamelessly stolen from https://github.com/awesomecoder
      
      // HOW DO WE MAKE COMMENTS?
      // Line comments: anything after the // is ignored by the compiler
      // Block comments: /*   */ (slash star star slash) (comment sandwich)
      // Java Doc comments: /** */ (will automatically generate code documentation)
      
      // Examples:
      
      /* When you have a multi-line comment
         you can do a block comment
         you can do as many lines as you want
         Good for heading comment at top of program
      */
      
      // Debugging:
      
      System.out.println("Hello World!");
      //System.out.println("Hello World!");
      System.out.println("Hello World!");
      /*
      System.out.println("Hello World!");
      System.out.println("Hello World!");
      System.out.println("Hello World!");
      */
      
      
   
   
   }
}
