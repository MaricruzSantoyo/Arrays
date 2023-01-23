
public class DataStructures {
	
	//1st part of part 3:

	public static int[] toPower(int size, int power) {
		int[] returnArray = new int[size];
		for (int i = 0; i < returnArray.length; ++i) {
			returnArray[i] = (int) Math.pow(i, power);
		}
		return returnArray;
	}
	
	//Part 1:

	public static void main(String[] args) {
		int[] myArray = { 1, 2, 3, 4, 5 };

		int sum = 0;
		for (int i = 0; i < myArray.length; i++) {
			sum += myArray[i];
		}

		System.out.println(sum);
		
		// Part 2:
		
		System.out.println("----------");

		double[] exampleArray = { 1, 5, 6, 5, 4, 1 };

		double maximum = exampleArray[0];

		int index = 0;

		for (int i = 1; i < exampleArray.length; i++) {

			if (exampleArray[i] > maximum) {

				maximum = exampleArray[i];

				index = i;

			}

		}

		System.out.println(index);

		// the system outputs to 2.
		
		
		//2nd half of part 3:

		System.out.println("----------");

		int[] result = toPower(4, 2);
		for (int i = 0; i < result.length; ++i) {
			System.out.println(result[i]);
		}
	}

}
