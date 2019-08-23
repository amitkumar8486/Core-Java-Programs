import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
       int n,first_digit, third_digit;
		Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      first_digit = n/100;
      third_digit = (n%100);
      int s = third_digit%10;
      System.out.println(first_digit+s);
		
	
	}
}