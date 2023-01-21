import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int x = 1;
        int max  = 0;
        while (T-->0){
            int N  = s.nextInt();
             for(int i =0;i<N;i++){
                 int num = s.nextInt();
                 if(num>max){
                     max = num;
                 }
             }
            System.out.println("Case "+x+": "+max);
            x++;
            max = 0;
            }
        }

    }
