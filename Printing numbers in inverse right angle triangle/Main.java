import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int r = 1; r<=n; r++){
        int num =r;
      for(int c =1; c<=(n-(r-1)); c++){
      System.out.print(n-(num-1));
      num++;
      }
        System.out.print("\n");
	}
}
}