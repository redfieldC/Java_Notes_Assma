package ameya;

import java.util.Scanner;

public class loop3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age: ");
		int a = sc.nextInt();
		if (a % 7==0) {
			System.out.println(a + " is divisible by 7");
		}
		else {
			System.out.println(a + " is not divisible by 7");
		}
		
	}
}
