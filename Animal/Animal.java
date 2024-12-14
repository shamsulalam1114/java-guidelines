import java.lang.*;


public class Animal
{ 
   private String name;
   private String breed;
   private String color;
   
   
   public Animal()
	{
		System.out.println("Empty Cons for Animal");
	}
	
	public Animal(String name,String breed,String color)
	{
		this.name=name;
		this.breed=breed;
		this.color=color;
		
		System.out.println("Pera Cons for Animal");
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	
	public void setbreed(String breed)
	{
		this.breed=breed;
	}
	
	public void setcolor(String color)
	{
		this.color=color;
	}
	
	
	
	public String getname()
	{
		return name;
	}
	
	public String getbreed()
	{
		return breed;
	}
	
	public String getcolor()
	{
		return color;
	}
	
		
	public void details()
	{
		
		System.out.println("Name : "+name+"\n"+"Breed : "+breed+"\n"+"Color : "+color);
	}
	
	
	
	
}
   