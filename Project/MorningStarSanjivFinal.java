import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.util.*;



public class MorningStarSanjivFinal extends JApplet implements ActionListener, ListSelectionListener, DocumentListener
{
	//Order Class order.java
	Order order = new Order();
	
	//Define Class Variables
	
	//Text Fields
	JTextField tfSubtotal;
	JTextField tfDeliveryCharge;
	JTextField tfTotal;
	JTextField tfTaxes;
	JTextField tfName;
	JTextField tfAddress;
	JTextField tfPhone;
	
	//Text Areas
	JTextArea jtaOrderSummary;
	JTextArea jtaSpecialInstr;
	
	//Radio Button Groups
	ButtonGroup bgTaco2;
	ButtonGroup bgTaco1;
	
	//Radio Buttons
	JRadioButton rbT2Steak;
	JRadioButton rbT2Chicken;
	JRadioButton rbT2Fish;
	JRadioButton rbT1Steak;
	JRadioButton rbT1Chicken;
	JRadioButton rbT1Fish;
	
	//Check Boxes
	JCheckBox jchChickenE;
	JCheckBox jchBeefE;
	JCheckBox jchShrimpE;
	JCheckBox jchGrandeB;
	JCheckBox jchDurangoB;
	JCheckBox jchBeanB;
	
	//Combo Boxes
	JComboBox jcbDelivery;
	
	//List Boxes
	JList jlstFajitas;
	
	//Buttons
	JButton jbOrder;
	JButton jbReset;

	
	public MorningStarSanjivFinal() 
	{
	/********************************* Layout ********************************/
	/* Layout hieirarchy - 
	 * jpBase - Border Layout - North, Center, South
	 *   jpNorth (jpHeader<jpNorth<jpBase) - Flow Layout
	 *   jpCenter (jpCenter<jpBase) - Border Layout - Center, East
	 * 	    jpEntrees (jpEntrees<jpCenter<jpBase) - Grid Layout 2 X 2
	 * 		  Row 1, Col 1 - jpEnchiladas - Grid Layout
	 * 			Row 1 - lblEnchiladaTitle
	 * 			Row 2 - jchBeefE, jchChickenE, jchShrimpE
	 * 		  Row 1, Col 2 - jpBurritos - Grid Layout
	 * 			Row 1 - lblBurritosTitle
	 * 			Row 2 - jchBeanB, jchDurangoB, jchGrandeB
	 * 		  Row 2, Col 1 - jpTacos - Grid Layout
	 * 			Row 1 - lblTaco1
	 * 			Row 2 - rbT1Chicken, rbT1Fish, rbT1Steak
	 * 			Row 3 - rbT2Chicken, rbT2Fish, rbT2Steak
	 * 		  Row 2, Col 2 - jpFajitas - Grid Layout
	 * 			Row 1 - lblFajitasTitle
	 * 			Row 2 - jlstFajitas
	 * 	    jpOrderSummary (jpOrderSummary<jpCenter>jpBase) Grid Layout
	 * 			Row 1 - jtaOrderSummary
	 *   jpSouth (jpSouth<jpBase) - Grid Layout 4x1
	 * 		Row 1 - jpCustomer - Grid Layout
	 * 			Row 1 - Customer Information Text Fields - Grid Layout
	 * 				Row 1 - tfName
	 * 				Row 2 - tfAddress
	 * 				Row 3 - tfPhone
	 * 			Row 2 - jcbDelivery - Grid Layout
	 * 		Row 2 - jpInstructions - Grid Layout
	 * 		Row 3 - jpTotals - Grid Layout 4x1
	 * 			Row 1 - tfSubTotal
	 * 			Row 2 - tfTaxes
	 * 			Row 3 - tfDeliveryCharge
	 * 			Row 4 - tfTotal
	 * 		Row 4 - jpOrderButtons - Grid Layout 2x1
	 * 			Row 1 - jbOrder
	 * 			Row 2 - jbReset
	 *
	 * ***********************************************************************/
		
		//Base Layout (Border Layout)
		JPanel jpBase = new JPanel(new BorderLayout(1, 1));
		Border lineBorder = new LineBorder(Color.BLACK, 2);
		//Set Border - Line Border (Base Layout)
		jpBase.setBorder(lineBorder);

		// Add Base Panels to the applet
		jpBase.add(new JPanel(), BorderLayout.SOUTH);
		jpBase.add(new JPanel(), BorderLayout.NORTH);
		jpBase.add(new JPanel(), BorderLayout.CENTER);
		add(jpBase);


		/******** North ********/
		//jpNorth < jpBase
		
		
		/**** Header ****/
		//jpHeader < jpNorth < jpBase 
		//Flow layout
		JPanel jpHeader = new JPanel(new FlowLayout());
		//import image 
		//Free for all use 
		//https://pixabay.com/en/cactus-sombrero-mexican-green-hat-157994/
		ImageIcon cactus = new ImageIcon(this.getClass().getResource
				("resources/cactus.png"));
		//Title - jpHeader < jpNorth < jpBase
		JLabel lblTitle = new JLabel("MorningStar and Sanjiv's Cantina", 
				cactus, JLabel.CENTER);
		//Change font face, size, and color
		lblTitle.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblTitle.setForeground(new Color(188, 0, 0));
		//Change background color to white
		jpHeader.setBackground(Color.WHITE);
		//add lblTitle to jpHeader
		jpHeader.add(lblTitle);
		//add jpHeader<jpNorth<jpBase
		jpBase.add(jpHeader, BorderLayout.NORTH);

		/******** Center Panel ********/
		//jpCenter < jpBase
		//Border Layout - Center, East
		JPanel jpCenter = new JPanel(new BorderLayout(1, 1));
		jpCenter.setBackground(Color.WHITE);
		//add center, east to jpCenter < jpBase
		jpCenter.add(new JPanel(), BorderLayout.EAST);
		jpCenter.add(new JPanel(), BorderLayout.CENTER);
		//add jpCenter < jpBase
		jpBase.add(jpCenter);
		//jpEntrees < jpCenter < jpBase
		//Grid Layout 2x2
		JPanel jpEntrees = new JPanel(new GridLayout(2, 2));
		//add jpEntrees < jpCenter < jpBase
		jpCenter.add(jpEntrees, BorderLayout.CENTER);
		
		
		/**** Enchiladas ****/
		//jpEnchilads < jpEntrees < jpCenter < jpBase
		//Grid Layout 4x1
		JPanel jpEnchiladas = new JPanel(new GridLayout(4, 1, 0, 0));
		//Title Enchilada Dinners
		JLabel lblEnchiladaTitle = new JLabel("Enchilada Dinners");
		//set enchilada title font
		lblEnchiladaTitle.setFont(new Font("SansSerif", Font.BOLD, 20));
		//add label to jpEnchiladas
		jpEnchiladas.add(lblEnchiladaTitle);
		
		//Enchilada dinner Checkboxes
		jchChickenE = new JCheckBox("Chicken $9.95");	
		jpEnchiladas.add(jchChickenE);
		jchBeefE = new JCheckBox("Beef $9.95");
		jpEnchiladas.add(jchBeefE);
		jchShrimpE = new JCheckBox("Shrimp $11.95");
		jpEnchiladas.add(jchShrimpE);

		//add jpEnchiladas < jpEntrees < jpCenter < jpBase
		jpEntrees.add(jpEnchiladas);
		
		/**** Burritos ****/
		//jpBurritos < jpEntrees < jpCenter<jpBase
		//Grid Layout 4x1
		JPanel jpBurritos = new JPanel(new GridLayout(4, 1, 0, 0));

		//Title for Burrito Dinners 
		JLabel lblBurritosTitle = new JLabel("Burrito Dinners");
		//set Burrito title font
		lblBurritosTitle.setFont(new Font("SansSerif", Font.BOLD, 20));
		//add label to jpBurritos
		jpBurritos.add(lblBurritosTitle);
		
		//Burrito Dinner checkboxes
		jchGrandeB = new JCheckBox("Grande $10.95");	
		jpBurritos.add(jchGrandeB);
		jchDurangoB = new JCheckBox("Durango $9.95");
		jpBurritos.add(jchDurangoB);
		jchBeanB = new JCheckBox("Bean & Cheese $8.95");
		jpBurritos.add(jchBeanB);

		//add jpBurritos < jpEntrees < jpCenter < jpBase
		jpEntrees.add(jpBurritos);
		
		
		/**** Tacos ****/
		//jpTacoLayout < jpEntrees < jpCenter < jpBase
		//Grid Layout 2x1
		JPanel jpTacoLayout = new JPanel(new GridLayout(2, 1, 0, 0));

		//Title for Taco Dinners
		JLabel lblTacosTitle = new JLabel("Taco Dinners $9.95");
		lblTacosTitle.setFont(new Font("SansSerif", Font.BOLD, 20));
		//add label for Tacos to jpTacoLayout
		jpTacoLayout.add(lblTacosTitle);

		//add grid 2x4 <jpTacos<jpTacoLayout<jpEntrees<jpCenter<jpBase
		JPanel jpTacos = new JPanel(new GridLayout(2, 4, 0, 0));
		//Taco1
		//Title for Taco1
		JLabel lblTaco1 = new JLabel("Pick 1:");
		jpTacos.add(lblTaco1);
		//Taco1 Radio Buttons group
		rbT1Steak = new JRadioButton("Steak");
		rbT1Chicken = new JRadioButton("Chicken");
		rbT1Fish = new JRadioButton("Fish");
		//add radio button group for taco1
		bgTaco1 = new ButtonGroup();
		bgTaco1.add(rbT1Steak);
		bgTaco1.add(rbT1Chicken);
		bgTaco1.add(rbT1Fish);
		//add radio buttons for Taco1 to jpTacos
		jpTacos.add(rbT1Steak);
		jpTacos.add(rbT1Chicken);
		jpTacos.add(rbT1Fish);

		//Taco 2
		//Title for Taco2
		JLabel lblTaco2 = new JLabel("Pick 1:");
		//add label for Taco 2
		jpTacos.add(lblTaco2);
		//Taco2 Radio Buttons group
		rbT2Steak = new JRadioButton("Steak");
		rbT2Chicken = new JRadioButton("Chicken");
		rbT2Fish = new JRadioButton("Fish");
		//add radio button group for taco2
		bgTaco2 = new ButtonGroup();
		bgTaco2.add(rbT2Steak);
		bgTaco2.add(rbT2Chicken);
		bgTaco2.add(rbT2Fish);
		//add radio buttons for Taco2 to jpTacos
		jpTacos.add(rbT2Steak);
		jpTacos.add(rbT2Chicken);
		jpTacos.add(rbT2Fish);
		//add jpTacos < jpTacoLayout < jpEntrees < jpCenter < jpBase
		jpTacoLayout.add(jpTacos);
		//Add jpTacoLayout < jpEntrees < jpCenter < jpBase
		jpEntrees.add(jpTacoLayout);

		/**** Fajitas ****/
		//jpFajitaLayout < jpEntrees < jpCenter < jpBase
		//Grid Layout 2x1
		JPanel jpFajitaLayout = new JPanel(new GridLayout(2, 1, 0, 0));
		//Title for Fajita Dinners
		JLabel lblFajitasTitle = new JLabel("Fajita Dinners");
		lblFajitasTitle.setFont(new Font("SansSerif", Font.BOLD, 20));
		jpFajitaLayout.add(lblFajitasTitle);

		//jpFajitas < jpFajitaLayout < jpEntrees < jpCenter < jpBase 
		//Grid Layout 1x2
		JPanel jpFajitas = new JPanel(new GridLayout(1, 2, 0, 0));
		//Create Array for Fajita JList
		String[] fajitasArray = {"Steak $11.95", "Chicken $10.95", 
				"Shrimp $12.95", "Combination $15.95"};
		jlstFajitas = new JList(fajitasArray);
		//Add jlstFajitas to jpFajitas Panel
		jpFajitas.add(jlstFajitas);
		
		//add jpFajitas < jpFajitaLayout < jpEntrees < jpCenter < jpBase
		jpFajitaLayout.add(jpFajitas);
		//add jpFajitaLayout < jpEntrees < jpCenter < jpBase
		jpEntrees.add(jpFajitaLayout);

		
		/**** Order Summary ****/
		//jpOrderSummary < jpEntrees < jpCenter < jpBase
		//Grid Layout 1x0
		JPanel jpOrderSummary = new JPanel(new GridLayout(1,0));
		//Set size of order summary text area
		jpOrderSummary.setPreferredSize(new Dimension(227, 450 ));
		//Add Border to order summary text area
		jpOrderSummary.setBorder(lineBorder);
		//Text area for order summary
		jtaOrderSummary = new JTextArea("Order Details", 5, 50);
		//set editable to false
		jtaOrderSummary.setEditable(false);
		//set linewrap to true
		jtaOrderSummary.setLineWrap(true);
		//add jtaOrderSummary to jpOrderSummary
		jpOrderSummary.add(jtaOrderSummary);
		//add scroll pane set horizontal and vertical bars
		//to only show when needed
		JScrollPane jspOrderSummary = new JScrollPane(jtaOrderSummary, 
			JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//add jspOrderSummary to jpOrderSummary
		jpOrderSummary.add(jspOrderSummary);
		
		//add jpOrderSummary to jpCenter (East)
		jpCenter.add(jpOrderSummary, BorderLayout.EAST);

		/******** South - Customer Information **** 
		 * Totals, Special Instructions    *******/
		
		//jpSouth < jpBase
		//Grid Layout 1x4
		JPanel jpSouth = new JPanel(new GridLayout(1, 4));
		jpSouth.setBackground(Color.WHITE);
		//add jpSouth to jpBase (South)
		jpBase.add(jpSouth, BorderLayout.SOUTH);

		/**** Customer Information ****/
		//jpCustomer<jpSouth<jpBase
		//Grid Layout 4x2
		//Customer Information
		JPanel jpCustomer = new JPanel(new GridLayout(4, 2, 0, 0));
		jpCustomer.setPreferredSize(new Dimension(225, 150));
		//Name
		jpCustomer.add(new JLabel("Name"));
		tfName = new JTextField(20);
		jpCustomer.add(tfName);
		//Address
		jpCustomer.add(new JLabel("Address"));
		tfAddress = new JTextField(20);
		jpCustomer.add(tfAddress);
		//Phone
		jpCustomer.add(new JLabel("Phone"));
		tfPhone = new JTextField(20);
		jpCustomer.add(tfPhone);

		/**** Delivery/Carryout ****/
		//Title for delivery/carryout
		JLabel lblDeliveryTitle = new JLabel("Delivery/Carryout");
		//add title
		jpCustomer.add(lblDeliveryTitle);
		String[] deliveryArray = {"Carryout","Delivery"};
		jcbDelivery = new JComboBox(deliveryArray);
		//add jcbDelivery
		jpCustomer.add(jcbDelivery);
		//add jpCustomer to jpSouth
		jpSouth.add(jpCustomer);

		/**** Special Instructions ****/
		//jpInstructions < jpSouth < jpBase
		//Grid Layout 1x1
		//Special Instruction Text Area
		JPanel jpInstructions = new JPanel(new GridLayout(1, 1, 0, 0));
		jtaSpecialInstr = new JTextArea("Special Instructions:", 5, 15);
		//set word wrap to true
		jtaSpecialInstr.setLineWrap(true);
		//wrap at end of word instead of middle
		jtaSpecialInstr.setWrapStyleWord(true);
		jpInstructions.add(jtaSpecialInstr);
		//add scroll pane set horizontal and vertical bars
		//to only show when needed
		JScrollPane jspSpecialInstr = new JScrollPane(jtaSpecialInstr, 
			JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//add jspSpecialInstr to jpInstructions
		jpInstructions.add(jspSpecialInstr);
		//add jpInstructions to jpSouth
		jpSouth.add(jpInstructions);

		/**** Totals ****/
		//jpTotals < jpSouth < jpBase
		//Grid Layout 4x2
		JPanel jpTotals = new JPanel(new GridLayout(4, 2, 0, 0));
		jpTotals.setPreferredSize(new Dimension(225, 150));
		//Totals textboxes
		//SubTotal
		jpTotals.add(new JLabel("Subtotal"));
		tfSubtotal = new JTextField(10);
		jpTotals.add(tfSubtotal);
		//make Subtotal text field not editable
		tfSubtotal.setEditable(false);
		tfSubtotal.setBackground(Color.WHITE);
		//Taxes
		jpTotals.add(new JLabel("Taxes"));
		tfTaxes = new JTextField(10);
		jpTotals.add(tfTaxes);
		//make Taxes text field not editable
		tfTaxes.setEditable(false);
		tfTaxes.setBackground(Color.WHITE);
		//Delivery Charge
		jpTotals.add(new JLabel("Delivery"));
		tfDeliveryCharge = new JTextField(10);
		jpTotals.add(tfDeliveryCharge);
		//make Delivery Charge text field not editable
		tfDeliveryCharge.setEditable(false);
		tfDeliveryCharge.setBackground(Color.WHITE);
		//Total
		jpTotals.add(new JLabel("Total"));
		tfTotal = new JTextField(10);
		jpTotals.add(tfTotal);
		//make Total text field not editable 
		tfTotal.setEditable(false);
		tfTotal.setBackground(Color.WHITE);
		//add jpTotals to jpSouth
		jpSouth.add(jpTotals);

		//jpOrderButtons < jpSouth < jpBase
		//Grid Layout 2x1
		//Order Button, Reset Button
		JPanel jpOrderButtons = new JPanel(new GridLayout(2, 1, 0, 0));
		//Order Button
		jbOrder = new JButton("Order");
		jpOrderButtons.add(jbOrder);
		//Reset Button
		jbReset = new JButton("Reset");
		jpOrderButtons.add(jbReset);
		//add jpOrderButtons to jpSouth
		jpSouth.add(jpOrderButtons);

		/*********** END Layout **************/

		/*********** Action Event Listeners **************/
		
		//Enchilada Dinner Checkbox Listeners
		jchChickenE.addActionListener(this);
		jchBeefE.addActionListener(this);
		jchShrimpE.addActionListener(this);
		
		//Burrito Dinner Checkbox Listeners
		jchGrandeB.addActionListener(this);
		jchDurangoB.addActionListener(this);
		jchBeanB.addActionListener(this);
		
		//Tacos Radio Button Listeners
		rbT1Steak.addActionListener(this);
		rbT1Chicken.addActionListener(this);
		rbT1Fish.addActionListener(this);
		rbT2Steak.addActionListener(this);
		rbT2Chicken.addActionListener(this);
		rbT2Fish.addActionListener(this);
		
		//Customer Information Text Field Listeners
		tfName.addActionListener(this);
		tfAddress.addActionListener(this);
		tfPhone.addActionListener(this);
		
		//Special Instruction Text Area Listener
		jtaSpecialInstr.getDocument().addDocumentListener(this);
		
		//Button Listeners
		jbOrder.addActionListener(this);
		jbReset.addActionListener(this);
		
		//Delivery ComboBox Listener
		jcbDelivery.addActionListener(this);
		
		//Fajita List Box Listener
		jlstFajitas.addListSelectionListener(this);
		
		
	}
	//JList Fajitas: if item is selected, add to Order
	public void valueChanged(ListSelectionEvent lse)
	{
		//Use getSource() - Method in class java.util.EventObject
		if(lse.getSource() == jlstFajitas)
		{	
			int selection[] = jlstFajitas.getSelectedIndices();
			for(int i = 0; i < 4; i++)
			{
				String item;
				double cost = 0.0;
				switch(i)
				{
				case 0: item = "Steak Fajitas"; cost = 11.95; break;
				case 1: item = "Chicken Fajitas"; cost = 10.95; break;
				case 2: item = "Shrimp Fajitas"; cost = 12.95; break;
				case 3: item = "Combination"; cost = 15.95; break;
				default: return;
				}
				boolean found = false;
				for(int j = 0; j < selection.length; j++)
				{
					if(i == selection[j])
					{
						found = true;
					}
				}
				if(!found)
					order.removeItem(item);
				else
					order.addItem(item,cost);
			}
		}
		updateOrder();
	}

	/*Implementation of DocumentListener Interface methods 
	* removeUpdate and changedUpdate are dummy methods that must be implemented
	* to make the class compilable
	* insertUpdate method is used to update the Misc. jtaSpecialInstr
	*/
	public void removeUpdate(DocumentEvent de)
	{
		return;
	}
	public void changedUpdate(DocumentEvent de)
	{
		return;
	}

	public void insertUpdate(DocumentEvent de)
	{
		order.setMisc(jtaSpecialInstr.getText());
	}
	
	//get values from customer information text fields
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==tfName)
		{
			order.setName(tfName.getText());
		}

		if(ae.getSource()==tfAddress)
		{
			order.setAddress(tfAddress.getText());
		}

		if(ae.getSource()==tfPhone)
		{
			order.setPhone(tfPhone.getText());
		}
		if(ae.getSource()==jtaSpecialInstr)
		{
			order.setMisc(jtaSpecialInstr.getText());
		}
		//Enchilada check boxes
		if(ae.getSource()==jchChickenE)
		{
			boolean checked = jchChickenE.isSelected();
			if(checked)
				order.addItem("Chicken Enchilada Dinner", 9.95);
			else
				order.removeItem("Chicken Enchilada Dinner");
		}
		if(ae.getSource()==jchBeefE)
		{
			boolean checked = jchBeefE.isSelected();
			if(checked)
				order.addItem("Beef Enchilada Dinner", 9.95);
			else
				order.removeItem("Beef Enchilada Dinner");
		}
		if(ae.getSource()==jchShrimpE)
		{
			boolean checked = jchShrimpE.isSelected();
			if(checked)
				order.addItem("Shrimp Enchilada Dinner", 11.95);
			else
				order.removeItem("Shrimp Enchilada Dinner");
		}
		//Burrito check boxes
		if(ae.getSource()==jchGrandeB)
		{
			boolean checked = jchGrandeB.isSelected();
			if(checked)
				order.addItem("Grande Burrito Dinner", 10.95);
			else
				order.removeItem("Grande Burrito Dinner");
		}
		if(ae.getSource()==jchDurangoB)
		{
			boolean checked = jchDurangoB.isSelected();
			if(checked)
				order.addItem("Durango Burrito Dinner", 9.95);
			else
				order.removeItem("Durango Burrito Dinner");
		}
		if(ae.getSource()==jchBeanB)
		{
			boolean checked = jchBeanB.isSelected();
			if(checked)
				order.addItem("Bean&Cheese Burrito Dinner", 8.95);
			else
				order.removeItem("Bean&Cheese Burrito Dinner");
		}
		//Delivery combobox
		if(ae.getSource() == jcbDelivery)
		{
			int choice = jcbDelivery.getSelectedIndex();
			if(choice == 1)
			{
				order.setDelivery(true);
			}
			else
			{
				order.setDelivery(false);
			}
		}
		//Reset button
		if(ae.getSource() == jbReset)
		{
			order.clearOrder();
			clear();	
		}
		//Order Button
		if(ae.getSource() == jbOrder)
		{
			int answer = JOptionPane.showConfirmDialog(null,"Confirm Order?");
			if(answer == JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(null,"Thank you for the order!");
				order = new Order();
				clear();	
			}
		}
		//Taco Radio Buttons
		if(ae.getSource() == rbT1Steak)
		{
			updateTacos();	  
		}
		if(ae.getSource() == rbT2Steak)
		{
			updateTacos();	  
		}
		if(ae.getSource() == rbT1Chicken)
		{
			updateTacos();	  
		}
		if(ae.getSource() == rbT2Chicken)
		{
			updateTacos();	  
		}
		if(ae.getSource() == rbT1Fish)
		{
			updateTacos();	  
		}
		if(ae.getSource() == rbT2Fish)
		{
			updateTacos();	  
		}
		updateOrder();
	}
	public void updateTacos()
	{
		order.removeTacos();
		String op1="";
		String op2="";
		if(rbT1Steak.isSelected())
		{
			op1 = "Steak";
		}
		if(rbT1Chicken.isSelected())
		{
			op1 = "Chicken";
		}
		if(rbT1Fish.isSelected())
		{
			op1 = "Fish";
		}
		if(rbT2Steak.isSelected())
		{
			op2 = "Steak";
		}
		if(rbT2Chicken.isSelected())
		{
			op2 = "Chicken";
		}
		if(rbT2Fish.isSelected())
		{
			op2 = "Fish";
		}
		if(op1.equals("")||op2.equals(""))
			return;
		else
			order.addItem("Taco Dinner "+op1 +"&"+op2,9.95);
	}
	//Add items to order, update subtotal
	//update total, tax and delivery charge
	public void updateOrder()
	{
		double sub = order.getSubTotal();
		double tax = order.getTax();
		double total = order.getTotal();
		if(order.getDelivery())
		{
			tfDeliveryCharge.setText(""+4.0);
		}
		else
		{
			tfDeliveryCharge.setText(""+0.0);
		}
		tfSubtotal.setText(""+sub);
		tfTaxes.setText(""+ tax);
		tfTotal.setText(""+total);
		tfName.setText(order.getName());
		tfAddress.setText(order.getAddress());
		tfPhone.setText(order.getPhone());
		jtaSpecialInstr.setText(order.getMisc());
		jtaOrderSummary.setText(order.getSummary());

	}
	//Clears all check boxes, text fields, radio buttons
	public void clear()
	{
		jchChickenE.setSelected(false);
		jchBeefE.setSelected(false);
		jchShrimpE.setSelected(false);
		jchGrandeB.setSelected(false);
		jchDurangoB.setSelected(false);
		jchBeanB.setSelected(false);
		jlstFajitas.clearSelection();
		bgTaco1.clearSelection();
		bgTaco2.clearSelection();
	}
}	  

