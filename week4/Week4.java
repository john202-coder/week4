package week4;

public class Week4 {

	
		
		    public static void main(String[] args) {
		        // 1. Create an array of int called ages
		        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

		        // a. Subtract first element from the last element dynamically
		        System.out.println("Difference: " + (ages[ages.length - 1] - ages[0]));

		        // b. Create a new array with 9 elements
		        int[] ages2 = {10, 15, 20, 25, 30, 35, 40, 45, 50};

		        // i. Subtract first element from the last element dynamically
		        System.out.println("Difference: " + (ages2[ages2.length - 1] - ages2[0]));

		        // c. Calculate the average age
		        double sum = 0;
		        for (int age : ages) {
		            sum += age;
		        }
		        System.out.println("Average age: " + (sum / ages.length));

		        // 2. Create an array of String called names
		        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

		        // a. Calculate the average number of letters per name
		        double totalLetters = 0;
		        for (String name : names) {
		            totalLetters += name.length();
		        }
		        System.out.println("Average letters per name: " + (totalLetters / names.length));

		        // b. Concatenate all names together with spaces
		        String concatenatedNames = String.join(" ", names);
		        System.out.println("Concatenated names: " + concatenatedNames);

		        // 3. Access last element of an array
		        System.out.println("Last element of names: " + names[names.length - 1]);

		        // 4. Access first element of an array
		        System.out.println("First element of names: " + names[0]);

		        // 5. Create nameLengths array
		        int[] nameLengths = new int[names.length];
		        for (int i = 0; i < names.length; i++) {
		            nameLengths[i] = names[i].length();
		        }

		        // 6. Calculate the sum of nameLengths array
		        int sumOfLengths = 0;
		        for (int length : nameLengths) {
		            sumOfLengths += length;
		        }
		        System.out.println("Sum of name lengths: " + sumOfLengths);
		    }

		    // 7. Method to repeat a word n times
		    public static String repeatWord(String word, int n) {
		        return word.repeat(n);
		    }

		    // 8. Method to return full name
		    public static String fullName(String firstName, String lastName) {
		        return firstName + " " + lastName;
		    }

		    // 9. Method to check if sum of array > 100
		    public static boolean isSumGreaterThan100(int[] numbers) {
		        int sum = 0;
		        for (int num : numbers) {
		            sum += num;
		        }
		        return sum > 100;
		    }

		    // 10. Method to return the average of an array of doubles
		    public static double averageOfArray(double[] numbers) {
		        double sum = 0;
		        for (double num : numbers) {
		            sum += num;
		        }
		        return sum / numbers.length;
		    }

		    // 11. Method to compare averages of two double arrays
		    public static boolean isFirstArrayAverageGreater(double[] arr1, double[] arr2) {
		        return averageOfArray(arr1) > averageOfArray(arr2);
		    }

		    // 12. Method to decide if one should buy a drink
		    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		        return isHotOutside && moneyInPocket > 10.50;
		    }

		    // 13. Custom method: Check if a number is prime
		    // This method checks if a given number is prime
		    public static boolean isPrime(int num) {
		        if (num < 2) return false;
		        for (int i = 2; i <= Math.sqrt(num); i++) {
		            if (num % i == 0) return false;
		        }
		        return true;
		    }
		


	}


