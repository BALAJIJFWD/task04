package bending;

import java.util.Scanner;

public class store {
    public static void main(String[] args) {
        // Array to store names of weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        try (// Scanner to get input from the user
		Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the day position (0-6): ");
			int dayPosition = scanner.nextInt();

			try {
			    // Print the day name corresponding to the user input
			    String dayName = weekdays[dayPosition];
			    System.out.println("The day at position " + dayPosition + " is " + dayName + ".");
			} catch (ArrayIndexOutOfBoundsException e) {
			    // Handle ArrayIndexOutOfBoundsException
			    System.out.println("Invalid day position. Please enter a number between 0 and 6.");
			}
		}
    }
}
