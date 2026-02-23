package com.nit.interfacee;

public class Customer {
	void main()
	{
		double totalAmount=Double.parseDouble(IO.readln("Enter the total Bill Amount:"));
		IO.println("Choose Payment Method:");
		IO.println("1. Credit Card");
		IO.println("2. Debit Card");
		IO.println("3. UPI");
		int choice=Integer.parseInt(IO.readln());
		switch(choice)
		{
		case 1->{
			double amount=Double.parseDouble(IO.readln("Enter the amount:"));
			String name=IO.readln("Enter the card HolderName:");
			Payment p=new CreaditCardPayment(name);
			ShoppingCard s=new ShoppingCard(totalAmount);
			s.checkOut(p);
			s.cancelOrder(p);
		}
		case 2->{
			double amount=Double.parseDouble(IO.readln("Enter the amount:"));
			String bankName=IO.readln("Enter the Bank Name:");
			Payment p=new DebitCardPayment(bankName);
			ShoppingCard s=new ShoppingCard(totalAmount);
			s.checkOut(p);
			s.cancelOrder(p);
			
		}
		case 3->{
			double amount=Double.parseDouble(IO.readln("Enter the amount:"));
			String upiId=IO.readln("Enter the UPIid:");
			Payment p=new DebitCardPayment(upiId);
			ShoppingCard s=new ShoppingCard(totalAmount);
			s.checkOut(p);
			s.cancelOrder(p);
			
		}
		default->IO.println("Invalid choice......");
		}
	}

}
