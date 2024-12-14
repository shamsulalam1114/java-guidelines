import java.lang.*;
import java.util.*;
public class Input
{   
   
	public static void main (String[]args)
	{ 
	  Scanner obj=new Scanner(System.in);
	  
	  
	  
	  System.out.println("Id :");
	  int id=obj.nextInt();
	  
	 
	  
	  System.out.println("name :");
	  String name=obj.next();
	  In i2=new In(id,name);
	  i2.output();
	  //int sum= i+n;
	  
	  //Input i1=new Input(id,id2,name);
	  //i1.detais;
	  
	  //System.out.println(sum);
	  //Input i2=new Input();
	  //int id2=obj.nextInt();
	  //i2.setid(id2);
	 
	}
	
}