import java.lang.*;
import java.util.*;
public class Programmer
{
	private int id;
	private String name;
	private int age;
	private double salary;
	
	public Programmer()
	{
		System.out.println("Empty const for Programmer");
	}
	
	public Programmer(int id,String name,int age,double salary)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
		System.out.println("Pera const for Programmer");
	}
	
	public void setid(int id)
	{
		this.id=id;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	
	public void setage(int age)
	{
		this.age=age;
	}
	
	public void setsalary(double salary)
	{
		this.salary=salary;
	}
	
	public int getid()
	{
		return id;
	}
	
	public String getname()
	{
		return name;
	}
	
	public int getage()
	{
		return age;
	}
	
	public double getsalary()
	{
		return salary;
	}
	
	public void yearlySalary()
	{
		double YL=12*salary;
		System.out.println("yearlySalary For Programmer "+YL);
	}
	
	public void details()
	{
		System.out.println("ID "+id+"\n"+"Name "+name+"\n"+"Age "+age+"\n"+"Salary "+salary);
	}
	
	
}