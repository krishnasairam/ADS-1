import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
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
                System.out.println(hash.between(Double.parseDouble(token[1]), Double.parseDouble(token[2])));
                Studentdetails[] s1 = (Studentdetails[]) hash.between(Double.parseDouble(token[1]), Double.parseDouble(token[2]));
                for (Studentdetails i : s1) {
                    if (i != null) {
                        System.out.println(i.name());
                    } else {
                        break;
                    }
                }
            } if (token[0].equals("LE")) {
                Studentdetails[] s2 = (Studentdetails[]) hash.less(Double.parseDouble(token[1]));
                for (Studentdetails j : s2) {
                    if (j != null) {
                        System.out.println(j.name());
                    } else {
                        break;
                    }
                }
            } else if (token[0].equals("GE")) {
                Studentdetails[] s3 = (Studentdetails[]) hash.high(Double.parseDouble(token[1]));
                for (Studentdetails k : s3) {
                    if (k != null) {
                        System.out.println(k.name());
                    } else {
                        break;
                    }
                }
            }
            m--;
        }
    }
}
