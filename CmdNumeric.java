class CmdNumeric{
	public static void main(String args[]){
		int sum=0;
		for(String str:args){
			int argument=Integer.parseInt(str);
			sum+=argument;
		}
		System.out.println("Sum="+sum);
	}
}