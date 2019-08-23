import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       int numCount;
    int m =3;
       for(numCount = 1; numCount <= number; numCount++){
       System.out.print(numCount);
         if((numCount % m == 0) && (numCount != number)){
         System.out.print(",");
         }
       }
  }
}