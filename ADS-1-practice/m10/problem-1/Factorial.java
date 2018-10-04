import java.util.Scanner;
/**
 * Class for factorial.
 */
class Factorial{
  /**
   * main method.
   */
   public static void main(final String args[]){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number:");
      int num = scan.nextInt();
      int fact = fact(num);
      System.out.println("Factorial of entered number is: " + fact);
   }
   /**
    * { function_description }
    *
    * @param      n     { parameter_description }
    *
    * @return     { description_of_the_return_value }
    */
   static int fact(final int n)
   {
       int output;
       if(n==1){
         return 1;
       }
       output = fact(n-1)* n;
       return output;
   }
}