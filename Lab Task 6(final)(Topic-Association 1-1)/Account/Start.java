import java.lang.*;
import java.util.*;
public class Start 
{
    //public static void main(String[] args) {
        
		public static void main(String[] args)
	{
		//Associating
		Account a1 = new Account("AKASH", 123123, 5000000);
        Customer c1 = new Customer();
        c1.setname("Dhaka"); 
        c1.setacc(a1);
        c1.details();
		
		Scanner obj = new Scanner(System.in);
        //Fixed account

        System.out.println("Enter your Fixed Account Name");
       String name = obj.next();
		
		System.out.println("Enter your Fixed Account Number");
        int AccountNumber = obj.nextInt();

        System.out.println("Enter your Fixed Account Balance");
        double Balance = obj.nextDouble();
	
        System.out.println("Enter your Fixed Account year");
        int year = obj.nextInt();
		
		FixedAccount f1 = new FixedAccount(name,AccountNumber,Balance,year);
		f1.details();

     //saving account

		SavingAccount s1 = new SavingAccount("akash",23423423,245556,13.5F);
		
       s1.details();
	}
		
		
		
		
		
		
		
		
		
       
    }
	


