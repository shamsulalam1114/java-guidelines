import java.lang.*;
import java.util.*;
public class FrontendProgrammer extends Programmer
{
	private String assigntask;
	private String completetask;
	
	public FrontendProgrammer()
	{
		System.out.println("Empty for FrontendProgrammer");
	}
	
	public FrontendProgrammer(int id,String name,int age,double salary,String assigntask,String completetask)
	{
	    super(id,name,age,salary);
		this.assigntask=assigntask;
		this.completetask=completetask;
		System.out.println("Pera cons for FrontendProgrammer");
	}
	
	public void setassigntask(String assigntask)
	{
		this.assigntask=assigntask;
	}
	
	public void setcompletetask(String completetask)
	{
		this.completetask=completetask;
	}
	
	public String getassigntask()
	{
		return assigntask;
	}
	
	public String getcompletetask()
	{
		return completetask;
	}
	
	public void yearlySalary2()
	{
		double YL2=12*getsalary();
		System.out.println("yearlySalary For FrontendProgrammer "+YL2);
	}
	
	public void details()
	{
		super.details();
		System.out.println("assigntask "+assigntask+"\n"+"completetask "+completetask);
	}
	
	
}