// STATIC NESTED CLASS
class A
{
static int data=30;
static class B
{
void msg()
{
System.out.println("data is"+ data);
}
}
public static void main(String args[])
{
A.B obj=new A.B();
obj.msg();
}
}
