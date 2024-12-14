import java.lang.*;

public class StringDemo
{
	public static void main(String[] args)
	{
	String s1=new String("java");
	String s2=new String("java");
	String s3="java";
	String s4="java";
	String s5="Bangladesh";
	
	if(s1==s2)
	{
		System.out.println("1. Value and Memory are same");
	}
	else
    {
		System.out.println("2. Value and Memory are not same");
	}
	
	if(s1.equals(s2))
	{
		System.out.println("3. Value are same");
	}
	else
    {
		System.out.println("4. Value are not same");
	}
	
	if(s2==s3)
	{
		System.out.println("5. Value and Memory are same");
	}
	else
    {
		System.out.println("6. Value and Memory are not same");
	}
	
	if(s1.equals(s3))
	{
		System.out.println("7. Value are same");
	}
	else
    {
		System.out.println("Value are not same");
	}
	
	System.out.println("Compare "+s1.compareTo(s5));
	System.out.println("SubString "+s5.substring(2,7));
	System.out.println("Length "+s5.length());
	System.out.println("Lower Case "+s5.toLowerCase());
	System.out.println("Upper Case "+s5.toUpperCase());
	System.out.println("Chat at "+s5.charAt(5));
	System.out.println("Index of "+s3.indexOf(2));
	}
}