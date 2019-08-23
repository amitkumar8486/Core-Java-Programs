import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      greatest(n1,n2,n3);
      
	}
  public static void greatest(int x,int y, int z){
  if((x>y) && (x>z)){
  System.out.println(x);
  }
    else if((y>x) && (y>z)){
    System.out.println(y);
    }
    else{
    System.out.println(z);
    }
  }
}