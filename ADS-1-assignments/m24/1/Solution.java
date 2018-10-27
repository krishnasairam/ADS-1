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
        LinearProbingHashST<Integer, Studentdetails> hash
            = new LinearProbingHashST();
        while (n > 0) {
            String[] tokens = scan.nextLine().split(",");
            hash.put(Integer.parseInt(tokens[0]), new Studentdetails(tokens[1], Double.parseDouble((tokens[2]))));
            n--;
        }
        int m = Integer.parseInt(scan.nextLine());
        while (m > 0) {
            String[] token = scan.nextLine().split(" ");
            System.out.println(token[0]);
            if (token[0] == "get") {
                if (Integer.parseInt(token[2]) == 1) {
                    System.out.println(hash.get(Integer.parseInt(token[1])).name());
                } else if (Integer.parseInt(token[2]) == 2) {
                    System.out.println(hash.get(Integer.parseInt(token[1])).marks());
                }
            }
            m--;
        }
    }
}
