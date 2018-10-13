/**
 * Class for Stock.
 */
class Stock {
    /**
     * name.
     */
    private String stockname;
    /**
     * stockvalue.
     */
    private Double stockvalue;
    /**
    *the object to access of minheap.
    */
    private MinPQ<Stock> min;
    /**
     *the object to access of maxheap.
     */
    private MaxPQ<Stock> max;
    /**
     * frequency.
     */
    private int frequency;
    /**
     * minarray.
     */
    private Stock[] minarray;
    /**
     * maxarray;
     */
    private Stock[] maxarray;
    /**
     * Constructs the object.
     */
    Stock() {
        //emptyconstructor
    }
    /**
     * Constructs the object.
     *
     * @param      n     { parameter_description }
     * @param      a     { parameter_description }
     * @param      p     { parameter_description }
     */
    Stock(final String n, final Double a) {
        this.stockname = n;
        this.stockvalue = a;
        min = new MinPQ<Stock>(10);
        max = new MaxPQ<Stock>(10);
        frequency = 0;
        minarray = new Stock[5];
        maxarray = new Stock[5];
    }
    /**
     * get name.
     *
     * @return     { description_of_the_return_value }
     */
    String getname() {
        return this.stockname;
    }
    /**
     * get price.
     *
     * @return     { description_of_the_return_value }
     */
    public Double getvalue() {
        return this.stockvalue;
    }
    public int getfrequency() {
        return this.frequency;
    }
    /**
     *the method will insert the element
     *to minheap.
     * @param      item  The item
     */
    public void insertAtMin(final Stock item) {
        min.insert(item);
    }
    /**
     *the method will insert the element
     *to maxheap.
     * @param      item  The item
     */
    public void insertAtMax(final Stock item) {
        max.insert(item);
    }
    /**
     *this method gets the minimum element.
     * from minheap.
     * @return     The minimum.
     */
    public Stock getMin() {
        return min.min();
    }
    /**
     *this method gets the maximum element.
     * from maxheap.
     * @return     The minimum.
     */
    public Stock getMax() {
        return max.max();
    }
    /**
     *this method delete the maximum element.
     * from maxheap.
     * @return     The minimum.
     */
    public Stock delMax() {
        return max.delMax();
    }
    /**
     *this method delete the minimum element.
     * from maxheap.
     * @return     The minimum.
     */
    public Stock delMin() {
        return min.delMin();
    }
    /**
     * compare.
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    int compareTo(final Stock that) {
        if (this.stockvalue.compareTo(that.stockvalue) > 0) {
            return 1;
        } else if (this.stockvalue.compareTo(that.stockvalue) < 0) {
            return -1;
        }
        if (this.stockname.compareTo(that.stockname) > 0) {
            return 1;
        } else if (this.stockname.compareTo(that.stockname) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
    public void print(Stock[] list) {
        for (Stock s : list) {
            insertAtMax(s);
            insertAtMin(s);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(delMin());
            System.out.println(delMax());
        }
    }
}
/**
 * Class for binary search tree.
 */
public class BinarySearchTree {
    /**
     * Class for node.
     */
    class Node {
        /**
         * key.
         */
        private String key;
        /**
         * value.
         */
        private Integer frequency;
        /**
         * left.
         */
        private Node left;
        /**
         * right.
         */
        private Node right;
        /**
         * Constructs the object.
         *
         * @param      k     { parameter_description }
         * @param      v     { parameter_description }
         */
        Node(final String k, final Integer v) {
            this.key = k;
            this.frequency = v;
            this.left = null;
            this.right = null;
        }
    }
    /**
     * root.
     */
    private Node root;
    /**
     * Constructs the object.
     */
    BinarySearchTree() {
        root = null;
    }
    /**
     * put.
     *
     * @param      key    The key
     * @param      frequency  The frequency
     */
    public void put(final String key, final Integer frequency) {
        root = put(root, key, frequency);
    }
    /**
     * put.
     *
     * @param      x      { parameter_description }
     * @param      key    The key
     * @param      frequency  The frequency
     *
     * @return     { description_of_the_return_frequency }
     */
    private Node put(final Node x, final String key, final Integer frequency) {
        if (x == null) {
            return new Node(key, frequency);
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, frequency);
        } else if (cmp > 0) {
            x.right = put(x.right, key, frequency);
        } else {
            x.frequency = frequency;
        }
        return x;
    }
    /**
     * get.
     *
     * @param      key   The key
     *
     * @return     { description_of_the_return_frequency }
     */
    public Integer get(final String key) {
        return get(root, key);
    }
    /**
     * get.
     *
     * @param      x     { parameter_description }
     * @param      key   The key
     *
     * @return     { description_of_the_return_frequency }
     */
    private Integer get(final Node x, final String key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return get(x.left, key);
        } else if (cmp > 0) {
            return get(x.right, key);
        }
        return x.frequency;
    }
}
