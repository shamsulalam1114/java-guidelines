import java.lang.*;

public class Array
{
	public static void main(String[]args)
	{
		
	int arr1[]=new int[5];
	
	arr1[2]=5;
	arr1[3]=3;
	arr1[0]=9;
	
	for(int i=1;i<arr1.length;i+=2)
	{
		System.out.println(arr1[i]);
		
	}
	
	
	float arr2[];
	 arr2[]=new float[5];
	
	arr2[0]=10;
	arr2[3]=11.11F;
	arr2[4]=12.45F;
	int i=0;
	while(i<arr2.length)
	{
		System.out.println(arr2[i]);
		i++;
	}
	
	
	String s1[]=new String[]{"AIUB","JAVA","KURATOLI"};
	s1[2]="DHAKA";
	int j=0;
	do
	{
		System.out.println(s1[j]);
		j++;
	}
	while(j<s1.length);
	
	
	
	
	
	
	
	
	
	
	}
}