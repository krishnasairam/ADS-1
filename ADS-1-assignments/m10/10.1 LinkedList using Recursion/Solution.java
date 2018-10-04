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
        LinkedList l = new LinkedList();
        int size = 0;
        while (sc.hasNextLine()) {
            String[] tokens = sc.nextLine().split(" ");
            switch (tokens[0]) {
            case "insertAt":
                l.insertAt(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                System.out.println(l.print());
                size ++;
                break;
            case "reverse":
                l.reverse();
                System.out.println(l.print());
                break;
            default:
                break;
            }
        }
    }
}