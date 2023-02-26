package ameya;

import java.util.Scanner;

public class loop13 {
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n1: ");
		int n1 = sc.nextInt();
		System.out.println("enter the n2: ");
		int n2 = sc.nextInt();
		System.out.println("enter the operator: ");
		char op = sc.next().charAt(0);
		switch(op) {
		case '+':
			System.out.println(n1 + n2);
			break;
		case '-':
			System.out.println(n1 - n2);
			break;
			
		case '*':
			System.out.println(n1 * n2);
			break;
			
		case '/':
			System.out.println(n1 / n2);
			break;
			
		case '%':
			System.out.println(n1 % n2);
			break;
		}
	}
}
