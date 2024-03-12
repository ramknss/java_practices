// Use a BufferedReader to read characters from the console.
import java.io.*;
class BRRead {
public static void main(String args[]) throws IOException
{
String c;
BufferedReader br = new
BufferedReader (new InputStreamReader (System.in));
System.out.println("Enter characters, 'quit' to quit.");

do {
c =  br.readLine();
System.out.println(c);
} while (!c.equals("quit"));
}
}