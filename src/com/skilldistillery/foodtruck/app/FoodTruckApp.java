package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.Foodtruck;

public class FoodTruckApp {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Foodtruck fleet[] = new Foodtruck[5]; // declaring/initializing fleet array

		// Main app does not pass in ID value

		System.out.println("Please input information for up to 5 Food Trucks"); // Needs to be able to quit at any time

		Foodtruck userTruck = null; // initializing and declaring a foodtruck object null

		int counter = 0;

		for (int i = 0; i < fleet.length; i++) { // for loop that prompts the user to enter info on 5 food trucks
			userTruck = new Foodtruck(); // needs to give the option to quit before 5 loops
			System.out.println("Please enter name");
			userTruck.setName(input.next());
			if (userTruck.getName().equals("quit")) {
				break;
			}
			System.out.println("Please enter food Type");
			userTruck.setFoodType(input.next());
			System.out.println("Please enter Rating 1-5");
			userTruck.setRating(input.nextInt());
			fleet[i] = userTruck;
			counter = counter + 1;
		}
		String answer = null;
		System.out.println(counter);
		
		for(;;) {
			userTruck.displayMenu(); // calls display menu method in the Foodtruck class
			answer = input.next(); // declaring and initializing String answer as the answer to menu prompt
			switch (answer) { // switch to tell program what the user wanted to do
			case "a":
				for (int i = 0; i < counter; i++) {
					System.out.println(fleet[i]);
				}continue;
				
			case "b": // option that finds the average of all the ratings in the class and displays
				double average = 0; // the average
				int sum = 0;
				for (int i = 0; i < counter; i++) {
					sum = sum + fleet[i].getRating();
				}
				average = sum / fleet.length;
				System.out.println("Average Foodtruck Rating: " + average);
				continue;
				
			case "c":
				int arrayNum = 0;
				int max = 0;
				int i = 0;
				for (i = 0; i < counter; i++) {
					if (fleet[i].getRating() > max) {
						max = fleet[i].getRating();
						max = fleet[arrayNum].getRating();
					}
				}
				System.out.println("Highest FoodTruck Rating is: " + fleet[arrayNum].toString());
				continue;
				
			case "d":
				System.out.println("Goodbye"); // quit program
		}break;
//		input.close(); // closes the scanner
		}
	}
}
