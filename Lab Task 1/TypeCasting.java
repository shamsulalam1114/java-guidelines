import java.lang.*;
public class TypeCasting
{    
    public static void main(String[]args)
	{  
	       int x =5;
		   long l1;
		   System.out.println("implicite");
		   l1=x;
		   System.out.println("int "+x);
		   System.out.println("long "+l1);
		   
		   long l2=75L;
		   int x1;
		   System.out.println("explicite");
		   x1=(int)l2;
		   System.out.println("long "+l2);
		   System.out.println("int "+x1);
		   
		   char c1='b';
		   int x2;
		   System.out.println("implicite");
		   x2=c1;
		   System.out.println("char "+c1);
		   System.out.println("int "+x2);
		   
		   int x3 =16;
		   char c2='v';
		   System.out.println("explicite");
		   c2=(char)x3;
		   System.out.println("int "+x3);
		   System.out.println("char "+c2);
		   
		   short s1 =14;
		   double d1;
		   System.out.println("implicite");
		   d1=s1;
		   System.out.println("short "+s1);
		   System.out.println("double "+d1);
		   
		    double d2=4.5;
		    short s2;
		    System.out.println("explicite");
			s2=(short)d2;
			System.out.println("double "+d2);
		    System.out.println("short "+s2);
		   
		   byte b1 =14;
		   float f1;
		   System.out.println("implicite");
		   f1=b1;
		   System.out.println("byte "+b1);
		   System.out.println("float "+f1);
		   
		   float f2=4.5F;
		   byte b2;
		   System.out.println("explicite");
		   b2=(byte)f2;
		   System.out.println("float "+f2);
		   System.out.println("byte "+b2);
		   
		   
		   
	}
}