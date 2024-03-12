class DemoClass{
	int a;
	void display(){
		System.out.println("a= "+a);
	}
	static void show(){
		System.out.println("Hi");
	}
	DemoClass(){
		System.out.println("***WELCOME***");
	}
	public static void main(String args[]){
		DemoClass ob1=new DemoClass();
		System.out.println("a value is"+ob1.a);
		ob1.display();
		show();
	}
}