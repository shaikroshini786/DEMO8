class Student1
{
int rollno;
String name;
static String college="ITS";
static void change()
{
college="MTIEAT";
}
Student1(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
class Staticmethod
{
public static void main(String args[])
{
Student1 s1=new Student1(111,"karan");
Student1 s2=new Student1(112,"ayan");
s1.display();
s2.display();
Student1.change();
Student1 s3=new Student1(113,"rayan");
s1.display();
s2.display();
s3.display();
}
}
