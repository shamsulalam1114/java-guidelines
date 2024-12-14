import java.lang.*;
import java.util.*;
public class SavingAccount extends Account
 {
    private float IratePerYear;

    public SavingAccount() 
	{
        System.out.println("Empty for Child-SavingAccount");
    }

    public SavingAccount(String name,int AccountNumber,double Balance,float IratePerYear)
	{
        super(name,AccountNumber,Balance);
        this.IratePerYear = IratePerYear;
        System.out.println("Pera cons for Child-SavingAccount");
    }

    public void setIrate(float IratePerYear) 
	{
        this.IratePerYear=IratePerYear;
    }

    public float getIratePerYear() 
	{
        return IratePerYear;
    }
	
	  
    public void details() 
	{
        super.details();
	
        System.out.println("Interest Rate "+IratePerYear+"%");
    }
}