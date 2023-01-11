import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String word = "";
        while (s.hasNext()) {
            word = s.nextLine();
            if(!word.equals("#")) {
                switch (word) {
                    case "HELLO":
                        System.out.println("Case 1: ENGLISH");
                        break;
                    case "HOLA":
                        System.out.println("Case 2: SPANISH");
                        break;
                    case "HALLO":
                        System.out.println("Case 3: GERMAN");
                        break;
                    case "BONJOUR":
                        System.out.println("Case 4: FRENCH");
                        break;
                    case "CIAO":
                        System.out.println("Case 5: ITALIAN");
                        break;
                    case "ZDRAVSTVUJTE":
                        System.out.println("Case 6: RUSSIAN");
                        break;
                    default:
                        System.out.println("UNKNOWN");
                        break;
                }
            }
            else{
                System.exit(0);
            }
        }
    }
}