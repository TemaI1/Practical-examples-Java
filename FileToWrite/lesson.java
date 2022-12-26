package FileToWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class lesson {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Test row one");
        pw.append("Test row two");
        pw.close();
    }
}
