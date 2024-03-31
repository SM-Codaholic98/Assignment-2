import java.util.Scanner;
public class Qs_02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int r = sc.nextInt();
        for(int i = 1; i <= r; i += 2){
            for(int j = 1; j <= i; j++)
            System.out.print("* ");
            System.out.println();
        }
        sc.close();
    }
}