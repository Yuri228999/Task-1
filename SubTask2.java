package ua.com.sourceit.Hello;

import java.util.Scanner;

public class SubTask2 {
	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.print("Введите первую строку: ");
		 String firstString = in.nextLine();
		 System.out.print("Введите вторую строку: ");
		 String secondString = in.nextLine();
		 
		 String result = firstString + " " + secondString;
		 System.out.print("Обьедененная строка:" + result);
		 
	 }
	 
}
