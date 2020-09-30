
public class Chapter08 {
  public static void main(String[] args) {
	  int number = 1;
	  while (number < 5) {
		  System.out.println(number * number);
		  number++;
	  }

	  int array[] = { 1, 3, 6, 10 };
	  for (int i = 0; i < array.length; i++) {
		  System.out.println(array[i]);
	  }

	  for (int number2 : array) {
		  if (number2 % 2 == 0) {
			  continue;
		  }
		  System.out.println(number2);
	  }
  }
}
