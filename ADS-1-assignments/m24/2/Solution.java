import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for solution.
 */
public final class Solution {
    /*
     * Constructs the object.
     */
    private Solution() {
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        LinearProbingHashST<Double, Studentdetails> hash
            = new LinearProbingHashST<Double, Studentdetails>();
        while (n > 0) {
            String[] tokens = scan.nextLine().split(",");
            hash.put(Double.parseDouble((tokens[2])),
                     new Studentdetails(tokens[1], Integer.parseInt(tokens[0])));
            n--;
        }
        int m = Integer.parseInt(scan.nextLine());
        while (m > 0) {
            String[] token = scan.nextLine().split(" ");
            if (token[0].equals("BE")) {
                String [] s1 = hash.between(Double.parseDouble(token[1]), Double.parseDouble(token[2]));
                Arrays.sort(s1);
                for (String i : s1) {
                    if (i.equals("null")) {
                        break;
                    } else {
                        System.out.println(i);
                    }
                }
            } if (token[0].equals("LE")) {
                String [] s2 = hash.less(Double.parseDouble(token[1]));
            } else if (token[0].equals("GE")) {
                String [] s3 = hash.high(Double.parseDouble(token[1]));
            }
            m--;
        }
    }
}
