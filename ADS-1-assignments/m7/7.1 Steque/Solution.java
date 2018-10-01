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
        while (n != 0) {
            Steque l = new Steque();
            while (scan.hasNext()) {
                String token = scan.nextLine();
                String[] tokens = token.split(" ");
                switch (tokens[0]) {
                case "push":
                    l.push(Integer.parseInt(tokens[1]));
                    l.print();
                    break;
                case "enqueue":
                    l.enqueue(Integer.parseInt(tokens[1]));
                    l.print();
                    break;
                case "pop":
                    l.pop();
                    l.print();
                    break;
                default :
                    break;
                }
                if (token.equals("")) {
                   break;
                }
            }
            System.out.println();
            n--;
        }
    }
}

