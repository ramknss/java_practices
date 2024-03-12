interface Draw{
void draw();
default void msg(){
System.out.println("default method");
}
static int cube(int x){
return x*x*x;
}
}
class Shape implements Draw{
public void draw(){
System.out.println("drawing a shape");
}
public void msg(){
System.out.println("default method implements");
}
}
class TestInterfaceDefault{
public static void main(String[] args){
Draw d= new Shape();
d.draw();
d.msg();
System.out.println(Draw.cube(3));
}
}
