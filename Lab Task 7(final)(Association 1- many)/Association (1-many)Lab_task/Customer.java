import java.lang.*;

public class Customer
{
	private int phnnb;
	private Account acc[];
	
	public Customer()
	{
		System.out.println("Empty for Customer");
	}
	
	public Customer(int phnnb,int size)
	{
		this.phnnb=phnnb;
		acc=new Account[size];
	}
	
	public void insertacc(Account a)
	{
		for(int i=0;i<acc.length;i++)
		{
			if(acc[i]==null)
			{     
		           acc[i]=a;
				   break;
		    }
	    }
		      
	}
	
	public void deleteacc(Account a)
	{
		for(int i=0;i<acc.length;i++)
		{
			if(acc[i]==a)
			{     
		           acc[i]=null;
				   break;
		    }
	    }
		      
	}
	
	public void details()
	{
		for(int i=0;i<acc.length;i++)
		{
			if(acc[i]!=null)
			{
				acc[i].details();
			}
			else
			{
				System.out.println("index empty");
			}
		}
	}
}

	