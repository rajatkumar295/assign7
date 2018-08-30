class dfault
{
int a,b;
dfault()
{
a=5;
b=6;
System.out.println("inside default:"+" "+a+" "+b);
}
dfault(int x,int y)
{this();
a=x;
b=y;
System.out.println("inside parameterized:"+" "+a+" "+" "+b);
}
}
class main
{
public static void main(String[] args)
{
dfault d=new dfault(1,2);
}
}