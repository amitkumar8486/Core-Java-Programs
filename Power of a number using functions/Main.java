import java.util.Scanner;
import java.lang.Math;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    int exponent = sc.nextInt();
    power(base,exponent);
  }
  
  public static void power(int b, int e){
  int p = (int)Math.pow(b,e);
    System.out.print(p);
  }
}