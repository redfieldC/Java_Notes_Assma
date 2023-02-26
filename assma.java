package ameya;
import java.util.Scanner;
public class assma {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age: ");
		int a = sc.nextInt();
		if (a >= 18) {
			System.out.println("you are eligible to vote");
		}
		else {
			System.out.println("you are not eligible to vote");
		}
		
	}
}
