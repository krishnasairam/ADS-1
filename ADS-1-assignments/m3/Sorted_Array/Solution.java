import java.util.Scanner;
import java.util.Arrays;
/**
 * Sorted_Array.
 */
class Sorted_Array {
	/**
	 * pairs array.
	 */
	int[] pairs;
	/**
	 * size of array.
	 */
	int size;
	/**
	* Constructs the object.
	*/
	public Sorted_Array(int n) {
		size = 0;
		pairs = new int[n];
	}
	public void add(int x) {
		pairs[size++] = x;
	}
	public void sort() {
		Arrays.sort(pairs);
		String s = "";
		for (int i: pairs) {
			s += i +",";
		}
		s = s.substring(0, s.length() - 2);
		System.out.println(s);
	}
}
public final class Solution {
	/**
	* Constructs the object.
	*/
	private Solution() {
		// leave this blank
	}
	/**
	 * main function to execute test cases.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(
			System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		String[] list1;
		String[] list2;
		Sorted_Array p = new Sorted_Array(m + n);
		scan.nextLine();
		list1 = scan.nextLine().split(",");
		for (String i : list1) {
			p.add(Integer.parseInt(i));
		}
		if (n == 0) {
			scan.nextLine();
		}
		list2 = scan.nextLine().split(",");
		for (String j : list2) {

			p.add(Integer.parseInt(j));
		}
		p.sort();
	}
}
