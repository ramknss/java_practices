import java.util.*;
class Student_Marks{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter your ID:");
		int ID=sc.nextInt();
	   if(ID==2501){
		   
		System.out.println("Welcome!!!");
		//System.out.println("Press 1 to continue");
		String x=sc.nextLine();
		System.out.print("Name:");
        String Name=sc.nextLine();
        System.out.print("Roll No:");
        int roll=sc.nextInt();
        System.out.print("sub1 marks:");
        float sub1=sc.nextFloat();
        System.out.print("sub2 marks:");
        float sub2=sc.nextFloat();
        System.out.print("sub3 marks:");
        float sub3=sc.nextFloat();
        float Total=sub1+sub2+sub3;
        System.out.println(Name);
        System.out.println(roll);
        System.out.println(Total);
		float avg=Total/3;
		System.out.println(avg);
		if(avg>=90){
			System.out.println("FIRST CLASS!!!");
		}
		else if(avg>=75){
			System.out.println("Second class");
		}
		else if(avg>=60){
			System.out.println("Third class");
		}
		else if(avg>=40){
			System.out.println("PASS!!");
		}
		else{
			System.out.println("FAIL!!");
		}
	   }
	   else{
		   System.out.println("INVALID!!!");
	   }
        
    }
}