import java.lang.*;
import java.util.*;
public class Start
{

     public static void main(String[] args)
	{
        Scanner obj=new Scanner(System.in);
		
        System.out.println("Enter Name");		
        String name=obj.next();
         
		System.out.println("Enter varient");		
        String varient=obj.next();
		
		System.out.println("Enter color");		
        String color=obj.next();
		
		System.out.println("Enter price");		
        float price=obj.nextFloat();
		
		System.out.println("Enter Number of flower");		
        int number=obj.nextInt();

	    Flower f1=new Flower(name,varient,color,price,number);
		
		f1.details();
		f1.totalprice();
		
		//another method
		
		Flower f2=new Flower();
		
		System.out.println("Enter Name2");
		String name2=obj.next();
		f2.setname(name2);
		
		System.out.println("Enter varient2");
		String varient2=obj.next();
		f2.setvarient(varient2);
		
		System.out.println("Enter color2");
		String color2=obj.next();
		f2.setcolor(color2);
		
		System.out.println("Enter price2");
		float price2=obj.nextFloat();
		f2.setprice(price2);
		
		System.out.println("Enter number2");
		int number2=obj.nextInt();
		f2.setnumber(number2);
		
		f2.details();
		f2.totalprice();
		
		
		
		
		//another method 2nd scanner obj
		
		Scanner obj2=new Scanner(System.in);
		
        System.out.println("Enter Name3");		
        String name3=obj2.next();
         
		System.out.println("Enter varient3");		
        String varient3=obj2.next();
		
		System.out.println("Enter color3");		
        String color3=obj2.next();
		
		System.out.println("Enter price3");		
        float price3=obj2.nextFloat();
		
		System.out.println("Enter Number of flower3");		
        int number3=obj2.nextInt();

	    Flower f3=new Flower(name,varient,color,price,number);
		
		f3.details();
		f3.totalprice();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}