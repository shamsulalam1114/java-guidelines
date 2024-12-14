import java.lang.*;
public class Human
{   
    private int id;
    private String name;
    private String address;
	
	public Human()
	{ 
	  System.out.println(" Empty ");
	}
	
	public Human(int id,String name,String address)
	{ 
	 
	 this.id=id;
	 this.name=name;
	 this.address=address;
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
	public void setaddress(String adress)
	{    
	    this.address=address;
	}
	public int getid()
	{
		 return id;
    }
	public String getname()
	{
		 return name;
    }
	public String getaddress()
	{
		 return address;
    }
	public void output()
	{
		System.out.println("humanId : "+id+"\n"+"Name : "+name+"\n"+"Address : "+address);
	}
}