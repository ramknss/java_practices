class Parent{
	Parent(){
		System.out.println("This is Parent");
	}
}
class Base extends Parent{
	Base(){
		System.out.println("This is Child");
}
}
class Inherit{
	public static void main(String args[]){
		Base ob=new Base();
		
	}
}