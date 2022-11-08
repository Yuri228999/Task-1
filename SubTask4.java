package ua.com.sourceit.Hello;

import java.util.Scanner;

public class SubTask4 {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		  System.out.print("Введите чило: ");
		  int n = in.nextInt();
		  int sum = 0;
		
		  while(n!=0) {
			sum += n % 10;
			n /= 10;
		}
		  System.out.print("Сумма всех розрядов:" + sum);
	}
}
