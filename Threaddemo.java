class T1 extends Thread{
	public void run()
	{
		System.out.println("Inside");
		System.out.println(getName());
		setName("CSEB");
		System.out.println(getName());
		System.out.println(getPriority());
		System.out.println(getState());
	}
}
class T2 extends Thread{
	public void run()
	{
		System.out.println("Inside");
		System.out.println(getName());
		setName("Second Thread");
		System.out.println(getName());
		System.out.println(getPriority());
		System.out.println(getState());
	}
}
class Threaddemo
{
	public static void main(String args[])
	{
		T1 t1=new T1();
		System.out.println(t1.getState());
		t1.start();
		T2 t2=new T2();
		t2.start();
		try{
			t1.sleep(2000);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Outside");
	}
}
