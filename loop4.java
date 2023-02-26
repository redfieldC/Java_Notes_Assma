package ameya;

import java.util.Scanner;

public class loop4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int a = sc.nextInt();
		if (a %5 ==0) {
			System.out.println("Hello");
		}
		else {
			System.out.println("Bye");
		}
		
	}
}
