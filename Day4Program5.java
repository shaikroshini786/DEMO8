import java.util.Scanner;
class Employee
{
private int id;
private String name;
private String dept;
public void setId(int id)
{
this.id=id;
}
public void setName( String name)
{
this.name=name;
}
public void setDept( String name)
{
this.dept=dept;
}
public int getId( )
{
return this.id; 
}
public  String getName( )
{
return this.name;
}
public  String getDept( )
{
return this.dept;
}
}
class Day4Program5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Employee[] ob=new Employee[5];
for(int i=0;i<5;i++)
{
ob[i]=new Employee();
ob[i].setId(sc.nextInt());
ob[i].setName(sc.next());
ob[i].setDept(sc.next());
}
System.out.println("Details are:\n");
for(int j=0;j<5;j++ )
{
System.out.println("ID:"+ob[j].getId());
System.out.println("Name:"+ob[j].getName());
System.out.println("Name:"+ob[j].getDept());
}
}
}


