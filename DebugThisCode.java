import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DebugThisCode {
    public static void main(String[] args) {
        codeToDebug();
    }

    /*
     * Do not run the version that theiss gave us to run
     * it bricks vscode's ability to run any java code.
     * This is the corrected version with the regular file name.
     */
    private static void codeToDebug() {
        try {
            // Creating a file with an invalid name (forward slash is invalid for file names on many OS)
            File file = new File("fileName.txt");
            
            // Attempting to write to the invalid file
            FileWriter writer = new FileWriter(file);
            writer.write("Will this fail?");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace(); // Critical error that will terminate the program
        }
    }
}
