package Application;

public class Revertion {

	public static void main(String[] args) {
		/*
		 * Example of input array: [5,7,3,1] 
		 * Expected return result: [1,3,7,5]
		 */
		int someArray[] = { 5, 7, 3, 1 };
		int sizeSomeArray = someArray.length;
		int[] revert = new int[sizeSomeArray];
		int sizeSomeArrayZeroBased = sizeSomeArray - 1;

		for (int i = 0; i < sizeSomeArray; i++) {

			revert[i] = someArray[sizeSomeArrayZeroBased - i];
			System.out.print(revert[i]);

		}

	}

}
