import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileScanInteractive {

    public int countTokens(String file, String search) throws IOException {
        int instanceCount = 0;
        try (
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            Scanner s = new Scanner(br)
        ) {
            s.useDelimiter("\\W");
            while (s.hasNext()) {
                if (search.equalsIgnoreCase(s.next().trim())) {
                    instanceCount++;
                }
            }
        }
        return instanceCount;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Expected filename");
            System.exit(-1);
        }

        String file = args[0];
        FileScanInteractive scanner = new FileScanInteractive();

        try (
            BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
            )
        ) {
            while (true) {
                System.out.print("Enter the search string or q to exit: ");
                String line = br.readLine().trim();
                if (line.equalsIgnoreCase("q")) {
                    break;
                }

                System.out.printf(
                    "Count of %s in file: %d\n",
                    line,
                    scanner.countTokens(file, line)
                );
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
