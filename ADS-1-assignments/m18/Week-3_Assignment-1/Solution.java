import java.util.Scanner;
/**
 * solution.
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
        BinarySearchTree bst = new BinarySearchTree();
        int n = sc.nextInt();
        int b = 1 + 2;
        int m = b + b;
        sc.nextLine();
        Stock[] list = new Stock[n];
        int i = 0;
        while (m > 0) {
            int a = n;
            i = 0;
            while (a > 0) {
                String[] tokens = sc.nextLine().split(",");
                list[i++] = new Stock(tokens[0], Double.parseDouble(tokens[1]));
                a--;
            }
            for (Stock s : list) {
                s.insertAtMax(s);
                s.insertAtMin(s);
            }
            System.out.println();
            m--;
        }
        for (Stock t : list) {
            bst.put(t.getname(), t.getfrequency());
        }
        int p = Integer.parseInt(sc.nextLine());
        while (p > 0) {
            String[] methods = sc.nextLine().split(",");
            p--;
            switch (methods[0]) {
            case "get":
                if (methods[1] == "minST") {
                    break;
                }
                if (methods[1] == "maxST") {
                    break;
                }
                break;
            case "intersection":
                break;
            default:
                break;
            }
        }
    }
}
