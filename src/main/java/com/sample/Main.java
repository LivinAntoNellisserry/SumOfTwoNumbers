package com.sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number:");
		num1 = sc.nextInt();
		System.out.print("Enter 2nd Number:");
		num2 = sc.nextInt();
		System.out.println("Sum:"+(num1+num2));
		sc.close();

	}

}
