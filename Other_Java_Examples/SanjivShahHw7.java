/** PROGRAM ASSIGNMENT 7     SanjivShahHw7.java
 *
 * Author:         Sanjiv Shah
 * Class:          Java, Monday and Wednesday 09:30am
 * Due Date:       Oct 12, 2015
 *
 * Program Description:
 *    Chap. 7: Multidimenstional Arrays
 * 1. Print my name,
 * 2. Create a two-dimensional array,
 * 3. Set first dimension to be 3.  The first dimension is for 3 classes offered,
 * 4. Use the Sanner classs to input number of student in all 3 classes 
 * 		(one at a time),
 * 5. Use these three variables and use the keyword new to define the second
 * 		 dimension for the 2-d array.
 * 6. Invoke method getInput and pass the 2-d array as the only formal
 * 		parameter. (void method)
 * 7. Use embedded loop in getInput to ask for pnput for each student's credit 
 * 		hours in these three classes using Scanner class,
 * 8. invoke calcTotal and pass the 2-d array as the only formal parameter,
 * 9. calcTotal should return the sum of all credits in these 3 classes,
 * 10. Use an embedded loop inside calcTotal to calculate the total credit 
 * 		hours for all students in these 3 classes,
 * 11. I the main method, use a local variable to receive the return value,
 * 12. Output the total sum to the console.  	 
 */ 
import java.util.Scanner;

public class SanjivShahHw7 
{

	public static void main(String[] args) 
	{
		// Print name
		System.out.println("Sanjiv Shah, homework 6, M/W 9:30 am, Fall 2015");

		//Create a Scanner
		Scanner input = new Scanner(System.in);

		//Declare a 2-d array with first dimension as 3
		int[][] m = new int [3][];
		// define the 2nd dimension of the 1st element
		System.out.print("please enter number of students in course 1:");
		int classSize1 = input.nextInt();
		m[0] = new int[classSize1];

		// define the 2nd dimension of the 1st element
		System.out.print("please enter number of students in course 2:");
		int classSize2 = input.nextInt();
		m[1] = new int[classSize2];

		// define the 2nd dimension of the 1st element
		System.out.print("please enter number of students in course 3:");
		int classSize3 = input.nextInt();
		m[2] = new int[classSize3];
		
		//call getInput
		getInput(m);

		//Print Total no. of credit hours
		int totalCreditHours = calcTotal(m);
		System.out.printf("Total no. of credit hours for 3 classes is: %d "
				, totalCreditHours);
	}
	// define and execute method getInput
	public static void getInput(int [][] m)
	{
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m[i].length; j++)
			{
				System.out.print("Enter number of credit hours for course "
						+(i+1) + " student " + (j+1) +" for this class: ");
				int creditHours = input.nextInt();
				m[i][j] = creditHours;
				
			}
		}
		input.close();
	}
	// define and execute method calcTotal
	public static int calcTotal(int [][] m)
	{
		int total = 0;
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++)
			{
				total += m[i][j];
			}
		return total;
	}
}
