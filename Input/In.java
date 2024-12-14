import java.lang.*;
public class In
{   
    private int id;
  
    private String name;
	
	public In()
	{ 
	  System.out.println(" Empty ");
	}
	
	public In(int id,String name)
	{ 
	 
	 this.id=id;
	 
	 this.name=name;
	  System.out.println(" para cons ");
	}
	public void setid(int id)
	{  
	    this.id=id;
    }		
	 
	
	public void setname(String name)
	{    
	    this.name=name;
	}
	public int getid()
	{
		 return id;
    }
	
	public String getname()
	{
		 return name;
    }
	public void output()
	{
		System.out.println("humanId1 : "+id+"\n"+"name : "+name);
	}
}