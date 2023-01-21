import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x = 1;
        while(s.hasNext()){
            int t = s.nextInt();
            if(t!=0){
                int pos =0;
                int neg = 0;
                for(int i = 0;i<t;i++){
                    int num = s.nextInt();
                    if(num==0){
                        neg++;
                    }
                    else{
                        pos++;
                    }
                }
                int ans = pos - neg;
                System.out.println("Case "+x+": "+ans+"");
                x++;
            }
           else{
               break;
            }
        }
        s.close();
    }
}