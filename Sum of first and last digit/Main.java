import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int digits = (int)(Math.log10(num));  
      int firstDigit = (int)(num / (int)(Math.pow(10, digits))); 
      
        int lastDigit = num%10;
      int sum = firstDigit + lastDigit;
      System.out.println(sum);
      
	}
}