import java.util.Scanner;
public class Qs_03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int r = sc.nextInt(), p = 1;
        for(int i = r; i >= 1; i--){
            for(int j = (i-1); j >= 1; j--)
            System.out.print(" ");
            for(int k = 1; k <= p; k++)
            System.out.print("* ");
            p++;
            System.out.println();
        }
        sc.close();
    }
}