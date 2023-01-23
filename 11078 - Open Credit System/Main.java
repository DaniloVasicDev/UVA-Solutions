import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=0;i<t;i++){
            int n = s.nextInt();
            for(int j=0;j<n;j++){
              int student = s.nextInt();
              System.out.println(student);
            }
        }
        s.close();
    }
}