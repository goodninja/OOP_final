package Lesson07.model.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import Lesson07.model.data.User;

public class DataWriter {

    public static <C extends User> void dataWrite(List<C> list) {
        try (FileWriter writer = new FileWriter("contacts.txt", false)) {
            for (C contact : list) {
                writer.write(contact.toString());
                writer.write("\n");
                
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
