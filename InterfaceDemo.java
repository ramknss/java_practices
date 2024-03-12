interface Parent{
	void character();
}
class Mom implements Parent{
	public void character(){
		System.out.println("This is MOM");
	}
}
class Dad implements Parent{
	public void character(){
		System.out.println("This is DAD");
	}
}
class InterfaceDemo{
	public static void main(String args[]){
		Parent ob=new Mom();
		Parent ob1=new Dad();
		ob.character();
		ob1.character();
	}
}