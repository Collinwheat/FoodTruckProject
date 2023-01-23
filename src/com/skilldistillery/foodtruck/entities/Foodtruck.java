package com.skilldistillery.foodtruck.entities;

//import com.skilldistillery.encapsulation.labs.Car;

public class Foodtruck { // creating the class Foodtruck
	private String name; // declaring the name field
	private String foodType; // declaring the food type field
	private int rating; // declaring the rating variable
	private static Foodtruck fleet[]; // declaring but not initializing the fleet array
	private static int id;
	
 
	public Foodtruck() {
		fleet = new Foodtruck[5];
//		for (int i = 0; i <= fleet.length; i++) {
//			this.id = i;
//		}
//		--setup basic for loop (for i go through fleet) and pass in setid method
		
	}

	private int getId() { // get id method for returning the id
		return id;
	}

	public void setId(int id) { // set id method for setting the id
		this.id = id;
//		for (int i = 0; i < fleet.length; i++) {
//			id = i;
//		}
		
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

//	public void displayFleet() { // display fleet method for printing the fleet contents
//		for (int i = 0; i <= 5; i++) {
//			if (fleet[i] == null) {
//				System.out.println(" ");
//			}else {
//				System.out.println(fleet[i]);
//			}
//		}
//	}

	public Foodtruck[] getTrucks() { //
		return fleet;
	}

	public Foodtruck(String name, String type, int rating, int id) { //
		this.rating = rating;
		this.name = name;
		this.foodType = type;
//		this.id = 0;
		for (int i = 0; i <= fleet.length; i++) {
			this.id = i++;
			
			continue;
		}
	}
//	public int highestRated() {
//		int max = 0;
//		for (int i = 0; i < fleet.length; i++) {
//			if (fleet[i].getRating() > max) {
//				max = fleet[i].getRating();
//			}
//			
//		}
//		return max;
//	}

}
