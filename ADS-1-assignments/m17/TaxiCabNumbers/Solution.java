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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        MinPQ<CubeSum> pq = new MinPQ<CubeSum>();
        for (int i = 1; i <= 550; i++) {
            pq.insert(new CubeSum(i, i));
        }
        // int i = 0;
        CubeSum prev = new CubeSum(0, 0);
        long sum = 0;
        // for (k < n; k++) {
        int p = 1;
        int k = 0;
        while (!pq.isEmpty()) {
            CubeSum c = pq.delMin();
            if (prev.getsum() == c.getsum()) {
                p++;
                if (p == m)
                {
                    sum = c.getsum();

                    if (++k == n) break;
                }
            }
            else {
                p = 1;
            }
            prev = c;
            if (c.j < 550)
                pq.insert(new CubeSum(c.i, c.j + 1));
            // }
        }
        System.out.println(sum);

    }
}
