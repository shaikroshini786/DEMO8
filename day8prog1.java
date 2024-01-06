class Student
{
int rollno;
String name;
static String college="ITS";
static void change()
{
college="MTIEAT";
}
Student(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+""+name+""+college);
}
}
class Staticmethod
{
public static void main(String args[])
{
Student s1=new Student(111,"karan");
Student s2=new Student(112,"ayan");
Student.change();
Student s3=new Student(113,"rayan");
}
}
