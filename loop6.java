package ameya;

import java.util.Scanner;

public class loop6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int a = sc.nextInt();
		if (a > 99 && a <1000) {
			System.out.println(a + " is divisible by 3");
		}
		else {
			System.out.println(a + " is not divisble by 3");
		}
		
	}

}
