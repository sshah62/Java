/** PROGRAM ASSIGNMENT 8     SanjivShahHw8.java
 *
 * Author:         Sanjiv Shah
 * Class:          Java, Monday and Wednesday 09:30am
 * Due Date:       Oct 19, 2015
 *
 * Program Description:
 *    Chap. 8: OOP
 * 1. Create 2 House objects with given data using constructors,
 * 2. Create the third House object with defalult constructor and ask user to 
 * 		input the 2 parameters with a Scanner type variable,  
 * 3. Use the setters to set the user input values to into the third object,
 * 4. Ask user to input a tax percentage,
 * 5. for each House object, invoke 2 methods:
 * 		calcPricePerSqf() and calcPropertyTax(),
 * 6. For each house, Output its total square feet, total price, average price
 * 		per square foot, and the property tax using System.out.printf() method
 */ 
import java.util.Scanner;
public class SanjivShahHw8 {

	public static void main(String[] args) {
		// Print Name
		System.out.println("Sanjiv Shah, homework 8, M/W 9:30 am, Fall 2015");

		//Create 2 House objects with given data using constructors
		House house1 = new House(295000, 3395);
		House house2 = new House(189000, 1675);

		//Create 3rd House object using user inputs
		// 		Create a Scanner
		Scanner input = new Scanner(System.in);

		// 		Prompt the user to enter Total Price of the House
		System.out.print("Enter Price for the House: ");
		double price3 = input.nextDouble();

		// 		Prompt the user to enter Total Square Footage of the House
		System.out.print("Enter Total Square Footage for the House: ");
		double area3 = input.nextDouble();

		//		Use constructor to create new House object
		House house3 = new House();
		
		//		Use setters to set input values into new House object
		house3.setTotalPrice(price3);
        house3.setTotalSquareFeet(area3);

		//Get tax percentage from the user
		System.out.print("Enter Tax percentage: ");
		double taxPercentage = input.nextDouble();
		input.close();

		//Use getters to generate output	
		System.out.printf("\nHouse 1: Total Area - %6.1f, Total Price - $%9.2f, "
				+ "Avg. Price per square \nfoot - $%6.2f and Property Tax is -"
				+ " $%7.2f\n\n",house1.getTotalSquareFeet(),house1.getTotalPrice
				(),house1.calcPricePerSqf(), house1.calcPropertyTax
				(taxPercentage));
		
		System.out.printf("House 2: Total Area - %6.1f, Total Price - $%9.2f, "
				+ "Avg. Price per square \nfoot - $%6.2f and Property Tax is -"
				+ " $%7.2f\n\n",house2.getTotalSquareFeet(),house2.getTotalPrice
				(),house2.calcPricePerSqf(), house2.calcPropertyTax
				(taxPercentage));
		System.out.printf("House 3: Total Area - %6.1f, Total Price - $%9.2f, "
				+ "Avg. Price per square \nfoot - $%6.2f and Property Tax is -"
				+ " $%7.2f",house3.getTotalSquareFeet(),house3.getTotalPrice
				(),house3.calcPricePerSqf(), house3.calcPropertyTax
				(taxPercentage));
	}

}
