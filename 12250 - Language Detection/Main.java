import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String word = "";
        int i = 1;
        while (s.hasNext()) {
            word = s.nextLine();
            if(!word.equals("#")) {
                switch (word) {
                    case "HELLO":
                        System.out.println("Case "+i+": ENGLISH");
                        break;
                    case "HOLA":
                        System.out.println("Case "+i+": SPANISH");
                        break;
                    case "HALLO":
                        System.out.println("Case "+i+": GERMAN");
                        break;
                    case "BONJOUR":
                        System.out.println("Case "+i+": FRENCH");
                        break;
                    case "CIAO":
                        System.out.println("Case "+i+": ITALIAN");
                        break;
                    case "ZDRAVSTVUJTE":
                        System.out.println("Case "+i+": RUSSIAN");
                        break;
                    default:
                        System.out.println("Case "+i+": UNKNOWN");
                        break;
                }
                i++;
            }
            else{
                System.exit(0);
            }
        }
    }
}