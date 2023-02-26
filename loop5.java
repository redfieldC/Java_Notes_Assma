package ameya;

import java.util.Scanner;

public class loop5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the bill: ");
		int a = sc.nextInt();
		if (a <=100) {
			System.out.println("No charge");
		}
		else if(a >  100 && a<=200) {
			System.out.println(100*5);
		}
		else {
			System.out.println(200*10);

		}
		
	}
}
