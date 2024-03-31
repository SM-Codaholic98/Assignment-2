import java.util.Scanner;
public class Qs_10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int r = sc.nextInt(), p = 1;
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= i; j++){
            System.out.print(p++);
            System.out.print(' ');
            }
            System.out.println();
        }
        sc.close();
    }
}