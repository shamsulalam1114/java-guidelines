import java.lang.*;
import java.util.*;
public class Flower
{ 
   private String name;
   private String varient;
   private String color;
   private float  price;
   private int    number;
   
   public Flower()
	{
		System.out.println("Empty Con");
	}
	
	public Flower(String name,String varient,String color,float price,int    number)
	{
		this.name=name;
		this.varient=varient;
		this.color=color;
		this.price=price;
		this.number=number;
		System.out.println("Pera Con");
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	
	public void setvarient(String varient)
	{
		this.varient=varient;
	}
	
	public void setcolor(String color)
	{
		this.color=color;
	}
	
	public void setprice(float price)
	{
		this.price=price;
	}
	
	public void setnumber(int number)
	{
		this.number=number;
	}
	
	public String getname()
	{
		return name;
	}
	
	public String getvarient()
	{
		return varient;
	}
	
	public String getcolor()
	{
		return color;
	}
	
	public float getprice()
	{
		return price;
	}
	
	public int getnumber()
	{
		return number;
	}
	
	public void totalprice()
	{
		float total=price*number;
		System.out.println("TotalPrice : "+total);
	}
	
	public void details()
	{
		
		System.out.println("Name : "+name+"\n"+"Varient : "+varient+"\n"+"Color : "+color+"\n"+"price : "+price+"\n"+"Number : "+number);
	}
	
	
	
	
}
   