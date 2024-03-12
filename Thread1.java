class mythread extends Thread{
	public void run(){
		System.out.println("My name is Sai Sreeram Kandukuri");
		System.out.println("My roll no is 100");
		setName("RAM");
		System.out.println(getName());
		System.out.println(getState());
	}
}
class Thread1{
	public static void main(String args[]){
		mythread ob=new mythread();
		ob.run();
	}
}