import java.util.Scanner;
public class Qs_09{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int r = sc.nextInt(); 
        int p = r;
        for(int i = 1; i <= r; i += 2){
            for(int j = (r-i); j < r; j++)
            System.out.print(" ");
            for(int k = 1; k <= p; k++)
            System.out.print("* ");
            p -= 2;
            System.out.println();
        }
        sc.close();
    }
}