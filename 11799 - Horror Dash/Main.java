import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int x = 1;
        while (T-->0){
            int N = s.nextInt()-1;
            int cur = s.nextInt();
            int max = cur;
            while (N-->0){
                int next = s.nextInt();
                if(cur>next){
                    max = cur;
                }
                else if(cur<next){
                    max = next;
                }
            }
            System.out.println("Case "+x+": "+max);
            x++;
        }
        s.close();
    }
}