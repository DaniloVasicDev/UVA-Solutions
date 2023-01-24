import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        int x = 1;
        for(int i=0;i<t;i++){
            int l = s.nextInt();
            int w = s.nextInt();
            int h = s.nextInt();
            if(l<=20 && w<=20 && h<=20){
                System.out.println("Case "+x+": good");
                x++;
            }
            else{
                System.out.println("Case "+x+": bad");
                x++;
            }
        }
    }
}