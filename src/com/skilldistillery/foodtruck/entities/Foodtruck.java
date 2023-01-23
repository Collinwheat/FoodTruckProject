package com.skilldistillery.foodtruck.entities;

//import com.skilldistillery.encapsulation.labs.Car;

public class Foodtruck { // creating the class Foodtruck
	private String name; // declaring the name field
	private String foodType; // declaring the food type field
	private Foodtruck fleet[]; // declaring but not initializing the fleet array
	private int rating; // declaring the rating variable
	private static int nextTruckId = 1;
	private int id;

	public Foodtruck() {
		fleet = new Foodtruck[5];
		id = nextTruckId++;
	}

	public String getName() { // get name method for returning the name
		return name;
	}

	public void setName(String name) { // set name method for setting the name
		this.name = name;
	}

	public String getFoodType() { // get foodtype method for returning the food type
		return foodType;
	}

	public void setFoodType(String foodType) { // set foodtype method for setting food type
		this.foodType = foodType;
	}

	public int getRating() { // get rating method for returning the rating
		return rating;
	}

	public void setRating(int rating) { // set rating method for setting the rating
		this.rating = rating;
	}

	public void displayMenu() { // display menu method for printing the menu
		System.out.println("|-------------------------------------|");
		System.out.println("|        A.List all Food Trucks       |");
		System.out.println("|    B.See Average Food Truck Rating  |");
		System.out.println("| C. Display Highest Rated Food Truck |");
		System.out.println("|              D. Quit                |");
		System.out.println("|-------------------------------------|");
	}

	public String toString() { //
		String output = "Name: " + name + " Type: " + foodType + " Rating: " + rating + " ID: " + id;
		return output;
	}

	public Foodtruck(String name, String type, int rating) { //
		this.rating = rating;
		this.name = name;
		this.foodType = type;
	}
}
