import java.lang.*;
public class Player
{   
    private int jsno;
    private String name;
    private String team;
	public void setjsno(int j)
	{  
	    jsno=j;
    }		
	public void setname(String n)
	{    
	    name=n;
	}
	public void setteam(String t)
	{    
	    team=t;
	}
	public int getjsno()
	{
		 return jsno;
    }
	public String getname()
	{
		 return name;
    }
	public String getteam()
	{
		 return team;
    }
	public void output()
	{
		System.out.println("JerseyNo : "+jsno+"\n"+"Name : "+name+"\n"+"TeamName : "+team);
	}
}