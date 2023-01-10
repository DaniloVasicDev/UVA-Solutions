import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int i = 0;
        while(i<x){
            int n  = s.nextInt();
            int m = s.nextInt();
            System.out.println((n/3)*(m/3));
            i++;
        }
        s.close();
    }
}