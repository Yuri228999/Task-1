package ua.com.sourceit.Hello;

import java.util.Scanner;

public class SubTask5 {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.print("Введите число:");
		 int n = in.nextInt();
		 int count = 0;
		 for(int i = 1; i <= n ; i++) {
			 count = 0;
			 for(int b = 2; b<= i && count < 2; b++) {
				 if(i % b ==0) {
					 count ++;
				 	}
				 }
			 if(count <2 ) {
				 System.out.print(i+ " ");
			 }
		}
	}
}

