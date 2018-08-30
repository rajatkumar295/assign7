class parent
{
void display()
{
System.out.println("inside parent class");
}
}
class child extends parent
{
void display()
{
super.display();
System.out.println("inside child class");
}
}
class main
{
public static void main(String[] args)
{
child c=new child();
c.display();
}
}