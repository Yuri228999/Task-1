package ua.com.sourceit.Hello;
import java.util.Scanner;

public class SubTask1 {
	 public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  System.out.print("Введите первое чило: ");
	  double firstNumber = in.nextDouble();
	  System.out.print("Введите второе чило: ");
	  double secondNumber = in.nextDouble();
	  
	  double result = (double)(firstNumber + secondNumber) ;
	  System.out.print("Результат:");
	  System.out.printf("%1.1f", result);
	 }
}
