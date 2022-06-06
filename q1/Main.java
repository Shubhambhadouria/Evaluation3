package com.q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements to enter in array");
		int noofelements = sc.nextInt();
		
		
		System.out.println("Enter Elements in array");
		int[] elements = new int[noofelements];
		
		for(int i=0; i<noofelements; i++)
		{
			elements[i] = sc.nextInt();
		}
		
		System.out.println("Enter index of array to find");
		int elemind = sc.nextInt();
		try {
			for(int i=0; i<elements.length; i++)
			{
				System.out.println(elements[elemind]);
			}
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException");			
		}
		
	}

}
