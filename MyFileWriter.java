import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class MyFileWriter {
    public static void main(String[] args) {
        String secretName = "Barack";
        String secretCode = "8241763509";

        // 1. Using FileWriter
        // try (FileWriter writer = new FileWriter(fileName1)) {
        //     writer.write(data);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // 2. Using BufferedWriter
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(".Obama's Last Name.txt"))) {
            bufferedWriter.write(secretName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3. Using FileOutputStream
        // try (FileOutputStream outputStream = new FileOutputStream(fileName3)) {
        //     outputStream.write(data.getBytes());
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // 4. Using BufferedOutputStream
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(".secretInfo/Theiss Bank Account Number.dat"))) {
            bufferedOutputStream.write(secretCode.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 5. Using Files (java.nio.file)
    //     try {
    //         Files.write(Paths.get(fileName5), data.getBytes(StandardCharsets.UTF_8));
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    }
}
