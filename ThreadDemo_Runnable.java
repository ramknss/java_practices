class T2 implements Runnable{
	public void run(){
		System.out.println("This code is running in a thread");
	}
}
public class ThreadDemo_Runnable{
	public static void main(String args[]){
		T2 obj=new T2();
		Thread t1 =new Thread(obj);
		System.out.println(t1.getName());
		t1.start();
	}
}