import java.lang.*;
import java.util.*;
public class SavingAccount extends Account
 {
    private float Irate;

    public SavingAccount() 
	{
        System.out.println("Empty for Child-SavingAccount");
    }

    public SavingAccount(String name,int id,float amount,float Deposite,float Withdraw,float Irate)
	{
        super(name,id,amount,Deposite,Withdraw);
        this.Irate = Irate;
        System.out.println("Pera cons for Child-SavingAccount");
    }

    public void setIrate(float Irate) 
	{
        this.Irate=Irate;
    }

    public float getIrate() 
	{
        return Irate;
    }
	
	  
    public void details() 
	{
        super.details();
        System.out.println("Interest Rate "+Irate+"%");
    }
}