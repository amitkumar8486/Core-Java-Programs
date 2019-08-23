import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
	    int number, temp, reminder, sum = 0, i, factorial;
		
      number = sc.nextInt();
      for(temp = number; temp > 0; temp = temp /10)
		{
			factorial = 1; 
			
		    reminder = temp % 10;
		    for(i = 1; i <= reminder; i++)
		    {
		     	factorial = factorial * i;
		    }
		   
		     sum = sum + factorial;
       
		}
       if ( number == sum )
		{
			System.out.println("Yes");
		}
		else
		{
		   System.out.println("No");
		}
	}
}