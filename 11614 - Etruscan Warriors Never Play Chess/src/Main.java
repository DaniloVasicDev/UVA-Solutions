import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        while(s.hasNext()){
            int v = s.nextInt();
            int t = s.nextInt();
            System.out.println(2*(v*t));
        }
    }
}
