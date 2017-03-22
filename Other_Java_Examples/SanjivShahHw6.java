/** PROGRAM ASSIGNMENT 5     SanjivShahHw6.java
 *
 * Author:         Sanjiv Shah
 * Class:          Java, Monday and Wednesday 09:30am
 * Due Date:       Oct 4, 2015
 *
 * Program Description:
 *    Chap. 5: Arrays
 * 1. Print my name,
 * 2. Create a single-dimension array of size 10 using random numbers between 0 
 *   	(included) and 100 (not included), 
 * 3. Create a method named printArray to print the array (use printf method to
 *   	print only 2 decimal points),
 * 4. Create a method named sort and sort the array in descending order,
 * 5. Print the sorted array.  
 */ 
public class SanjivShahHw6 
{

	public static void main(String[] args) 
	{
		// Print name
		System.out.println("Sanjiv Shah, homework 6, M/W 9:30 am, Fall 2015");
		
		// Create a new array randomNumbers
		double[] randomNumbers = new double[10];

		// Populate the array
		for (int i = 0; i < 10; i++)
		{
			double number = Math.random() * (100);
			randomNumbers[i] = number;
		}
		printArray(randomNumbers);
		sort(randomNumbers);
		printArray(randomNumbers);
	}

	//Create method printArray
	public static void printArray(double a[])
	{
		for (int n1 = 0; n1 < 10; n1++)
		{
			Object arr[] = new Object[1];
			arr[0] = new Double(a[n1]);
			System.out.printf("%5.2f ", arr);	
		}
		System.out.println();
	}
	
	// Use Bubble sort to sort the double arrays
	public static void sort(double a[])
	{
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 9-i; j++)
			{
				if( a[j] < a[j+1] )
				{
					double temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}

}
