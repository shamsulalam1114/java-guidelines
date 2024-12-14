import java.lang.*;
import java.util.*;

  public class Start
{
	public static void main(String[] args)
	{
		Programmer p1=new Programmer(12321365,"Mostafiz",47,120000);
		p1.yearlySalary();
		p1.details();
		
		FrontendProgrammer f1=new FrontendProgrammer();
		f1.setid(12345);
		f1.setname("Akash");
		f1.setage(21);
		f1.setsalary(52000);
		f1.setassigntask("bug fixing");
		f1.setcompletetask("bug fixing");
		f1.yearlySalary2();
		f1.details();
	}
	
}