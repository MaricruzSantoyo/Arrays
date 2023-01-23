
public class ArraysToPower {
	
	public static int[] toPower(int size, int power) {
		int[] returnArray =new int[size];
		//they want each array index in returnArray raised to the value of power.
		for(int i=0; i<returnArray.length; ++i) {
			returnArray[i]= (int)Math.pow(i, power);
		}
		return returnArray;
	}
	
	public static void main(String[] args) {
		//the first thing it asks is to create a
		//public static method called "toPower"
		int[] result = toPower(4,2);
		for(int i=0; i<result.length; ++i) {
			System.out.println(result[i]);
		}
	}

}
