import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        s.nextInt();
        while(s.hasNextInt())
        {
            int n = s.nextInt();
            int i = (int) Math.floor(Math.sqrt((2 * n) + 0.25) - 0.5);
            System.out.println(i);
        }
        s.close();
    }
}
