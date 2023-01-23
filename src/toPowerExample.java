
public class toPowerExample {

	public static int[] toPower(int size, int power) {
		int[] returnArray = new int[size];
		for (int i = 0; i < returnArray.length; ++i) {
			returnArray[i] = (int) Math.pow(i, power);
		}
		return returnArray;
	}

	public static void main(String[] args) {

		int[] result = toPower(4, 2);
		for (int i = 0; i < result.length; ++i) {
			System.out.println(result[i]);
		}

	}

}
