package utils;

import java.io.*;

public class FileHandler {

    public static void saveObject(String file, Object obj) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Object loadObject(String file) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            return in.readObject();
        } catch (Exception e) {
            return null;
        }
    }
}