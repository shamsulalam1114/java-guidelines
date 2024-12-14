import java.lang.*;
public class Constructor
{ 
   private int id;
   private String name;
   private float cgpa;
   
   
   
   public Constructor(int i,String n,float c)
   { 
    id=i;
    name=n;
    cgpa=c;
     System.out.println(" para cons ");
   }
   
   public void setid(int i)
   {
	 id=i;
   }
   
   public void setname(String n)
   {
	 name=n;
   }
   
   public void setcgpa(float c)
   {
	 cgpa=c;
   }
   
   public int getid()
   { 
     return id;
   }
   
   public String getname()
   { 
     return name;
   }
   
   public float getcgpa()
   { 
     return cgpa;
   }
   
   public void details()
	{
		System.out.println("ID "+id+"\n"+"Name "+name+"\n"+"CGPA "+cgpa);
	}
	
	public static void main (String[]args)
	{ 
	  Constructor c1=new Constructor(5676,"c++",4.00F);
	  Constructor c2=new Constructor(12345,"java",3.50F);
	 
	  c1.details();
	  c2.details();
	 
	}
	
}