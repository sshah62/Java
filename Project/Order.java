import java.text.DecimalFormat;
import java.util.*;
public class Order {

	private ArrayList<String>	items;
	private ArrayList<Double>	price;
	private String				custName;
	private String				address;
	private String				phone;
	private boolean				delivery;
	private String 				misc; // special instructions

	//Setters
	public void setName(String name)
	{
		custName = name;
	}

	public void setDelivery(boolean del)
	{
		delivery = del;
	}

	public void setMisc(String mis)
	{
		misc = mis;
	}

	public void setPhone(String phn)
	{
		phone = phn;
	}

	public void setAddress(String addr)
	{
		address = addr;
	}

	//Getters
	public String getName()
	{
		return custName;
	}

	public String getAddress()
	{
		return address;
	}

	public String getPhone()
	{
		return phone;
	}

	public boolean getDelivery()
	{
		return delivery;
	}

	public String getMisc()
	{
		return misc;
	}

	public double getSubTotal()
	{
		double subtotal = 0;
		DecimalFormat df = new DecimalFormat("##.##");

		for(int i = 0; i < items.size(); i++)
		{
			subtotal += price.get(i);
		}
		if(delivery)
			subtotal += 4;
		return Double.parseDouble((df.format(subtotal)));
	}

	public double getTax()
	{
		DecimalFormat df = new DecimalFormat("##.##");
		double tax = ((int)((getSubTotal()*0.075)*100))/100.0;
		return Double.parseDouble((df.format(tax)));
	}

	public double getTotal()
	{
		DecimalFormat df = new DecimalFormat("##.##");
		double total = getSubTotal()+getTax();
		return Double.parseDouble((df.format(total)));
	}

	public String getSummary()
	{
		String summary="Order Summary \n------------------------\n";

		for(int i = 0; i < items.size(); i++)
		{
			summary = summary+items.get(i)+" - "+ price.get(i)+" \n";
		}

		summary += "Customer Name: "+custName+"\n" ;
		summary += "Address:" + address +"\n";
		summary += "Phone:"+phone+"\nDelivery:"+delivery+"\n";
		summary += "Instructions: "+misc+"\n";
		summary += "Taxes: "+getTax()+"\n------------------------\n";
		summary += "Total:"+getTotal();
		return summary;
	}
	
	//Methods
	//Create a new order object
	public Order() 
	{
		items		= new ArrayList<String>();
		price		= new ArrayList<Double>();
		delivery	= false;
	}

	//Method to add an item
	public boolean addItem(String name, double p)
	{
		for(int i = 0; i < items.size(); i++)
		{
			String item = (String)items.get(i);
			if(item.equals(name))
				return false;
		}
		items.add(name);
		price.add(p);
		return true;

	}
	//Remove items from the order using ArrayList.remove() Method
	public void removeItem(String name)
	{
		for(int i = 0; i < items.size(); i++)
		{
			String item = (String)items.get(i);
			if(item.equals(name))
			{
				items.remove(i);
				price.remove(i);
				return;
			}
		}
	}

	//Method to remove Taco Dinner from the order
	public void removeTacos()
	{
		for(int i = 0; i < items.size(); i++)
		{
			String item = (String)items.get(i);
			String t[] = item.split(" ");
			if(t[0].matches("Taco"))
			{
				items.remove(i);
				price.remove(i);
				return;
			}
		}
	}

	//Method to clear an order
	public void clearOrder()
	{
		items		= new ArrayList<String>();
		price		= new ArrayList<Double>();
		misc 		= "";
		phone 		= "";
		address		= "";
		custName 	= "";
	}

}
