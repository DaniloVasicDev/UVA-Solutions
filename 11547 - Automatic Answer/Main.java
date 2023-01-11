import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int i = 0;

        while (i < t) {
            int n = s.nextInt();
            System.out.println((((((((n * 567) / 9) + 7492) * 235) / 47) - 498) / 10) % 10);
            i++;
        }
        s.close();
    }
}