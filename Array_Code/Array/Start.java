import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		//1st approch
		
		int arr1[]=new int[5];
		
		arr1[2]=10;
		arr1[3]=30;
		arr1[0]=70;
		
		for(int i=1;i<arr1.length;i+=2)
		{
			System.out.println(arr1[i]);
		}
		
		//2nd approch
		
		float arr2[];
		arr2=new float[5];
		
		arr2[0]=70;
		arr2[3]=54.67F;
		arr2[4]=75.67F;
		
		int i=0;
		while(i<arr2.length)
		{
			System.out.println(arr2[i]);
			i++;
		}
		
		//3rd approch
		
		String s1[]=new String[]{"java","Aiub","kutratoli"};
		s1[2]="Dhaka";
		
		int j=0;
		
		do
		{
			System.out.println(s1[j]);
			j++;
		}while(j<s1.length);//0>10
		
	}
}