package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObjectArray {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("peopleArray.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // int personCount = ois.readInt();
            // Person[] peopleArray = new Person[personCount];
            // for (int i = 0; i < personCount; i++) {
            //     peopleArray[i] = (Person) ois.readObject();
            // }

            Person[] peopleArray = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(peopleArray));
            
            ois.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
