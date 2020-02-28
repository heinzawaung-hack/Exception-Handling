package heinzawaung;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //File patch is only for Linux OS
        File file = new File("/home/heinzawaung/Videos/text.txt");

        try {
            readFile(file);
        } catch (FileNotFoundException e) {
            System.out.println("There is no File that you entered.");
            e.printStackTrace();
        }
        System.out.println("Continue main method after reading file.");
    }

    public static void readFile(File file) throws FileNotFoundException {
        Scanner scanner  = new Scanner(file);
        String name = scanner.nextLine();
        String nameOne = scanner.nextLine();
        System.out.println("File Found That you entered.");
        System.out.println(name);
        System.out.println(nameOne);
    }
}

