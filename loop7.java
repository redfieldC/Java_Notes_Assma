package ameya;

import java.util.Scanner;

public class loop7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int a = sc.nextInt();
		if (a%3==0 && a%2==0) {
			System.out.println(a + " is divisible by 3 and 2");
		}
		else {
			System.out.println(a + " is not divisble by 3 and 2");
		}
		
	}
}
