
	class Me{
		int a;
		String b;
		int age;
		Me(int x,String s){
			a=x;
			b=s;
		}
		Me(int x,String s,int y){
			a=x;
			b=s;
			age=y;
		}
		void Display(){
			System.out.println(a+" "+b+" "+age);
		}
		public static void main(String args[]){
			Me ob1=new Me(100,"RAM");
			Me ob2=new Me(100,"RAM",19);
			ob1.Display();
			ob2.Display();
	}
		
		}
		

	