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
    private double marks;
    /**
     * Constructs the object.
     *
     * @param      roll   The roll
     * @param      name   The name
     * @param      marks  The marks
     */
    Studentdetails(final String name, final double marks) {
        this.name = name;
        this.marks = marks;

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
    public double marks() {
        return this.marks;
    }
}
