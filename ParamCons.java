class ParamCons{
	int id;
	String Name;
	ParamCons(int i,String n){
		id=i;
		Name=n;
	}
	void display(){
		System.out.println(id+" "+Name);
	}
	public static void main(String args[]){
		ParamCons s1=new ParamCons(100,"Sreeram");
		s1.display();
	}
}