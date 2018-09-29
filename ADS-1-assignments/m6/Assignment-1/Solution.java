import java.util.Scanner;
/**
 * Class for add large numbers.
 */
class AddLargeNumbers {

    public static LinkedList numberToDigits(String number) {
        String[] digits = number.split("");
        LinkedList l = new LinkedList();
        for (String i : digits) {
            l.pushright(Integer.parseInt(i));
        }
        return l;
    }

    public static String digitsToNumber(LinkedList list) {
        LinkedList l = list;
        String s = "";
        while (l.size() != 0) {
            s += l.popleft();
        } return s;
    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
        LinkedList l = list1;
        LinkedList m = list2;
        LinkedList n = new LinkedList();
        int carry = 0;
        int temp = 0;
        while (l.size() != 0 || m.size() != 0) {
            if (m.size() == 0) {
                temp = l.popright();
            } else if (l.size() == 0) {
                temp = m.popright();
            } else {
                temp = l.popright() + m.popright();
            }
            if ((temp % 10) + carry == 10) {
                n.pushleft(0);
                carry = 1;
            } else {
                n.pushleft((temp % 10) + carry);
                carry = temp / 10;
            }
        }
        if (carry != 0) {
            n.pushleft(carry);
        }
        return n;
    }
}
public class Solution {
    public static void main(String[] args) {
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
            LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
            System.out.println(AddLargeNumbers.digitsToNumber(result));
            break;
        }
    }

}
