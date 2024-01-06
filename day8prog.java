class Counter1
{
int count=0;
Counter1()
{
count++;
System.out.println(count);
}
public static void main(String args[])
{
Counter1 c1=new Counter1();
Counter1 c2=new Counter1();
Counter1 c3=new Counter1();
}
}
/*

C:\DAY8>javac day8prog.java

C:\DAY8>java Counter1
1
1
1

*/