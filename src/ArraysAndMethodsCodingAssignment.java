
import java.time.LocalTime;

public class ArraysAndMethodsCodingAssignment {

	public static void main(String[] args) {
		
		////
		// 1) Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93
		int [] ages = new int [] {3, 9, 23, 64, 2, 8, 28, 93}; 
		
		// 1.a) Programmatically subtract the value of the first element in the array from the value in the last element of the array. 
		// 1.a) Print the result to the console.
		int firstNumber = ages[0];
		int lastNumber = ages[ages.length - 1];
		int subtractionResult = firstNumber - lastNumber;
		
		System.out.println(subtractionResult); // Will print "-90"

		// 1.b) Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		int [] ages2 = new int [] {3, 9, 23, 64, 89, 2, 8, 28, 93}; // "89" added to middle of array

		int firstNumber2 = ages2[0];
		int lastNumber2 = ages2[ages2.length - 1];
		int subtractionResult2 = firstNumber2 - lastNumber2;
		
		System.out.println(subtractionResult2); // Will print "-90" again because I did not change the first or last index value
		
		// 1.c) Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int sum = sumOfAges(ages);
		System.out.println(sum / (ages.length)); // Will print "28" as that is the truncated average of int[] ages ( (3 + 9 + 23 + 64 + 2 + 8 + 28 + 93) / 8 ) = 28.75
		
		////
		// 2) Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”
		String [] names = new String [6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		// 2.a) Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int letters = sumOfChars(names);
		System.out.println(letters / names.length); // Will print out "3" as that is the truncated average of (((3)“Sam” + (5)“Tommy” + (3)“Tim” + (5)“Sally” + (4)“Buck” + (3)“Bob”) / 6 ) = 3.83
		
		// 2.b) Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String stringOfNames = concatenateAll(names);
		System.out.println(stringOfNames);
		
		// 3) How do you access the last element of any array?
		String lastElement = names[names.length - 1];
		System.out.println(lastElement); // Will print "Bob"
		
		// 4) How do you access the first element of any array?
		String firstElement = names[0];
		System.out.println(firstElement); // Will print "Sam"
		
		// 5) Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int [] nameLengths = new int [names.length];
		
		for (int i =0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		// 6) Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		System.out.println(sumOfAges(nameLengths)); 
		
		// 7) Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.
		System.out.println(multiplyString("Hello", 3)); // Will print "HelloHelloHello"
		
		// 8) Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		String firstName = "Katie";
		String lastName = "Westcott";
		String fullName = createFullName(firstName, lastName);
		
		System.out.println(fullName); // Will print "Katie Westcott"
		
		// 9) Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		System.out.println(isGreaterThan100(nameLengths)); // Will print "false"
		
		// 10) Write a method that takes an array of double and returns the average of all the elements in the array.
		double [] doubleTroubleArray = new double [names.length];
		
		for (int i =0; i < names.length; i++) {
			doubleTroubleArray[i] = names[i].length();
		}
		
		System.out.println(averageOfDoubles(doubleTroubleArray)); // Will print "3.8333333..."
		
		// 11) Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		double [] doubleToilAndTrouble = new double [] {23.5, 458.6, 62.8, 751};
		
		System.out.println(leftIsBigger(doubleToilAndTrouble, doubleTroubleArray)); // Will print "true"
		
		// 12) Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		boolean isHot = true;
		boolean isNotHot = false;
		double haveBigMoola = 20.00;
		double noHaveBigMoola = 9.75;
		
		boolean outcomeOne = willBuyDrink(isNotHot, noHaveBigMoola); // Will print "false"
		System.out.println(outcomeOne);
		
		boolean outcomeTwo = willBuyDrink(isHot, noHaveBigMoola); // Will print "false"
		System.out.println(outcomeTwo);
		
		boolean outcomeThree = willBuyDrink(isNotHot, haveBigMoola); // Will print "false"
		System.out.println(outcomeThree);
		
		boolean outcomeFour = willBuyDrink(isHot, haveBigMoola); // Will print "true"
		System.out.println(outcomeFour);
		
		// 13) Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		// See bottom of code for correlating method
		// Method "canKatieGoZooing" determines whether or not Katie can go to the zoo with the parameters of it being open on weekends only from 8am - 8pm. 
		
		System.out.println(canKatieGoZooing(2, LocalTime.now())); // Will always print "false" because it is Monday (2)
		System.out.println(canKatieGoZooing(7, LocalTime.now())); // Will print "true" if the actually current time is between 8am & 8pm because it is Saturday (7)
		
	}
	
	public static int sumOfAges(int [] numbers) { // Method for section 1.c & 6 & 9
	
		int sum = 0;
	
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	
	public static int sumOfChars(String [] words) { // Method for section 2.a
		
		int sum = 0;
		
		for (int i = 0; i < words.length; i++ ) {
			sum += words[i].length();
		}
		return sum;
	}
	
	
	public static String concatenateAll(String [] str) { // Method for section 2.b
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < str.length; i++) {
			
			if (i + 1 >= str.length) {
				
				result.append(str[i]);
				
			}else {
				
				result.append(str[i] + " ");
			}	
		}
		return result.toString();
	}
	
	
	public static String multiplyString(String word, int n) { // Method for section 7
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			result.append(word);
		}
		return result.toString();
	}
	
	
	public static String createFullName(String first, String last) { // Method for section 8

		String fullName = first + " " + last;
		
		return fullName;
		
	}
	
	
	public static boolean isGreaterThan100(int [] num) { // Method for section 9
		
		return sumOfAges(num) > 100;
	}
	
	
	public static double averageOfDoubles(double [] numbers) { // Method for section 10 & 11
		
		double sum = 0;
	
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}
	
	
	public static boolean leftIsBigger(double [] left, double [] right) { // Method for section 11
		
		double averageOfLeft = averageOfDoubles(left);
		double averageOfRight = averageOfDoubles(right);
		return averageOfLeft > averageOfRight;
	}
	
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { // Method for section 12
		
		  return isHotOutside == true && moneyInPocket >= 10.50;
	}
	
	// I know this is incorrect formatting for the variables - Done this way for visual grouping of the code questions only
	private static LocalTime Open = LocalTime.of(8, 0); // for section 13
	private static LocalTime Close = LocalTime.of(20, 0); // for section 13
	
	public static boolean canKatieGoZooing(int dayOfWeek, LocalTime currentTime) { // Method for section 13
		
		return (dayOfWeek == 1 || dayOfWeek == 7) && (currentTime.isAfter(Open) && currentTime.isBefore(Close));
	}
}
