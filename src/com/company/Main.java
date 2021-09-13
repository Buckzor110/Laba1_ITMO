package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//System.out.println("Hello, world!");
	//byte mun = 12;

	//String str="Hello, world!";
	//System.out.println(str);

	/* Scanner sc = new Scanner(System.in);
	System.out.println(sc.nextLine ());
	boolean isTrue = false;
	float first, second, res;
	int check;
	System.out.print("Enter first num: ");
	first = sc.nextFloat();
	System.out.print("Enter second num: ");
	second = sc.nextFloat();
	res = first>second && isTrue ? first+second : first*second;
	System.out.println("Result is: " + res);

	if (first == second){
		System.out.print("Вот это прикол!");
		System.out.print("\n");
	} */
	/* System.out.print("Enter check: ");
	check = sc.nextInt();
	switch (check){
		case 1:
			System.out.print("Опа!");
			break;
		case 2:
			System.out.print("Куда?");
			break;
		default:
			System.out.print("Я так не играю!");
	} */

	for (int i = 0; i < 100; i++)
		System.out.println(i);

	int j = 10, m = 10;
	while (j < 30){
		System.out.println(j);
		j++;
	}
	do {
		System.out.println(m);
		m++;
	}  while (m<14);
	}
}
