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
        int n = scan.nextInt();
        while (n != 0) {
            Stack s = new Stack();
            String[] tokens = scan.nextLine().split("");
            int count = 0;
            String st = "";
            for (String token : tokens) {
                if (tokens.length % 2 == 0) {
                    if (!"}".equals(token) && !"]".equals(token) && !")".equals(token)) {
                        s.push(token);
                        st = s.pop();
                    } else if (st == "{" && token == "}") {
                        count++;
                    } else if (st == "(" && token == ")") {
                        count++;
                    } else if (st == "[" && token == "]") {
                        count++;
                    } else {
                        System.out.println("No");
                        break;
                    }
                } else {
                    System.out.println("No");
                    break;
                }
            }
            if (count == tokens.length / 2) {
                System.out.println("yes");
            }
            n--;
        }
    }
}
