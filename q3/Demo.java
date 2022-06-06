package com.q3;

import java.util.Scanner;

public class Demo {

	void showDetails(Month m) {
		try {
			System.out.println("This is the  Month of the Year "+ m);
		}
		catch(Exception e){
			System.out.println("Inavlid Month");
		}
	}
	public static void main(String[] args) {
		Demo d1 = new Demo();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month");
		String mname = sc.next();
		Month m = Month.valueOf(mname);
		d1.showDetails(m);
	}
	
}
