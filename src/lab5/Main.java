package lab5;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        String res = "";
        try (BufferedReader reader = new BufferedReader(new FileReader("files/input"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                res = res + line + " ";
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException during file reading: " + e.getMessage());
        }

        RarestWordFinder rarestWordFinder = new RarestWordFinder(res);
        String rarestWord = rarestWordFinder.findRarestWord();

        System.out.println("rarestWord = " + rarestWord);

    }
}
