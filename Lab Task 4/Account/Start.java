import java.lang.*;
import java.util.*;
public class Start 
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //Fixed account
		
        System.out.println("Enter your FixedAccount id");
        int id = obj.nextInt();

        System.out.println("Enter your FixedAccount Name");
        String name = obj.next();

        System.out.println("Enter your FixedAccount amount");
        float amount = obj.nextFloat();
		
		System.out.println("Enter your FixedAccount Deposite");
        float Deposite = obj.nextFloat();
		
		System.out.println("Enter your FixedAccount Withdraw");
        float Withdraw = obj.nextFloat();

        System.out.println("Enter your FixedAccount year");
        int year = obj.nextInt();
		FixedAccount f1 = new FixedAccount(name,id,amount,Deposite,Withdraw,year);
		f1.details();
		
		//Saving account
		
		SavingAccount s1 = new SavingAccount();

		System.out.println("Enter your SavingAccount id");
        int id2 = obj.nextInt();
		s1.setid(id2);

        System.out.println("Enter your SavingAccount Name");
        String name2 = obj.next();
		s1.setname(name2);

        System.out.println("Enter your SavingAccount amount");
        float amount2 = obj.nextFloat();
        s1.setamount(amount2);
		
		System.out.println("Enter your  SavingAccount Deposite");
        float Deposite2 = obj.nextFloat();
		s1.setDeposite(Deposite2);
		
		System.out.println("Enter your SavingAccount Withdraw");
        float Withdraw2 = obj.nextFloat();
		s1.setWithdraw(Withdraw2);

        System.out.println("Enter your  SavingAccount Interest Rate");
        float Irate = obj.nextFloat();
		s1.setIrate(Irate);
		
        s1.details();
       
    }
}