/** PROGRAM ASSIGNMENT 8     House.java
 *
 * Author:         Sanjiv Shah
 * Class:          Java, Monday and Wednesday 09:30am
 * Due Date:       Oct 19, 2015
 *
 * Program Description:
 *    Chap. 8: OOP
 * 1. Define 2 private data members,
 * 2. Define 2 public constructors,  
 * 3. for every data member, provide a public getter and a public setter
 * 		(2 getters and 2 setters)
 * 4. provide public method named calcPrpertyTax,
 * 		it requires one formal parameter TaxPercentage  
 */ 
public class House {
	/** private data members */
	private double totalPrice = 123456;
	private double totalSquareFeet = 1234;
	
	/** Default constructor */
	public House()
	{
		
	}
	
	/** constructors with parameters */
	public House(double newTotalPrice, double newTotalSquareFeet)
	{
		totalPrice = newTotalPrice;
		totalSquareFeet = newTotalSquareFeet;
	}

	/** getters for all private data members */
	public double getTotalPrice()
	{
		return totalPrice;
	}
	public double getTotalSquareFeet()
	{
		return totalSquareFeet;
	}

	/** setters for all private data members */
	public void setTotalPrice(double newTotalPrice)
	{
		totalPrice = newTotalPrice;
	}

	public void setTotalSquareFeet(double newTotalSquareFeet)
	{
		totalSquareFeet = newTotalSquareFeet;
	}

	/** effectors */
	public double calcPropertyTax(double taxPercentage)
	{
		double result = totalPrice * taxPercentage * 0.01;
		return result;
	}
	public double calcPricePerSqf()
	{
		double result2 = totalPrice / totalSquareFeet;
		return result2;
	}
}
