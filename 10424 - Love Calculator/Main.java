import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()){
            String firstName = s.nextLine().toLowerCase();
            String secondName = s.nextLine().toLowerCase();
            calculateLove(firstName,secondName);
        }
    }
    public static void calculateLove(String firstName,String secondName){
        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        int fnSum = 0;
        int snSum = 0;
        for(int i =0;i<firstName.length();i++){
            char c = firstName.charAt(i);
            if(c>='a' && c<='z'){
                fnSum +=(c-'a')+1;
            }
        }
        for(int i=0;i<secondName.length();i++){
            char c = secondName.charAt(i);
            if(c>='a' && c<='z') {
                snSum += (c - 'a') + 1;
            }
        }
        firstName = Integer.toString(fnSum);
        secondName = Integer.toString(snSum);
        System.out.println(df.format(calculateSum(firstName,secondName))+" %");
    }

    public static double calculateSum(String firsNameS,String secondNameS){
        if(firsNameS.length()!=1 || secondNameS.length()!=1){
            int x = 0;
            int a = 0;
            for(int i =0;i<firsNameS.length();i++){
                x+=Integer.parseInt(firsNameS.charAt(i)+"");
            }
            for(int i=0;i<secondNameS.length();i++){
                a+=Integer.parseInt(secondNameS.charAt(i)+"");
            }
            return calculateSum(Integer.toString(x),Integer.toString(a));
        }
        else{
            double firstNum = Double.parseDouble(firsNameS);
            double secondNum = Double.parseDouble(secondNameS);
            if(firstNum<secondNum){
                return firstNum*100/secondNum;
            }
            else{
                return secondNum*100/firstNum;
            }

        }

    }
}