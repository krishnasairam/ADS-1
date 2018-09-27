import java.util.Scanner;
import java.util.Arrays;
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
        scan.nextLine();
        while (n != 0) {
            String[] tokens = scan.nextLine().split("");
            int count = 0;
            int temp = 0;
            String st = "";
            Stack s = new Stack();
            for (String token : tokens) {
                if (tokens.length % 2 == 0) {
                    if ("{".equals(token) || "[".equals(token) || "(".equals(token)) {
                        s.push(token);
                        temp ++;
                    } else {
                        if (temp == 0) {
                            System.out.println("NO");
                            break;
                        } else {
                            st = s.pop();
                            if (st.equals("{") && token.equals("}")) {
                                count++;
                            } else if (st.equals("(") && token.equals(")")) {
                                count++;
                            } else if (st.equals("[") && token.equals("]")) {
                                count++;
                            } else {
                                System.out.println("NO");
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("NO");
                    break;
                }
            }
            if (count == tokens.length / 2) {
                System.out.println("YES");
            }
            n--;
        }
    }
}
