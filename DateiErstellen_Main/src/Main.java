import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        try {
            FileReader IR = new FileReader("../Testdatei.txt");
            BufferedReader test = new BufferedReader(IR);
            System.out.println(test.readLine());


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {

        }
    }
}
