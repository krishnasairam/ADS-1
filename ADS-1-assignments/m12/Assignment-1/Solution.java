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
        int n = Integer.parseInt(sc.nextLine());
        int o = Integer.parseInt(sc.nextLine());
        int p = Integer.parseInt(sc.nextLine());
        int q = Integer.parseInt(sc.nextLine());
        int r = Integer.parseInt(sc.nextLine());
        int s = Integer.parseInt(sc.nextLine());
        Selection se = new Selection(o, p, q, r, s);
        Studentdetails[] list = new Studentdetails[n];
        int i = 0;
        while (n > 0) {
            String[] tokens = sc.next().split(",");
            list[i++] = new Studentdetails(tokens[0], tokens[1], Integer.parseInt(tokens[2]),
            Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]),
            Integer.parseInt(tokens[5]), tokens[6]);
            n--;
        }
        se.board(list, i);
        System.out.println();
        se.seats(list, i);
    }
}
