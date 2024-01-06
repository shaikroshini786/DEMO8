import java.util.Scanner;
class Trainer
{
private int tid;
public void setTid(int tid)
{
this.tid=tid;
}
public int getTid()
{
return this.tid;
}
public Trainer(int tid)
{
this.tid=tid;
}
public Trainer()
{
this.tid=0;
}
}
class Test1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
for(int i=0;i<5;i++)
Trainer ob1=new Trainer(sc.nextInt());
{
ob1[i]=new Trainer();
ob1[i].setTid(sc.nextInt());
}
System.out.println("Details are:\n");
for(int j=0;j<5;j++ )
{
System.out.println("Tid:"+ ob1[j].getTid());
}
}
}
