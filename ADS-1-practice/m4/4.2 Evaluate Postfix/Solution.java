import java.util.Scanner;
/**
 * class solution.
 */
public final class Solution {
    /**
    * Constructs the object.
    */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] tokens = scan.nextLine().split(" ");
        Stack s = new Stack();
        int number1;
        int number2;
        int result = 0;
        for (int j = 0; j < tokens.length; j++) {
            String token = tokens[j];
            if (!"+".equals(token) && !"*".equals(token) && !"-"
                .equals(token) && !"/".equals(token)) {
                s.push(Integer.parseInt(token));
            } else {
                String operator = tokens[j];
                number1 = s.pop();
                number2 = s.pop();
                if (operator.equals("/")) {
                    result = number1 / number2;
                    s.push(result);
                } else if (operator.equals("*")) {
                    result = number1 * number2;
                    s.push(result);
                } else if (operator.equals("+")) {
                    result = number1 + number2;
                    s.push(result);
                } else if (operator.equals("-")) {
                    result = number1 - number2;
                    s.push(result);
                } else {
                    System.out.println("Illeagal symbol");
                }
            }
        }
        System.out.println(result);
    }
}
