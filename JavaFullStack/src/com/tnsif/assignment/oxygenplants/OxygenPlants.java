package com.tnsif.assignment.oxygenplants;

import java.util.Scanner;

public class OxygenPlants {

private double length;
private double breadth;
private double plantArea;

public OxygenPlants(double length, double breadth, double plantArea) {
	super();
	this.length = length;
	this.breadth = breadth;
	this.plantArea = plantArea;
}

public int getTotalPlants() 
{
 plantArea = plantArea / (100 * 100);
 double floorArea = length * breadth;
 int totalPlants = (int) (floorArea / plantArea);
 totalPlants = (totalPlants / 10) * 10;
 return totalPlants;
}

public double getTotalOxygen()
{
 double oxygenPerPlant = 0.9;
 int totalPlants = getTotalPlants();
 double totalOxygen = totalPlants * oxygenPerPlant;
 return totalOxygen;
}

public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the length of the room(in m)");
 double length = sc.nextDouble();
 if (length <= 0) {
   System.out.println("Invalid length");
   return;
 }
 System.out.println("Enter the breadth of the room(in m)");
 double breadth = sc.nextDouble();
 if (breadth <= 0) {
   System.out.println("Invalid breadth");
   return;
 }
 System.out.println("Enter the plant area of a single plant(in cm2)");
 double plantArea = sc.nextDouble();
 if (plantArea <= 0) {
   System.out.println("Invalid plant area");
   return;
 }
 OxygenPlants op = new OxygenPlants(length, breadth, plantArea);

 int totalPlants = op.getTotalPlants();
 System.out.println("The total number of plants in the room is: " + totalPlants);

 double totalOxygen = op.getTotalOxygen();
 System.out.printf("The total production of oxygen per day is: %.2f liters\n", totalOxygen);

 sc.close();
}
}
