package com.java.j001;

import java.util.Scanner;

public class Switch_Ex {

	public static void main(String[] args) {

		Scanner se = new Scanner(System.in);

		System.out.println("enter an operation");
		System.out.println("1.check Even or Odd");
		System.out.println("2.Factorial Number");
		System.out.println("3.Fibonaacci Series");
		// n = se.nextInt();

		int choice = se.nextInt();

		switch (choice) {
		case 1:
			System.out.println("enter a number");
			int con = se.nextInt();
			if (con % 2 == 0) {
				System.out.println("even number");
			} else {
				System.out.println("odd number");
			}
			break;
		case 2:
			System.out.println("enter a number");
			int n = se.nextInt();
			long fact = 1;
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
			System.out.println(fact);
			break;
		case 3:
			System.out.println("Enter a number");
			int NumberOfTerms = se.nextInt();
			int FirstTerm = 0;
			int SecondTerm = 1;
			System.out.println("Fibinocci Series : ");
			System.out.print(FirstTerm + "  " + SecondTerm + "  ");
			for (int i = 2; i < NumberOfTerms; i++) {
				int NextTerm = FirstTerm + SecondTerm;
				System.out.print(NextTerm + "  ");
				FirstTerm = SecondTerm;
				SecondTerm = NextTerm;
			}
			break;
		default:
			System.out.println("invalid option");

		}
	}
}
