abstract class X
{
abstract void display();
void show()
{
System.out.println("Hi");
}
}

class Y extends X
{
void display()
{
System.out.println("This is called method");
}
void happy()
{
System.out.println("Happy");
}
}

class AbstarctDemo
{
public static void main(String args[])
{
Y obj = new Y();
obj.display();
obj.show();
obj.happy();
}
}
