//Static:A static keywors is a non acess modifier used for variables and methods.A static method or variable can be acessed without creating a object.it is used to refer the 
//the common property of all tha objects.
class Stat{
	int rollno;
	String name;
	static String college="SRMAP";
}
class StaticDemo{
	public static void main(String args[]){
		Stat ob=new Stat();
		ob.college="x";
		System.out.println(ob.rollno+ob.name+ob.college);
	}
}