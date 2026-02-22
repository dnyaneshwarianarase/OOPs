package com.nit.abstractclasses;

public class CakeOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String shape=IO.readln("Enter A shape: ");
		String flavor=IO.readln("Enter A flavor: ");
		int quantity=Integer.parseInt(IO.readln("Enter a quntity: "));
		String messege=IO.readln("Enter A messege: ");
		OrderedCake cake1=new OrderedCake();
		IO.println(cake1);
		OrderedCake cake2=new OrderedCake(shape,flavor,quantity);
		IO.println(cake2);
		OrderedCake cake3=new OrderedCake(shape,flavor,quantity,messege);
		IO.println(cake3);

	}

}
abstract class Cake{
	private String shape;
	private String flavor;
	private int quantity;
	public static double price=400;
	
	public Cake(String shape, String flavor, int quantity) {
		super();
		this.shape = shape;
		this.flavor = flavor;
		this.quantity = quantity;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static double getPrice() {
		return price;
	}

	public static void setPrice(double price) {
		Cake.price = price;
	}
	public String toString() {
		return "A "+shape+" "+flavor+" Cake Of "+quantity+" KG is Ready "+(price*quantity)+" RS";
		
	}
}
class OrderedCake extends Cake{
	//private String name;
	private String messege ;
	
	public OrderedCake() {
		super("Round", "vanila", 1);
		
	}

	public OrderedCake(String shape, String flavor, int quantity) {
		super(shape, flavor, quantity);
		
	}
	public OrderedCake(String shape, String flavor, int quantity,String messege) {
		super(shape, flavor, quantity);
		this.messege=messege;
		
		
	}
	public String toString()
	{
		if(messege!=null) {
		return"A "+getShape()+" "+getFlavor()+" Cake of "+getQuantity()+" KG is Ready with "+messege+" @ Rs. "+(getQuantity()*Cake.price);
		}
		else {
			return super.toString();
		}
	}
	
	
	
	
}