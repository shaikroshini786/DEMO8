// JAVA PROGRAM TO DEMONSTRATE THE USE OF STATIC VARIABLE
class Student
{
int rollno;
String name;
static String college="mtiet";
Student(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
public class TestStaticVariable1
{
public static void main(String args[])
{
Student s1=new Student(112,"roshini");
Student.college="mtieat";
s1.display();
}
}