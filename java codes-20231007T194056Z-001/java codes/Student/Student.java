import java.lang.*;
public class Student
{   
    int id;
    String name;
	public void setid(int i)
	{  
	    id=i;
    }		
	public void setname(String n)
	{    
	    name=n;
	}
	public int getid()
	{
		 return id;
    }
	public String getname()
	{
		 return name;
    }
	public void details()
	{
		System.out.println("id "+id+"\n"+"name "+name);
	}
	public static void main (String[]args)
	{ 
	  Student s1=new Student();
	  s1.setid(3434);
	  s1.setname("Java");
	  s1.details();
	}
	
}
	  