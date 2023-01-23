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
			userTruck = new Foodtruck(); 		 // and stores it in the array
			System.out.println("Please enter name");
			userTruck.setName(input.next());
			if (userTruck.getName().equals("quit")) { //provisional if statement so user can stop inputting before 5
				break;
			}
			System.out.println("Please enter food Type");
			userTruck.setFoodType(input.next());
			System.out.println("Please enter Rating 1-5");
			userTruck.setRating(input.nextInt());
			fleet[i] = userTruck;
			counter = counter + 1; //adds one to counter
		}
//		String answer = null;

		for (;;) {
			userTruck.displayMenu(); // calls display menu method in the Foodtruck class
			String answer = input.next(); // declaring and initializing String answer as the answer to menu prompt
			switch (answer) { // switch to tell program what the user wanted to do
			case "a":
				for (int i = 0; i < counter; i++) { // for loop that prints out all of the Food Trucks
					System.out.println(fleet[i]);
				}
				continue;

			case "b": // option that finds the average of all the ratings in the class and displays
				double average = 0; // the average
				int sum = 0;
				for (int i = 0; i < counter; i++) { // for loop that finds the sum
					sum = sum + fleet[i].getRating();
				}
				average = sum / counter; // divides it by how many foodtrucks were created
				System.out.println("Average Foodtruck Rating: " + average);
				continue;

			case "c":
				int arrayNum = 0;// initializing variable to be used
				int max = 0;//same
				for (int i = 0; i < counter; i++) {//for loop to go through all the objects in fleet
					if (fleet[i].getRating() > max) {//finding the highes rated food truck
						max = fleet[i].getRating();//setting max to that rating for use in the loop
						arrayNum = i;//identifying that that particular entry of the array is greatest
					}
				}
				System.out.println("Highest FoodTruck Rating is: " + fleet[arrayNum].toString());//printing highest rated foodtruck
				continue;

			case "d":
				System.out.println("Goodbye"); // quit program
			}
			break;
		}
		input.close(); // closes the scanner
	}
}
