import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        int numOf0 = 0;
        int sum =0;
        int x =0;
        while(x<t){
            String word = s.nextLine().toUpperCase();
            for(int i=0;i<word.length();i++) {
                if (word.charAt(i) == 'O') {
                    numOf0++;
                }
                else if (word.charAt(i) == 'X') {
                    numOf0 = 0;
                }
                 sum+=numOf0;
            }
            System.out.println(sum);
            x++;
            sum = 0;
            numOf0 =0;
        }
    }
}