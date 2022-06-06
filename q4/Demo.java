package com.q4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username");
		CharSequence username = sc.next();
		System.out.println(Pattern.matches("[a-zA-Z]{8}",username));
		
		System.out.println("Enter Password");
		CharSequence password = sc.next();
		System.out.println(Pattern.matches("[a-zA-Z0-9]{8}",password));
		
		System.out.println("Enter Mobile");
		CharSequence Mobile = sc.next();
		System.out.println(Pattern.matches("[6789]{1}[0-9]{9}",Mobile));
		
		System.out.println("Enter email");
		CharSequence email = sc.next();
		System.out.println(Pattern.matches("",email));
		
	}

}
