import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int firstDigit = num/100;
    int secondDigit = (num/10)%10;
    int thirdDigit = num%10;
    int reverseNum = thirdDigit*100 + secondDigit*10 + firstDigit*1;
    System.out.println(reverseNum);
    sc.close();
  }
}