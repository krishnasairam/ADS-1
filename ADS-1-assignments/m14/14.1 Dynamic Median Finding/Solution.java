import java.util.Scanner;
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
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		Heap heap = new Heap();
		int[] list = new int[n];
		int i = 0;
		while (n > 0) {
			list [i++] = Integer.parseInt(scan.nextLine());
			if (i > 2) {
			heap.sort(list, i);
			float median = (((float)list[(i - 1)/2] + (float)list[(i/2)]/2));
				System.out.println(median);
		} else if(i == 2) {
			System.out.println((float)(list[0] + list[1]) / 2);
		} else {
			System.out.println((float)list[0]);
		}
		n--;
		}
	}
}
