package beginJava;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your First Name : ");
		String fname = sc.nextLine();
		System.out.println("Enter Your Second Name : ");
		String lname = sc.nextLine();
		
		System.out.println("Good Morning " +fname + " " +lname);
	}
}