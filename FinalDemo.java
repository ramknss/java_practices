class A{
final void display(){
System.out.println("This is parent method final");
}
}
class B extends A
{
void display1()
{
System.out.println("This is child method");
}
}
class FinalDemo{
public static void main(String[] args){
A o1=new A();
B ob=new B();
o1.display();
ob.display1();
}
}
