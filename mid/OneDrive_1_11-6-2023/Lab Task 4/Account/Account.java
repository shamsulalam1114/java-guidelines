import java.lang.*;
import java.util.*;

public class Account
 {
    private String name;
    private int id;
    private float amount;
    private float Deposite;
    private float Withdraw;

    public Account() 
	{
		
        System.out.println("Empty Cons for parent-Account");
    }

    public Account(String name,int id,float amount,float Deposite,float Withdraw) 
	{
        this.name=name;
        this.id=id;
        this.amount=amount;
        this.Deposite=Deposite;
        this.Withdraw=Withdraw;

        System.out.println("Pera Cons for parent-Account");
    }

    public void setname(String name) 
	{
        this.name=name;
    }

    public void setid(int id)
	{
        this.id=id;
    }

    public void setamount(float amount) 
	{
        this.amount=amount;
    }

    public void setDeposite(float Deposite) 
	{
        this.Deposite=Deposite;
    }

    public void setWithdraw(float Withdraw)
	{
        this.Withdraw=Withdraw;
    }

    public String getname() 
	{
        return name;
    }

    public int getid()
	{
        return id;
    }

    public float getamount() 
	{
        return amount;
    }

    public float getDeposite()
	{
        return Deposite;
    }

    public float getWithdraw() 
	{
        return Withdraw;
    }

    public void TotalDepos()
	{
        float TotalDeposite=amount+Deposite;
        System.out.println("TotalDeposite: "+TotalDeposite);
    }

    public void Totalwithd()
	{
        float TotalWithdraw =amount-Withdraw;
        System.out.println("TotalWithdraw : "+TotalWithdraw);
    }

    public void details() 
	{
        System.out.println("Name : "+name+"\n"+"ID: "+id+"\n"+"Amount : "+amount+"\n"+"Deposite : "+Deposite+"\n"+"Withdraw : " + Withdraw);
    }

}