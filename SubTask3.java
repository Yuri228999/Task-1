package ua.com.sourceit.Hello;

import java.util.Scanner;

public class SubTask3 {
	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		  System.out.print("Введите первое чило: ");
		  double firstNumber = in.nextDouble();
		  System.out.print("Введите второе чило: ");
		  double secondNumber = in.nextDouble();
		  int result = 0;
		for(int i = 1 ; i <= Math.max(firstNumber, secondNumber); i++) {
			if(firstNumber % i ==0 && secondNumber % i == 0) {
				result = i;
			}
		}
		System.out.print("Наибольший общий делитель:" + result);
	}
}
