package lt.kaunascoding;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainFacade {

    public static void main(String[] args) {
        File file = new File("data.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
//while sc has next
//String type; String name; float weight, flaot height; float action