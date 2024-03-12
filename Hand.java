class Hand{
	public static void main(String args[]){
		try{
			System.out.println("HI BRO");
			System.out.println(100/0);
		}
		catch(Exception e){
			System.out.println("Exception ra unga");
		}
		finally{
		System.out.println("RAM");
		}
	}
}