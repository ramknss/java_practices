class Box{
	double width,height,depth;
	Box(int x,int y,int z){
		width=x;
		height=y;
		depth=z;
	}
	void volume(){
		System.out.println("Volume is:");
		System.out.println(width*height*depth);
	}
}
class Boxdemo{
	public static void main(String args[]){
		Box ob= new Box(10,20,30);
		ob.volume();
	}
}