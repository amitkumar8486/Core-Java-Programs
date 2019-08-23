import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   
   Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int starCount;
    for(starCount = 1; starCount<=number; starCount++){
      System.out.println("*");
  }
  }
}