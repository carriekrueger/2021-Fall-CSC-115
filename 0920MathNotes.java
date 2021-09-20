// Carrie Krueger
// 9-20-21
// Notes on math, casting, constants (Ch. 3); Math, rounding (Ch. 4)

public class MathNotes {
   public static void main(String[] args) {
      
      doMath(); // let's do some math
      
   }
   
   // a method to do math things
   public static void doMath() {
   
      // Division
      
      System.out.println(5/2);  // 2 ... integers
      System.out.println(5.0/2);  // 2.5 ... with a double
      
      int num1 = 60;
      int num2 = 50;
      
      System.out.println(num1/num2); // exact?
      System.out.println(1.0*num1/num2);  // works... introduce a DOUBLE LITERAL
      System.out.println((double)num1/num2); // proper way: CASTING
      // casting is when you temporarily turn a variable into a different type
      // PEMDAS at work...
      System.out.println((double)(num1/num2));  // nope, cast too late
      
      // casting TRUNCATES (doesn't round)
      
      double pay = 500.92;
      System.out.println((int)pay); // 500 or 501??? 500....
      
      pay = 99.9999999999999;
      System.out.println((int)pay); // 99
      
      
      // What if we want to round?
      // Math: a premade Java class (like String)
      // many useful methods that do math things
      // access with Math._____
      // can send information/variables in the ( )
      
      // round: Math.round(double num)
      // returns (gives) a long, need to cast to an int
      
      int roundedPay = (int)Math.round(pay);  // without cast: error (type mismatch)
      System.out.println(roundedPay); // 100
      
      //EXPONENTS (POWERS)
      // ex. num1 squared?
      // num1 * num1 
      // OR use Math.pow(base, exponent)     
      // returns a double 
      
      double squared = Math.pow(num1, 2);
      System.out.println(squared); //3600.0
      
      
      //CONSTANTS (constant variables)
      //a variable whose value is set once and cannot be changed 
      //proper formatting: all caps, keyword final 
      
      final int NUMBER_OF_STUDENTS = 12;
      
      double TAX_RATE = 0.08; // not quite.... 
      
      //Math -> built in constants 
      System.out.println(Math.PI);
      
   
   
   }
   
}
