import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int i = 0;
        while (i < t) {
            int n = s.nextInt();
            int ans = ((((((((n * 567) / 9) + 7492) * 235) / 47) - 498) / 10) % 10);
            System.out.println(Math.abs(ans));
            i++;
        }
        s.close();
    }
}