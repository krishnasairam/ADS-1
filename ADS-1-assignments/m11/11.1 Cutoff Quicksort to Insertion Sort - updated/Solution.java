import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //function.
    }
    /**
     * main.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        Quickimp q = new Quickimp();
        int n = Integer.parseInt(sc.nextLine());
        while (sc.hasNext()) {
            int m = Integer.parseInt(sc.nextLine());
            String[] tokens = sc.nextLine().split(" ");
            if (tokens[0].equals("")) {
                System.out.println("[]");
            } else {
                q.sort(tokens, m);
                n--;
            }
        }
        sc.close();
    }
}
