import java.lang.*;
public class Stadium
{   
    private int id;
    private String name;
    private int capacity;
	public void setid(int j)
	{  
	    id=j;
    }		
	public void setname(String n)
	{    
	    name=n;
	}
	public void setcapacity(int t)
	{    
	    capacity=t;
	}
	public int getid()
	{
		 return id;
    }
	public String getname()
	{
		 return name;
    }
	public int getcapacity()
	{
		 return capacity;
    }
	public void output()
	{
		System.out.println("StadiumId : "+id+"\n"+"StadiumName : "+name+"\n"+"StadiumCapacity : "+capacity+" Viewers");
	}
	public static void main (String[]args)
	{ 
	  Stadium s1=new Stadium();
	  s1.setid(145450);
	  s1.setname("MirpurStadium");
	  s1.setcapacity(25000);
	  s1.output();
	}
	
}