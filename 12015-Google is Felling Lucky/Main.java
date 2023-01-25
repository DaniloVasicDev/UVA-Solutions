import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        int t = s.nextInt();
        s.nextLine();
        int x =0;
        int a  =1;
        int max = 0;
        ArrayList<String> arrayList = new ArrayList<>();
        while (x<t){
            for(int i=0;i<10;i++){
                arrayList.add(s.nextLine());
            }
            for(int i=0;i< arrayList.size();i++){
                String[] num = arrayList.get(i).split(" ");
                if(Integer.parseInt(num[1])>max){
                    max = Integer.parseInt(num[1]);
                }
            }
            out.println("Case #"+a+":");
            for(int i=0;i<arrayList.size();i++){
                String[] num = arrayList.get(i).split(" ");
                if(max == Integer.parseInt(num[1])){
                    out.println(num[0]);
                }
            }
            arrayList.clear();
            x++;
            a++;
            max = 0;
        }
    }
}