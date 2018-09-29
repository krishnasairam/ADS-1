import java.util.Scanner;
/**
 * Class for add large numbers.
 */
final class AddLargeNumbers {
    /**
     * Constructs the object.
     */
    private AddLargeNumbers() {
        // empty constructor.
    }
    /**
     * adding numbers to stack.
     *
     * @param      number  The number
     *
     * @return     { description_of_the_return_value }
     */
    public static LinkedList numberToDigits(final String number) {
        String[] digits = number.split("");
        LinkedList l = new LinkedList();
        for (String i : digits) {
            l.pushright(Integer.parseInt(i));
        }
        return l;
    }
    /**
     * removing numbers to stack.
     *
     * @param      list  The list
     *
     * @return     { description_of_the_return_value }
     */
    public static String digitsToNumber(final LinkedList list) {
        LinkedList l = list;
        String s = "";
        while (l.size() != 0) {
            s += l.popleft();
        } return s;
    }
    /**
     * Adds large numbers.
     *
     * @param      list1  The list 1
     * @param      list2  The list 2
     *
     * @return     { description_of_the_return_value }
     */
    public static LinkedList addLargeNumbers(final LinkedList list1,
             final LinkedList list2) {
        LinkedList l = list1;
        LinkedList m = list2;
        LinkedList n = new LinkedList();
        int carry = 0;
        int temp = 0;
        final int x = 10;
        while (l.size() != 0 || m.size() != 0) {
            if (m.size() == 0) {
                temp = l.popright();
            } else if (l.size() == 0) {
                temp = m.popright();
            } else {
                temp = l.popright() + m.popright();
            }
            if ((temp % x) + carry == x) {
                n.pushleft(0);
                carry = 1;
            } else {
                n.pushleft((temp % x) + carry);
                carry = temp / x;
            }
        }
        if (carry != 0) {
            n.pushleft(carry);
        }
        return n;
    }
}
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        // empty constructor.
    }
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch (input) {
        case "numberToDigits":
            LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
            LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
            System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
            System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
            break;

        case "addLargeNumbers":
            pDigits = AddLargeNumbers.numberToDigits(p);
            qDigits = AddLargeNumbers.numberToDigits(q);
            LinkedList result = AddLargeNumbers.addLargeNumbers(
                    pDigits, qDigits);
            System.out.println(AddLargeNumbers.digitsToNumber(result));
            break;
        default :
            break;
        }
    }
}

