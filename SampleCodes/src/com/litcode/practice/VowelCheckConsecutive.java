package com.litcode.practice;

import java.util.Scanner;

public class VowelCheckConsecutive {

	public static void main(String[] args) {
		System.out.println("enter a sentence");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String st1 = st.toUpperCase()+" ";
		int p = st1.length()-1;
//		System.out.println(p);
		int i, ck = 0;
		for (i = 0; i < p; i++) {
			char c = st1.charAt(i);
			char ch = ' ';
//			System.out.println("Checking the index..." + i);
//			System.out.println("Checking the aside index..." + (i + 1));
			
			ch = st1.charAt(i + 1);
			if ((c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
					&& (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
				ck++;
			}
			
		}
		System.out.println("Number of consecutive vowels are: "+ck);
		sc.close();
	}
}
