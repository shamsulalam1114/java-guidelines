import java.lang.*;

public class Customer
{
	private String Adress;
	private Account acc;
	
	public Customer()
	{
		System.out.println("Empty for Customer");
	}
	
	public Customer(String Adress, Account acc)
	{
		this.Adress=Adress;
		this.acc=acc;
		System.out.println("Para for Customer");
	}
	
	public void setname(String Adress)
	{
		this.Adress=Adress;
	}
	
	public void setacc(Account acc)
	{
		this.acc=acc;
	}
	
	public String getAdress()
	{
		return Adress;
	}
	
	public Account getacc()
	{
		return acc;
	}
	public void details()
	{
		System.out.println("Adress: "+Adress);
		acc.details();
	}
}