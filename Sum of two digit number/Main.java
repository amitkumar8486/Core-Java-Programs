import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int fd = n/10;
      int ld = n%10;
      System.out.println(fd+ld);
	}
}