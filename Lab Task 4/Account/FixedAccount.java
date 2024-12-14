import java.lang.*;
import java.util.*;
public class FixedAccount extends Account 
{
    private int year;

    public FixedAccount() 
	{
        System.out.println("Empty for Child-FixedAccount");
    }

    public FixedAccount(String name,int id,float amount,float Deposite,float Withdraw,int year) 
	{
        super(name,id,amount,Deposite,Withdraw);
        this.year=year;
        System.out.println("Pera cons for Child-FixedAccount");
    }

    public void setyear(int year) 
	{
        this.year=year;
    }

    public int getyear() 
	{
        return year;
    }

   
    public void details() 
	{
        super.details();
        System.out.println("year "+year);
    }
}