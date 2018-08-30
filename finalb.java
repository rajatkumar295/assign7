final class finalb
{
 int a,b;
void display()
{
System.out.println("final class");
}
}
class access extends finalb
{
}
class main
{
public static void main(String[] args)
{
access s=new access();
s.display();
}
}