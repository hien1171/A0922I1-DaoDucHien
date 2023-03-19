package io_binary_file;

import java.io.*;
import java.util.Collections;
import java.util.List;

public class FileObjectUtils {
    public static void writeObject(String path, List<Product> list) {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(path))){
            stream.writeObject(list);
            stream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readFileObject(String path) {
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(path))){
            return (List<Product>)stream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
