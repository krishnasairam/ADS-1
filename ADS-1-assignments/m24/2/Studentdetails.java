/**
 * Class for details.
 */
class Studentdetails {
    /**
     * name.
     */
    private String name;
    /**
     *  marks.
     */
    private int roll;
    /**
     * Constructs the object.
     *
     * @param      name1   The name
     * @param      marks1  The marks
     */
    Studentdetails(final String name1, final int roll1) {
        this.name = name1;
        this.roll = roll1;

    }
    /**
     * returns total.
     *
     * best case: O(1)
     * worst case: O(1)
     * average case: O(1)
     *
     * @return     toatalmarks.
     */
    public String name() {
        return this.name;
    }
    /**
     * returns s3 marks.
     *
     * best case: O(1)
     * worst case: O(1)
     * average case: O(1)
     *
     * @return     s3marks.
     */
    public int roll() {
        return this.roll;
    }
}
