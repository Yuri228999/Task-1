package ua.com.sourceit.Hello;
import java.util.Scanner;
public class SubTask6 {
	public static void main(String[] args) {
		System.out.println("Введите буквенный номер");
		Scanner in = new Scanner(System.in);
		String letters = in.nextLine();
		methodFirst(letters);
		methodSecond();
		methodThird();
	}
	
	public static void methodFirst(String letter) {
			int firstResultNumber = 0;
				int firstNumber = 0;
				
				switch(letter.length()) {
					case 1:
					firstResultNumber = letter.charAt(0) - 64;
					System.out.println("Числовой номер" + " " + firstResultNumber);
					break;
					case 2:
					for(int i = 1; i <= letter.charAt(0) - 64; i++) {
						firstNumber = 0;
						firstNumber = 26 * i;
					}
						firstResultNumber = firstNumber + letter.charAt(1) - 64;
					System.out.println("Числовой номер" + " " + firstResultNumber);
					break;
					}
			
		}
	
	public static void methodSecond() {
		System.out.println("Введите числовой номер");
			Scanner in = new Scanner(System.in);
			int firstNumber = in.nextInt();
			int secondNumber = 0;
			int thirdNumber = 0;
			int fourNumber = 0;
			
			if(firstNumber <= 26 ) {
				secondNumber = 64 + firstNumber;
				 System.out.print((char)secondNumber);
			}else {
				 fourNumber = firstNumber / 26;
				 thirdNumber = firstNumber%26;
				 if(thirdNumber == 0) {
					 char secondLetter = (char)(thirdNumber + 90);
					 char firstLetter = (char)(fourNumber + 63);
					 System.out.print(firstLetter +""+ secondLetter);
				 }else {
					 char firstLetter = (char)(fourNumber + 64);
					 char secondLetter = (char)(thirdNumber + 64);
					 System.out.println("Буквенное значение" + " " + firstLetter +""+ secondLetter);
				 }
			}			
		}
	
	public static void methodThird() {
		System.out.println("Введите буквенный номер");
		Scanner in = new Scanner(System.in);
		String letters = in.nextLine();
		int firstResultNumber = 0;
		int firstNumber = 0;
		int res = 0;
		
		switch(letters.length()) {
			case 1:
			firstResultNumber = letters.charAt(0) - 64;
			res = firstResultNumber + 1;
			System.out.println("Номер столбца справа" + " " + res);
			break;
			case 2:
			for(int i = 1; i <= letters.charAt(0) - 64; i++) {
				firstNumber = 0;
				firstNumber = 26 * i;
			}
				firstResultNumber = firstNumber + letters.charAt(1) - 64;
				res = firstResultNumber + 1;
			System.out.println("Номер столбца справа" + " " + res);
			break;
			}
	}
}







































/*  public static int chars2digits(String number) {
  int digit = 0;
  for (int i = number.length(); i > 0; i--) {
   digit += (int) (number.charAt(number.length() - i) - 64)
     * Math.pow(26, number.length() - i);
  }
  return digit;
 }
 
 public static String digits2chars(int number) {
  String chars = "";
  String charsMirror = "";
  int modul;
  int divident = number;
  while (divident != 0) {
   modul = divident % 26;
   if (modul == 0) {
    chars += "Z";
    divident = (divident - 1) / 26;
   } else {
    chars += (char) (modul + 64);
    divident = (divident - modul) / 26;
   }
  }
  for (int i = 0; i < chars.length(); i++)
   charsMirror += chars.charAt(chars.length() - i - 1);
  return charsMirror;

 }

 public static String rightColumn(String number) {
  String chars = "";
  int num;
  num = chars2digits(number);
  num++;
  chars = digits2chars(num);
  return chars;
 }

 public static void main(String[] args) {
  int digit1 = Integer.parseInt(args[0]);
  String char1 = String.valueOf(args[1]);
  String char2 = String.valueOf(args[2]);
  System.out.println(char1 + " --> " + SubTask6.chars2digits(char1));
  System.out.println(digit1 + " --> " + SubTask6.digits2chars(digit1));
  System.out.println(char2 + " --> " + SubTask6.rightColumn(char2));
 }
*/
