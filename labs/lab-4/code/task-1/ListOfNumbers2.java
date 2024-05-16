import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;


public class ListOfNumbers2 {

    private ArrayList<Integer> arr;
    private static final int SIZE = 10;

    public ListOfNumbers2() {
        arr = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++)
            arr.add(new Integer(i));
    }

    public void readList() {
        File file = new File("infile.txt");

        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.err.println("Cannot open input file: " + e.getMessage());
            return;
        }

        while (scanner.hasNext()) {
            if (!scanner.hasNextInt()) {
                System.err.printf(
                    "Invalid value: %s. Skipped it\n",
                    scanner.next()
                );
                continue;
            }
            int value = scanner.nextInt();
            System.out.println("Read value: " + value);
            arr.add(new Integer(value));
        }
    }

    public void writeList() {
        PrintWriter out = null;

        try {
            out = new PrintWriter(new FileWriter("outfile.txt"));

            for (int i = 0; i < arr.size(); i++) {
                out.println("Value at: " + i + " = " + arr.get(i));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(
                "Caught ArrayIndexOutOfBoundsException: "
                + e.getMessage()
            );
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }

    public static void main(String[] args) {
        ListOfNumbers2 list = new ListOfNumbers2();
        list.readList();
        list.writeList();
    }
}
