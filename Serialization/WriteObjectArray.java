package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectArray {
    public static void main(String[] args) {
        Person[] peopleArray = {new Person(1, "Artem"),
                                new Person(2, "Bob"), 
                                new Person(3, "Tom")};

        try {
            FileOutputStream fos = new FileOutputStream("peopleArray.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // oos.writeInt(peopleArray.length);
            // for (Person person : peopleArray) {
            //     oos.writeObject(person);
            // }

            oos.writeObject(peopleArray);

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
