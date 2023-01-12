import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int T  = s.nextInt();
        int x = 1;
        while(T-->0){
            int N = s.nextInt()-1;
            int h = 0,l = 0;
            int current = s.nextInt();
            while (N-->0){
                int next = s.nextInt();
                if(current>next){
                    l++;
                }
                else if(current<next){
                    h++;
                }
                current = next;
            }
            System.out.println("Case "+x+": "+h+" "+l);
            x++;
        }
        s.close();
    }
}