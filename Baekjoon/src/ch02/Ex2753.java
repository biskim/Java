package ch02;

import java.util.Scanner;

public class Ex2753 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if(x%4==0 && x%100!=0 || x%400==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		
		
		sc.close();
	}

}
