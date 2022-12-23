package Exceptions.FinalWork;
import java.io.*;

public class WorkingFile {
    protected void writingFile(String meaning){
        try(FileWriter writer = new FileWriter("myFile.txt", true))
        {
            writer.write(meaning + " ");
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        } 
    }
}
