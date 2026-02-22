package com.nit.abstractclasses;

public class ProductStore {

	public static void main(String[] args) {
		IO.println("Select Product Type:");
		IO.println("1. Digital Product");
		IO.println("2. Physical Product");
		int choice=Integer.parseInt(IO.readln());
		switch(choice) {
		case 1->{
			String name=IO.readln("Enter Digital Product Name :");
			double price=Double.parseDouble(IO.readln("Enter Product Price :"));
			String category=IO.readln("Enter Product Category :");
			String licenseKey=IO.readln("Enter Product License Key :");
			int percentage=Integer.parseInt(IO.readln("Enter the discount % on final bill"));
			
			DigitalProduct DP=new DigitalProduct(name,price,category,licenseKey);
			IO.println(DP);
			DP.applyDiscount(percentage);
			DP.calculateTax();
			
				
		}
		case 2->{
			String name=IO.readln("Enter Physical Product Name :");
			double price=Double.parseDouble(IO.readln("Enter Product Price :"));
			String category=IO.readln("Enter Product Category :");
			int weight=Integer.parseInt(IO.readln("Enter Product weight :"));
			int percentage=Integer.parseInt(IO.readln("Enter the discount % on final bill"));
			
			PhysicalProduct PD=new PhysicalProduct(name,price,category,weight);
			IO.println(PD);
			PD.applyDiscount(percentage);
			PD.calculateTax();
			
		}
		
		}
		

	}

}
abstract class Product{
	private String name;
	private double price;
	private String category;
	
	
	public Product(String name, double price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}
		public abstract void applyDiscount(double percentage);
		
		public abstract void calculateTax();
		
		
		
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		@Override
		public String toString() {
			return "Product [name=" + name + ", price=" + price + ", category=" + category + "]";
		}
		
		
		
		
}
class DigitalProduct extends Product{
	private String licenseKey ;

	public DigitalProduct(String name, double price, String category, String licenseKey) {
		
		if(name.equals("null") || name.isBlank()) {
			System.err.println("Product name cannot be empty or null.");
			System.exit(0);
			
		}
		if(category.equals("null") || name.isBlank()) {
			System.err.println("Category cannot be empty or null.");
			System.exit(0);
			
		}
		if(price<=0) {
			System.err.println("Price cannot be negative.");
			System.exit(0);
			
		}
		
		super(name, price, category);
		this.licenseKey = licenseKey;
	}
	
	public void applyDiscount(double percentage) {
		double disPrice=(percentage/100)*getPrice();
		IO.println("Discount on the product is: "+disPrice);
		
		double newPrice=getPrice()-disPrice;
		IO.println("The Updated Price is: "+newPrice);

		
	}
	
	public void calculateTax() {
		
		double taxPrice=getPrice()*0.05;
		IO.println("Tax price On discount is: "+taxPrice);

	}
	@Override
	public String toString() {
		return "DigitalProduct [name= "+getName()+" Price= "+getPrice()+" Category= "+getCategory()+" licenseKey= " + licenseKey + "]";
	}

	
}
class PhysicalProduct extends Product{
	private double shippingWeight;

	public PhysicalProduct(String name, double price, String category, double shippingWeight) {
		
		if(name.equals("null") || name.isBlank()) {
			System.err.println("Product name cannot be empty or null.");
			System.exit(0);
			
		}
		if(category.equals("null") || name.isBlank()) {
			System.err.println("Category cannot be empty or null.");
			System.exit(0);
			
		}
		if(price<=0) {
			System.err.println("Price cannot be negative.");
			System.exit(0);
			
		}
		
		super(name, price, category);
		this.shippingWeight = shippingWeight;
	}
	public void applyDiscount(double percentage) {
		double disPrice=(percentage/100)*getPrice();
		IO.println("Discount on the product is: "+disPrice);
		
		double newPrice=getPrice()+disPrice;
		IO.println("The Updated Price is: "+newPrice);

		
	}
	public void calculateTax() {
		
		double taxPrice=getPrice()*0.08;
		IO.println("Tax price On discount is: "+taxPrice);


	}
	public double calculateShippingCost() {
		double shippingCost=shippingWeight*5;
		return shippingCost;
		
		
	}
	@Override
	public String toString() {
		return "PhysicalProduct [name= "+getName()+" Price= "+getPrice()+" Category= "+getCategory()+" shippingWeight= " + shippingWeight + "]";
	}
	
	
	
}
