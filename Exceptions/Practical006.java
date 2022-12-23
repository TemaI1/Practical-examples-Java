// Чтение и запись 

package Exceptions;

import java.io.*;
 
public class Practical006 {
 
    public static void main(String[] args) {
        
        try(FileWriter writer = new FileWriter("myFile.txt", false))
        {
           // запись всей строки
            String text = "Hello Gold!";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');
             
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        } 

        try(FileReader reader = new FileReader("myFile.txt"))
        {
           // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                 
                System.out.print((char)c);
            } 
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }   
    } 
}