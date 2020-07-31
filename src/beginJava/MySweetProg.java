package beginJava;

import java.util.Scanner;

public class MySweetProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your name : ");
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		if(s.equals("Caleb")) {
			System.out.println("Hey " + s);
		}
		else if (s.equals("Sally")) {
			System.out.println("Hey " + s);
		}
		else {
			System.out.println("You are not welcome here!!!");
		}
		in.close();
	}

}
