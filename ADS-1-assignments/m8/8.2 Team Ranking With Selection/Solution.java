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
        Selection t = new Selection();
        Teams[] list = new Teams[2 * (2 + 2 + 1)];
        int n = 0;
        while (sc.hasNextLine()) {
            String[] tokens = sc.nextLine().split(",");
            list[n++] = new Teams(tokens[0], Integer.parseInt(tokens[1]),
            Integer.parseInt(tokens[2]), Integer.parseInt(tokens[2 + 1]));
        }
        System.out.println(t.leaderboard(list, n));
    }
}
