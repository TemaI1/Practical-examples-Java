// Использование Exceptions

package Exceptions;

import java.io.IOException;
import java.text.ParseException;

public class lesson5 {
    public static void main(String[] args) {
        try {
            run();
        } catch (IllegalArgumentException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        try {
            run();
        } catch (IllegalArgumentException | IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public static void run() throws IOException, ParseException, IllegalArgumentException {
        System.out.println("Start");
    }
}
