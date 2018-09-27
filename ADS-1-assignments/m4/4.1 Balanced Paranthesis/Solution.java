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
            String str = "";
            //System.out.println(Arrays.toString(tokens));
            for (String token : tokens) {
                str += token;
                if (tokens.length % 2 == 0) {
                    //System.out.println(token);
                    if ("{".equals(token) || "[".equals(token) || "(".equals(token)) {
                        s.push(token);
                        temp ++;
                    } else {
                        if (temp == 0) {
                            System.out.println("NO");
                            break;
                        } else {
                            st = s.pop();
                            //System.out.println(st);
                            if ((st.equals("{") && token.equals("}")) || (st.equals("(") && token.equals(")")) || (st.equals("[") && token.equals("]"))) {
                                count++;
                                temp--;
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
            else {
                System.out.println("NO");
                break;
            }
            n--;
        }
    }
}
