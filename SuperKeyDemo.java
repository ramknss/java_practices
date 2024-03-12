class Superclass{
	int a=10;
	void show(){
		System.out.println("super class a value is:"+a);
	}
}
class Subclass extends Superclass{
	int a=20;
	int sum;
	void show(){
		super.show();
		System.out.println("sub class a value is:"+a);
	}
	void sum(){
		System.out.println("Sum="+(super.a+a));
	}
}
class SuperKeyDemo{
	public static void main(String args[]){
		Subclass obj=new Subclass();
		obj.show();
		obj.sum();
	}
}
	