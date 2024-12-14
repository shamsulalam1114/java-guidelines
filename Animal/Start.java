import java.lang.*;
import java.util.*;

public class Start
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		
        System.out.println("Enter Name");		
        String name=obj.next();
         
		System.out.println("Enter Breed");		
        String breed=obj.next();
		
		System.out.println("Enter color");		
        String color=obj.next();
		
		System.out.println("Enter Ability");		
        String ability=obj.next();
		
		System.out.println("Enter speed");		
        float speed=obj.nextFloat();
		
		Tiger t1=new Tiger(name,breed,color,ability,speed);
		t1.details();
		
		//another method
		
		Tiger t2=new Tiger();
		
		System.out.println("Enter Name2");		
        String name2=obj.next();
		t2.setname(name2);
		
		System.out.println("Enter Breed2");		
        String breed2=obj.next();
		t2.setbreed(breed2);
		
		System.out.println("Enter color2");		
        String color2=obj.next();
		t2.setcolor(color2);
		
		System.out.println("Enter Ability2");		
        String ability2=obj.next();
		t2.setability(ability2);
		
		System.out.println("Enter speed2");		
        float speed2=obj.nextFloat();
		t2.setspeed(speed2);
		
	    t2.details();
		
		
		//another method 2nd scanner
		
		
		Scanner obj2=new Scanner(System.in);
		
        System.out.println("Enter Name3");		
        String name3=obj2.next();
         
		System.out.println("Enter Breed3");		
        String breed3=obj2.next();
		
		System.out.println("Enter color3");		
        String color3=obj2.next();
		
		System.out.println("Enter Ability3");		
        String ability3=obj2.next();
		
		System.out.println("Enter speed3");		
        float speed3=obj2.nextFloat();
		
		Tiger t3=new Tiger(name,breed,color,ability,speed);
		t3.details();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
    }
	
}
	
	