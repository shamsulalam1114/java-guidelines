import java.lang.*;

public class Start{
	
	public static void main(String[] args)
	{
		Account a1=new Account(111,"Saving",5000000);
		Account a2=new Account(345,"Fixed",4534534);
		Account a3=new Account(434534,"saving",45645);
		Account a4=new Account(444,"Saving",6577868);
		
		Customer c1=new Customer(23423423,5);
		c1.insertacc(a1);
		c1.insertacc(a2);
		c1.insertacc(a3);
		c1.deleteacc(a2);
		c1.details();
	}
}