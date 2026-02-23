package com.nit.interfacee;

interface Payment{
	void makePayment(double amount);
	void makeRefound(double amount);
}

class CreaditCardPayment implements Payment{
	private String holderName;
	CreaditCardPayment(String holderName){
		super();
		this.holderName=holderName;
	}
	@Override
	public void makePayment(double amount) {
		IO.println("Paid RS :"+amount+" using Credit Card Holder : "+holderName);
		
	}
	@Override
	public void makeRefound(double amount) {
		IO.println("Refunded  RS :"+amount+" using Credit Card Holder : "+holderName);
	}
}
class DebitCardPayment implements Payment{
	private String bankName;
	DebitCardPayment(String bankName){
		super();
		this.bankName=bankName;
		
	}
	@Override
	public void makePayment(double amount) {
		IO.println("Paid RS :"+amount+" using Credit Card Holder : "+bankName);
		
	}
	@Override
	public void makeRefound(double amount) {
		IO.println("Refunded RS :"+amount+" using Credit Card Holder : "+bankName);
		
	}
}

class UPIPayment implements Payment{
	private String upiId;
	UPIPayment(String upiId,String holderName, String bankName){
		super();
		this.upiId=upiId;
	}
	@Override
	public void makePayment(double amount) {
		IO.println("Paid RS :"+amount+" using Credit Card Holder : "+upiId);
	}
	@Override
	public void makeRefound(double amount) {
		IO.println("Refunded RS :"+amount+" using Credit Card Holder : "+upiId);
		
	}
}
class ShoppingCard{
	private double totalAmount;
	
	ShoppingCard(double totalAmount){
		
		this.totalAmount=totalAmount;
	}
	public void checkOut(Payment payment) {
		IO.println("Starting checkout for amount RS :"+totalAmount);
		payment.makePayment(totalAmount);
		
	}
	public void cancelOrder(Payment payment) {
		IO.println("Order Canceled. Initiating Refund...");
		IO.println("Cancelling order for amount RS :"+totalAmount);
		payment.makeRefound(totalAmount);
		
	}
	
}
