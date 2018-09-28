import java.util.Scanner;
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
        int n = Integer.parseInt(scan.nextLine());
        Deque d = new Deque();
        while (n != 0) {
            String[] tokens = scan.nextLine().split(" ");
            switch (tokens[0]) {
            case "pushLeft":
                d.pushleft(Integer.parseInt(tokens[1]));
                break;
            case "pushRight":
                d.pushright(Integer.parseInt(tokens[1]));
                break;
            case "size":
                d.size();
                break;
            case "popLeft":
                System.out.println(d.popleft());
                break;
            case "popright":
                System.out.println(d.popright());
                break;
            default :
                break;
            }
            n--;
        }
    }
}

