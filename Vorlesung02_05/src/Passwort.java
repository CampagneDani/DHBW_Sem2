import java.util.Scanner;

public class Passwort {

    public static void main(String[] args) {
        Scanner passwort = new Scanner(System.in);
        String pw = passwort.nextLine();

        public static boolean isValidPassword
        {
            boolean isValid = true;

            if (pw.length() < 10) {
                System.out.println("Passwort muss länger als 10 Zeichen sein");
                isValid = false;
            }
            String großBuchstaben = "(.*[A-Z].*)";
            if (!pw.matches(großBuchstaben)) {
                System.out.println("Passwort muss mindestens einen Großbuchstaben enthalten");
                isValid = false;
            }
            String kleinBuchstaben = "(.*[a-z].*)";
            if (!pw.matches(kleinBuchstaben)) {
                System.out.println("Passwort muss mindestens einen kleinbuchstaben enthalten");
                isValid = false;
            }
            String nummeric = "(.*[0-9].*)";
            if (!pw.matches(nummeric)) {
                System.out.println("Password must have atleast one number");
                isValid = false;
            }
            String sonderZeichen = "(.*[@,#,$,%].*$)";
            if (!pw.matches(sonderZeichen)) {
                System.out.println("Passwort muss mindestens ein Sonderzeichen enthalten");
                isValid = false;
            }
            return isValid;
        }
    }
}
