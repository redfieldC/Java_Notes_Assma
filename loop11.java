package ameya;

import java.util.Scanner;

public class loop11 {
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int number = sc.nextInt();
		int count=0;
		int rem=99999999;
		while (rem > 0) {
			rem = number % 10;
			count++;
		}
		if (count==3) {
			System.out.println("number is 3 digit");
		}
		else {
			System.out.println("number is not 3 digit");
		}
	}
}
