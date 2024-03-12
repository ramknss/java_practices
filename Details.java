//Java program to print name,rollno and fee of a student
import java.util.*;
class Details{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name:");
		String Name=sc.nextLine();
		System.out.print("Enter your Roll no:");
        long Roll=sc.nextLong();
		System.out.print("Enter your Fee:");
        double Fee=sc.nextDouble();
		System.out.println("My name is "+Name);
		System.out.println("My roll no is "+Roll);
		System.out.println("My Fee is "+Fee);
	}
}