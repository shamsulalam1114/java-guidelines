import java.lang.*;
public class student
{ 
  int id;
  String name;
  public void setid(int id)
  {
	  this.id=id;
  }
  public void setname(String name)
  {
	  this.name=name;
  }
  public int getid()
  {
	  return id;
  }
  public String getname()
  {
	  return name;
  }
  public void details()
  {
	   System.out.println("ID : "+id+"\n"+"NAME :"+name);
  }
   
 public static void main(String[]args)
 {
	  student s1=new student();
	  s1.setid(23232);
	  s1.setname("JAVA");
	  s1.details();
 }
}