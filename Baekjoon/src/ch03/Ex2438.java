package ch03;

import java.util.Scanner;

public class Ex2438 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		
		for(int i = 1; i <=K; i++) {
			for(int j=1; j<=i; j++)
			
				System.out.print("*");
			System.out.println();
		}
		
	}

}
