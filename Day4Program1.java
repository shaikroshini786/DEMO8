class Student
{
private int id;
private String name;
public void setId(int id)
{
this.id=id;
}
public void setName( String name)
{
this.name=name;
}
public int getId( )
{
return this.id; 
}
public  String getName( )
{
return this.name;
}
}
class Day4Program1
{
public static void main(String args[])
{
Student ob1=new Student();
Student ob2=new Student();
Student ob3=new Student();
Student ob4=new Student();
Student ob5=new Student();
ob1.setId(1111);
ob1.setName("Test");
System.out.println("ID:"+ob1.getId());
System.out.println("Name:"+ob1.getName());
ob2.setId(1112);
ob2.setName("Test1");
System.out.println("ID:"+ob2.getId());
System.out.println("Name:"+ob2.getName());
ob3.setId(1113);
ob3.setName("Test3");
System.out.println("ID:"+ob3.getId());
System.out.println("Name:"+ob3.getName());
ob4.setId(1114);
ob4.setName("Test4");
System.out.println("ID:"+ob4.getId());
System.out.println("Name:"+ob4.getName());
ob5.setId(1115);
ob5.setName("Test5");
System.out.println("ID:"+ob5.getId());
System.out.println("Name:"+ob5.getName());
}
}



