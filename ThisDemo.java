//this keyword:this keyword refers to the current object of method or constructor.this keyword is mainly used to differentiate between class attributes and the parameters that 
//hold the same name.
class X{
	int a,b;
	X(int a,int b){
		this.a=a;
		this.b=b;
	}
}
class ThisDemo{
	public static void main(String args[]){
		X ob=new X(5,6);
		System.out.println(ob.a+ob.b);
	}
}