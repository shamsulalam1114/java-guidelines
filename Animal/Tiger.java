import java.lang.*;


public class Tiger extends Animal
{ 
   private String name;
   private String breed;
   private String color;
   private String ability;
   private float speed;
   
   
   public Tiger()
	{
		System.out.println("Empty Cons for Tiger");
	}
	
	public Tiger(String name,String breed,String color,String ability,float speed)
	{
		super(name,breed,color);
		this.ability=ability;
		this.speed=speed;
		
		System.out.println("Pera Cons for Tiger");
	}
	
	public void setability(String ability)
	{
		this.ability=ability;
	}
	
	public void setspeed(float speed)
	{
		this.speed=speed;
	}
	
	public String getability()
	{
		return ability;
	}
	
	public float getspeed()
	{
		return speed;
	}
	
	
	public void details()
	{
		super.details();
		System.out.println("Ability of Tiger : "+ability+"\n"+"Speed of Tiger : "+speed+" KMPH");
	}
	
	
	
	
}
   