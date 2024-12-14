import java.lang.*;
import java.util.*;

public class Account
 {
    private String name;
    private int AccountNumber;
    private double Balance;
    
    public Account() 
	{
		
        System.out.println("Empty Cons for parent-Account");
    }

    public Account(String name,int AccountNumber,double Balance) 
	{
        this.name=name;
        this.AccountNumber=AccountNumber;
        this.Balance=Balance;

        System.out.println("Pera Cons for parent-Account");
    }

    public void setname(String name) 
	{
        this.name=name;
    }

    public void setid(int AccountNumber)
	{
        this.AccountNumber=AccountNumber;
    }

    public void setBalance(double Balance) 
	{
        this.Balance=Balance;
    }

   

    public String getname() 
	{
        return name;
    }

    public int getAccountNumber()
	{
        return AccountNumber;
    }

    public double getBalance() 
	{
        return Balance;
    }




    public void details() 
	{
        System.out.println("Name : "+name+"\n"+"AccountNumber: "+AccountNumber+"\n"+"Balance : " + Balance);
    }

}