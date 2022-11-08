package ua.com.sourceit.Hello;
public class Hello {
	 public static void main(String[] args) {
		 System.out.println("SubTask1:");
		 SubTask1.main(new String[] {"5", "6"});
		 System.out.println("\n\nSubTask2:");
		 SubTask2.main(new String[] {"string1", "string2"});
		 System.out.println("\n\nSubTask3:");
		 SubTask3.main(new String[] {"5", "6"});
		 System.out.println("\n\nSubTask4:");
		 SubTask4.main(new String[] {"45"});
		 System.out.println("\n\nSubTask5");
		 SubTask5.main(new String[] {"10"});
		 System.out.println("\n\nSubTask6");
		 SubTask6.main(null);
	 }
}
