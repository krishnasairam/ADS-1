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
        while (sc.hasNextLine()) {
            String[] tokens = sc.nextLine().split(" ");
            switch (tokens[0]) {
            case "insertAt":
                if (Integer.parseInt(tokens[1]) < 0) {
                    System.out.println("Can't insert at this position.");
                }
                l.insertAt(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                System.out.println(l.print());
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