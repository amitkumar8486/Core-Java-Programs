import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
         int n1 = sc.nextInt();
         int n2 = sc.nextInt();
         int n3 = sc.nextInt();
         gcd(n1,n2,n3);
	}
 public static void gcd(int x, int y , int z){
   int minElement, gcdd = 0;
     if((x<y) && (x<z)){
     minElement = x;
     }
   else if((y<x) && (y<z)){
     minElement = y;
   }
   else{
   minElement = z;
   }
   while(minElement>=1){
   if((x%minElement ==0) && (y % minElement == 0) && (z % minElement == 0)){
   gcdd = minElement;
     break;
   }
     minElement--;
     
   }
   System.out.print(gcdd);
 }
}