import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sd =0;
        while (num >= 10) {
            sd = num%10;
            num/=10;

        }
        System.out.println(sd);

    }
}