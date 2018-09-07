import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = new int[10];
		
		Scanner s = new Scanner(System.in);
		
		for (int i=0; i < intArray.length; i++) {
			System.out.print("Number, please: ");
			intArray[i] = s.nextInt();
		} 
		if(hasSeven(intArray))
			System.out.println("This one has seven");
		else 
			System.out.println("No seven :( ");
		
		// no even numbers and all smaller than seven
		if (notSmaller(intArray)) {
			System.out.println("All numbers smaller than 7 and odd");
		} else {
			System.out.println("Some numbers bigger than 7 or even");
		}
	} 
	/**
	 * Checks to see if any values in given array are equal to 7
	 * @param someArray
	 * @return true if it finds a 7
	 */
	public static boolean hasSeven(int[] someArray) {
		for (int i=0; i < someArray.length; i++) {
			if (someArray[i] == 7) 
				return true;
			} 
			return false;
		}
	/**
	 * Checks that the values of the given array are smaller than 
	 * 7 and are all odd
	 * @param someArray
	 * @return true only if values are odd or less than 7
	 */
	public static boolean notSmaller(int[] someArray) {
		for (int i=0; i < someArray.length; i++) {
			if (someArray[i]%2 == 0 || someArray[i] >= 7)
				return false;
		}
		return true;
	}
	} 