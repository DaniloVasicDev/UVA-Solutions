import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int numOf0 = 0;
        int sum =0;
        int x =0;
        while(x<t){
            String word = s.nextLine().toUpperCase();
            boolean isPrevoisX = true;
            for(int i=0;i<word.length();i++) {
                if (word.charAt(i) == 'O' && isPrevoisX) {
                    numOf0++;
                    isPrevoisX = false;
                }
                else if(word.charAt(i) == 'O' && !isPrevoisX){
                    numOf0++;
                }
                else if (word.charAt(i) == 'X') {
                    isPrevoisX = true;
                    numOf0 = 0;
                }
                 sum+=numOf0;
            }
            System.out.println(sum);
            x++;
        }
    }
}