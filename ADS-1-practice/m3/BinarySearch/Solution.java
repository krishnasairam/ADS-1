import java.util.Scanner;
import java.util.Arrays;
/**
 * Binarysearch.
 */
class Binarysearch {
	int[] pairs;
	int size;
	/**
	* Constructs the object.
	*/
	public Binarysearch(int n) {
		size = 0;
		pairs = new int[n];
	}
	public void add(int x) {
		pairs[size++] = x;
	}
	public int index(int a) {
		for (int i = 0; i < size; i++) {
			if (pairs[i] == a) {
				return i;
			}
		} return -1;
	}
	public void search(int y) {
		Arrays.sort(pairs);
		int lower = pairs[0];
		int mid = pairs[size / 2];
		int upper = pairs[size - 1];
		int index = -1;
		while (lower <= upper) {
			if (y == mid) {
				index = index(mid);
				break;
			} else if (y > mid) {
				lower = mid;
				mid = pairs[(index(lower) + index(upper)) / 2];
			} else if (y < mid) {
				upper = mid;
				mid = pairs[(index(lower) + index(upper)) / 2];
			}
		}
		if (index == -1) {
			System.out.println("false");
		} else {
			System.out.println("true and located at index: " + Integer.toString(index));
		}
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
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Binarysearch p = new Binarysearch(n);
		scan.nextLine();
		while (n != 0) {
			p.add(scan.nextInt());
			n--;
		}
		scan.nextLine();
		p.search(scan.nextInt());
	}
}
