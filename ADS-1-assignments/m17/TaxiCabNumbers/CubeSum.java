/**
 * Class for cube sum.
 */
class CubeSum implements Comparable<CubeSum> {
    private final int sum;
    int i;
    int j;
/**
 * Constructs the object.
 *
 * @param      i     { parameter_description }
 * @param      j     { parameter_description }
 */
    public CubeSum(final int i, final int j) {
        this.sum = i * i * i + j * j * j;
        this.i = i;
        this.j = j;
    }
/**
 * { function_description }.
 *
 * @param      that  The that
 *
 * @return     { description_of_the_return_value }
 */
    public int compareTo(final CubeSum that) {
        if (this.sum < that.sum) return -1;
        if (this.sum > that.sum) return +1;
        return 0;
    }
/**
 * Returns a string representation of the object.
 *
 * @return     String representation of the object.
 */
    public String toString() {
        return sum + " = " + i + "^3" + " + " + j + "^3";
    }
    /**
     * get j.
     *
     * @return     { description_of_the_return_value }
     */
    public int getj() {
        return j;
    }
    /**
     * geti.
     *
     * @return     { description_of_the_return_value }
     */
    public int geti() {
        return i;
    }
    public int getsum() {
        return sum;
    }
}