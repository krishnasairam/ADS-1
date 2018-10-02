import java.util.Scanner;
/**
 * Class for details.
 */
class Teams implements Comparable<Teams> {
    /**
     * name.
     */
    private String country;
    /**
     * no of wins.
     */
    private Integer win_matchs;
    /**
     * no of lost.
     */
    private Integer lost_matchs;
    /**
     * no of draws.
     */
    private Integer draw_matchs;
    /**
     * constuctor.
     *
     * @param      n   country
     * @param      w   win_matchs
     * @param      l   lost_matchs
     * @param      d   draw_matchs
     */
    Teams(final String n, final Integer w, final Integer l, final Integer d) {
        this.country = n;
        this.win_matchs = w;
        this.lost_matchs = l;
        this.draw_matchs = d;
    }
    /**
     * returns name.
     *
     * best case: O(1)
     * worst case: O(1)
     * average case: O(1)
     *
     * @return     name of country.
     */
    String getname() {
        return this.country;
    }
    /**
     * returns no of wins.
     *
     * best case: O(1)
     * worst case: O(1)
     * average case: O(1)
     *
     * @return     number of win matchs.
     */
    Integer getWins() {
        return this.win_matchs;
    }
    /**
     * returns no of lost.
     *
     * best case: O(1)
     * worst case: O(1)
     * average case: O(1)
     *
     * @return     number of lost matchs.
     */
    Integer getLosses() {
        return this.lost_matchs;
    }
    /**
     * returns no of draws.
     *
     * best case: O(1)
     * worst case: O(1)
     * average case: O(1)
     * @return     number of draw matchs.
     */
    Integer getDraws() {
        return this.draw_matchs;
    }
    /**
    * Returns a string representation of the object.
    *
    * @return     String representation of the object.
    * best case: O(1)
    * worst case: O(1)
    * average case: O(1)
    */
    public String toString() {
        return this.country;
    }
    /**
         * Checks the various attributes and returns -1 or 0 or 1 accordingly.
         *
         * @param      that  The that
         *
         * @return     -1 or 0 or 1
         */
    public int compareTo(Teams that) {
        if (this.getWins() > that.getWins()) {
            return 1;
        } else if (this.getWins() < that.getWins()) {
            return -1;
        } else if (this.getLosses() < that.getLosses()) {
            return 1;
        } else if (this.getLosses() > that.getLosses()) {
            return -1;
        } else if (this.getDraws() > that.getDraws()) {
            return 1;
        } else if (this.getDraws() < that.getDraws()) {
            return -1;
        } else {
            return 0;
        }
    }
}
/**
 * Class for table.
 */
class Selection {
    /**
     * Constructs the object.
     */
    public Selection() {

    }
    /**
     * Selection Sort function for array.
     *
     * best case: O(n^2)
     * worst case: O(n^2)
     * average case: O(n^2)
     *
     * @param      array  The array
     * @param      size   The size
     */
    public void Sort(Comparable[] array, int size) {
        int n = size;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (less(array, i, j)) {
                    swap(array, j, min);
                }
            }
        }
    }
    /**
     * Finds which value is lower.
     *
     * @param      arr   The arr
     * @param      ind1  The ind 1
     * @param      ind2  The ind 2
     *
     * best case: O(1)
     * worst case: O(1)
     * average case: O(1)
     * @return     { description_of_the_return_value }
     */
    public boolean less(Comparable[] arr, int i, int j) {
        return arr[i].compareTo(arr[j]) < 0;
    }
    /**
     * Swaps the values in the array.
     *
     * @param      a     Team array
     * @param      ind1  The ind 1
     * @param      ind2  The ind 2
     * best case: O(1)
     * worst case: O(1)
     * average case: O(1)
     */
    public void swap(Comparable[] a, int ind1, int ind2) {
        Comparable temp = a[ind1];
        a[ind1] = a[ind2];
        a[ind2] = temp;
    }
    /**
     * Finds the Leaderboard and returns leaderboard string.
     *
     * @param      array  The array
     * @param      size   The size
     *
     * @return     String with team names.
     * best case: O(n)
     * worst case: O(n)
     * average case: O(n)
     */
    public String leaderboard(Comparable[] array, int size) {
        Sort(array, size);
        String s = "";
        for (int i = 0; i < size; i++) {
            s += array[i].toString() + ",";
        }
        return s.substring(0, s.length() - 1);
    }
}
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
