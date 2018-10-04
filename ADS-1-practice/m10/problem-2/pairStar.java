import java.util.Scanner;
/**
 * Class for factorial.
 */
class pairStar{
  /**
   * main method.
   */
   public static void main(final String args[]){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the String:");
      String str = scan.nextLine();
      String fstr = star(str);
      System.out.println(fstr);
   }
   /**
    * { function_description }
    *
    * @param      n     { parameter_description }
    *
    * @return     { description_of_the_return_value }
    */
   static String star(final String s)
   {
      int n = s.length();
      if (n < 2) {
        return s;
      }
      if (s.charAt(0) == s.charAt(1)) {
        return s.charAt(0) + "*" + star(s.substring(1));
      }
      return s.charAt(0) + star(s.substring(1));
   }
}
