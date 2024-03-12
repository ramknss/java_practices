class OverloadDemo{
	void test(){
		System.out.println("No parameters");
	}
	void test(int a){
		System.out.println("a: "+a);
	}
	void test(int a,int b){
		System.out.println("a and b: "+a+" "+b);
	}
	void test(double a){
		System.out.println("double a: "+a);
		//return a*a;
	}
}
class Overload{
	public static void main(String args[]){
		OverloadDemo ob=new OverloadDemo();
		ob.test();
		ob.test(2);
		ob.test(2,3);
		ob.test(5.0);
	}
}