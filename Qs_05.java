import java.util.Scanner;
public class Qs_05{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int r = sc.nextInt();
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= i; j++)
            System.out.print((char)('A' + i - 1) + " ");
            System.out.println();
        }
        sc.close();
    }
}