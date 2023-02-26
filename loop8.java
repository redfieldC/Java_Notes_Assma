package ameya;

import java.util.Scanner;

public class loop8 {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the p1: ");
	int p1 = sc.nextInt();
	System.out.println("enter the p2: ");
	int p2 = sc.nextInt();
	System.out.println("enter the p3: ");
	int p3 = sc.nextInt();
	System.out.println("enter the p4: ");
	int p4 = sc.nextInt();
	if (p1 < p2 && p1 <p3 && p1 <p4) {
		System.out.println(p1 + " is smallest");
	}
	else if (p2 < p1 && p2 < p3 && p2 < p4) {
		System.out.println(p2 + " is smallest");
	}
	else if (p3 < p1 && p3 < p2 && p3 <p4) {
		System.out.println(p3 + " is smallest");
	}
	else if (p4 < p1 && p4 < p2 && p4 <p3) {
		System.out.println(p4 + " is smallest");
	}
}
}
