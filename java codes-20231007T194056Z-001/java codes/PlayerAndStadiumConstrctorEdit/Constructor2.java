import java.lang.*;
public class Constructor2
 {
    private int JsNo;
    private int Capacity;
    private String nameP;
    private String nameS;
    private String team;

    public Constructor2() 
	{
        System.out.println(" Empty ");
    }

    public Constructor2(int j, String P, String t) 
	{
        JsNo=j;
        nameP=P;
        team=t;
        System.out.println(" para cons ");
    }

    public Constructor2(int c,String S) 
	{
        Capacity=c;
        nameS=S;
        System.out.println(" para cons ");
    }

    public void setJsNo(int j) 
	{
        JsNo=j;
    }

    public void setCapacity(int c) 
	{
        Capacity=c;
    }

    public void setnameP(String P) 
	{
        nameP=P;
    }

    public void setnameS(String S) 
	{
        nameS=S;
    }

    public void setteam(String t) 
	{
        team=t;
    }

    public int getJsNo() 
	{
        return JsNo;
    }

    public int getCapacity() 
	{
        return Capacity;
    }

    public String getnameP() 
	{
        return nameP;
    }

    public String getnameS() 
	{
        return nameS;
    }

    public String getteam() 
	{
        return team;
    }

    public void details1() 
	{
        System.out.println("JerseyNo "+JsNo+"\n"+"PlayerName "+nameP+"\n"+" TeamName "+team);
    }

    public void details2() 
	{
        System.out.println("Capacity "+Capacity+" Viewers "+"\n" +"StadiumName "+nameS);
    }

    public static void main(String[] args) 
	{
        Constructor2 c1=new Constructor2(75,"SHAKIB","BANGLADESH");
        Constructor2 c2=new Constructor2(5666,"Mirpur");
		
        //c1.setCapacity(3500);
        //c1.setnameS("mirpurstadium");

        c1.details1();
        c2.details2();
    }
	
	
}

