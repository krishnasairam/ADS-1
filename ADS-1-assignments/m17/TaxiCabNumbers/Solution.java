import java.util.Scanner;
class CubeSum implements Comparable<CubeSum> {
    private final int sum;
    int i;
    int j;

    public CubeSum(int i, int j) {
        this.sum = i * i * i + j * j * j;
        this.i = i;
        this.j = j;
    }

    public int compareTo(CubeSum that) {
        if (this.sum < that.sum) return -1;
        if (this.sum > that.sum) return +1;
        return 0;
    }

    public String toString() {
        return sum + " = " + i + "^3" + " + " + j + "^3";
    }
    public int getj() {
        return j;
    }
    public int geti() {
        return i;
    }
    public int getsum() {
        return sum;
    }
}
/**
 * solution.
 */
public final class Solution {
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
        Scanner scan = new Scanner(System.in);
        int n = 500;
        Integer p = scan.nextInt();
        Integer m = scan.nextInt();
        MinPQ<CubeSum> pq = new MinPQ<CubeSum>();
        for (int k = 1; k <= n; k++) {
            pq.insert(new CubeSum(k, k));
        }
        CubeSum prev = new CubeSum(0, 0);
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int a = 0;
            while (!pq.isEmpty()) {
                CubeSum c = pq.delMin();
                if (prev.compareTo(c) == 0) {
                    a++;
                    if (a == m) {
                        sum = c.getsum();
                        break;
                    }
                } else {
                    prev = c;
                    a = 1;
                }
                if (c.j < n) {
                    pq.insert(new CubeSum(c.i, c.j + 1));
                }
            }
        }
        System.out.println(sum);
    }
}
