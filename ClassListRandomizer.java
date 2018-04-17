import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class ClassListRandomizer {

    public static void main (String args[]) {

        arrayListVersion();
        // arrayVersion();

    }
    public static void arrayListVersion() {
        ArrayList<String> names = new ArrayList<String>();
        try {
            File studentsFile = new File("students.txt");
            Scanner scanner = new Scanner(studentsFile);

            while (scanner.hasNext()) {
                names.add(scanner.nextLine());
            }
            Collections.shuffle(names);
            System.out.println(names);

        }
        catch (FileNotFoundException exc) {
            System.out.println(exc);
        }
        // now print two at a time on a line for pairings
        System.out.println("Random Pairings");
        int i=0;
        while (i<names.size()){
            System.out.print(names.get(i)+"+");
            i++;
            if (i<names.size()) {
                System.out.println(names.get(i));
            }

            i++;
        }
    }
    public static void arrayVersion() {
        String [] names = new String[30];
        try {
            File studentsFile = new File("students.txt");
            Scanner scanner = new Scanner(studentsFile);
            int i=0;
            while (scanner.hasNext()) {
                names[i]=scanner.nextLine();
                i++;
            }

        }
        catch (FileNotFoundException exc) {
            System.out.println(exc);
        }
        // now print two at a time on a line for pairings
        System.out.println("Random Pairings");
        System.out.println(names.length);
        int i=0;
        while (i<names.length){
            System.out.print(names[i]+"+");
            i++;
            if (i<names.length) {
                System.out.println(names[i]);
            }

            i++;
        }
    }
}
