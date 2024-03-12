import java.util.Scanner;

public class As {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character:");
        char ch = sc.next().charAt(0);
        int y = (int) ch;
        
        System.out.println(y);
        System.out.println(Integer.toBinaryString(y));
        System.out.println(Integer.toHexString(y));
        System.out.println(Integer.toOctalString(y));
        
    }
}
