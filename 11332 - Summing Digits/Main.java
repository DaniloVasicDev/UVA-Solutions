import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(s.hasNextInt()){
            int n  = s.nextInt();
            if(n!=0){
                System.out.println(findDigit(n));
            }
            else{
                System.exit(0);
            }
        }
    }

    public static int findDigit(int n){
        String sum = Integer.toString(n);
        if(sum.length()==1){
            return n;
        }
        else{
            int x = 0;
            for(int i = 0;i<sum.length();i++){
                x+=Integer.parseInt(String.valueOf(sum.charAt(i)));
            }
            return findDigit(x);
        }
    }
}