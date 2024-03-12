class DefaultConstructor{
	int Roll_no;
	String Name;
	DefaultConstructor(){
		System.out.println("Welcome to java");
		System.out.println("Student Roll_no:"+Roll_no);
		System.out.println("Student Name:"+Name);
	}
	public static void main(String args[]){
		DefaultConstructor b=new DefaultConstructor();
	}
}	