/**
 * Class for details.
 */
class Studentdetails implements Comparable<Studentdetails> {
    /**
     * name of student.
     */
    private String name;
    /**
     * date of birth.
     */
    private String dob;
    /**
     * subject 1 marks.
     */
    private Integer s1marks;
    /**
     * subject 2 marks.
     */
    private Integer s2marks;
    /**
     * subject 3 marks.
     */
    private Integer s3marks;
    /**
     * totalmarks.
     */
    private Integer total;
    /**
     * reservation category.
     */
    private String rcat;
    /**
     * constuctor.
     *
     * @param      stu   name of student
     * @param      date   date of birth
     * @param      s1     subject 1 marks
     * @param      s2     subject 2 marks
     * @param      s3     subject 3 marks
     * @param      to     total marks
     * @param      res    reservation
     */
    Studentdetails(final String stu, final String date, final Integer s1, final Integer s2, final Integer s3, final Integer to, final String res) {
        this.name = stu;
        this.dob = date;
        this.s1marks = s1;
        this.s2marks = s2;
        this.s3marks = s3;
        this.total = to;
        this.rcat = res;

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
    public Integer gettotal() {
        return this.total;
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
    public Integer gets3marks() {
        return this.s3marks;
    }
    /**
     * returns s2 marks.
     *
     * best case: O(1)
     * worst case: O(1)
     * average case: O(1)
     *
     * @return     s2marks.
     */
    public Integer gets2marks() {
        return this.s2marks;
    }
    /**
     * returns date no of birth.
     *
     * best case: O(1)
     * worst case: O(1)
     * average case: O(1)
     *
     * @return     date..
     */
    public String getdob() {
        return this.dob;
    }
    /**
     * returns reservation.
     *
     * best case: O(1)
     * worst case: O(1)
     * average case: O(1)
     *
     * @return     reservation.
     */
    public String getres() {
        return this.rcat;
    }
    /**
     * returns int.
     *
     * best case: O(1)
     * worst case: O(1)
     * average case: O(1)
     *
     * @return     int.
     */
    public Integer comparedate(Studentdetails that) {
        String[] d1 = this.getdob().split("-");
        String[] d2 = that.getdob().split("-");
        if (Integer.parseInt(d1[2]) > Integer.parseInt(d2[2])) {
            return -1;
        } else if (Integer.parseInt(d1[2]) < Integer.parseInt(d2[2])) {
            return 1;
        } else if (Integer.parseInt(d1[1]) < Integer.parseInt(d2[1])) {
            return -1;
        } else if (Integer.parseInt(d1[1]) < Integer.parseInt(d2[1])) {
            return 1;
        } else if (Integer.parseInt(d1[0]) < Integer.parseInt(d2[0])) {
            return -1;
        } else if (Integer.parseInt(d1[0]) < Integer.parseInt(d2[0])) {
            return 1;
        } else {
            return 0;
        }
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
        return name + "," + Integer.toString(total) + "," + rcat;
    }
    /**
         * Checks the various attributes and returns -1 or 0 or 1 accordingly.
         *
         * @param      that  The that
         *
         * @return     -1 or 0 or 1
         */
    public int compareTo(Studentdetails that) {
        if (this.gettotal() > that.gettotal()) {
            return 1;
        } else if (this.gettotal() < that.gettotal()) {
            return -1;
        } else if (this.gets3marks() > that.gets3marks()) {
            return 1;
        } else if (this.gets3marks() < that.gets3marks()) {
            return -1;
        } else if (this.gets2marks() > that.gets2marks()) {
            return 1;
        } else if (this.gets2marks() < that.gets2marks()) {
            return -1;
        } else {
            return comparedate(that);
        }
    }
}
/**
 * Class for Selection.
 */
class Selection {
    /**
         * no. of vacancies.
         */
    private Integer vac;
    /**
     * no of open vacancies.
     */
    private Integer open;
    /**
     * no of bc vacancies.
     */
    private Integer bcvac;
    /**
     * no of sc vacancies.
     */
    private Integer scvac;
    /**
     * no. of st vacancies.
     */
    private Integer stvac;
    /**
     * Constructs the object.
     */
    public Selection() {

    }
    /**
     * constuctor.
     *
     * @param      v   vancancies
     * @param      o   open vacancies
     * @param      bc  bc vacancies
     * @param      sc  sc vacancies
     * @param      st  st vacancies
     */
    Selection(final Integer v, final Integer o, final Integer bc, final Integer sc, final Integer st) {
        this.vac = v;
        this.open = o;
        this.bcvac = bc;
        this.scvac = sc;
        this.stvac = st;
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
            int max = i;
            for (int j = i + 1; j < n; j++) {
                if (less(array, i, j)) {
                    swap(array, j, max);
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
    public void board(Comparable[] array, int size) {
        Sort(array, size);
        for (int i = 0; i < size; i++) {
            System.out.println(array[i].toString());
        }
    }
    public void seats(Studentdetails[] array, int size) {
        int eopen = -1;
        for (int j = 0; j < size; j++) {
            if (vac == 0) {
                break;
            }
            if (open != 0) {
                if (array[j].getres().equals("ST")) {
                    vac = vac - 1;
                    open = open - 1;
                    System.out.println(array[j].toString());
                } else if (array[j].getres().equals("SC")) {
                    vac = vac - 1;
                    open = open - 1;
                    System.out.println(array[j].toString());
                } else if (array[j].getres().equals("BC")) {
                    vac = vac - 1;
                    open = open - 1;
                    System.out.println(array[j].toString());
                } else if (array[j].getres().equals("Open")) {
                    vac = vac - 1;
                    open = open - 1;
                    System.out.println(array[j].toString());
                }
            } else {
                if (array[j].getres().equals("ST") && stvac != 0) {
                    vac = vac - 1;
                    stvac = stvac - 1;
                    System.out.println(array[j].toString());
                } else if (array[j].getres().equals("SC") && scvac != 0) {
                    vac = vac - 1;
                    scvac = scvac - 1;
                    System.out.println(array[j].toString());
                } else if (array[j].getres().equals("BC") && bcvac != 0) {
                    vac = vac - 1;
                    bcvac = bcvac - 1;
                    System.out.println(array[j].toString());
                } else if (array[j].getres().equals("Open") && eopen > 0) {
                    vac = vac - 1;
                    eopen = eopen - 1;
                    System.out.println(array[j].toString());
                }
            }
        }
    }
}
