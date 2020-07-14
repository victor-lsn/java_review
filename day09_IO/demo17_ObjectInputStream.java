package day09_IO;

import java.io.*;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-14 上午10:12
 */
public class demo17_ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("src/day09_IO/student.txt"));
        objectOutputStream.writeObject(new Student(1, "victor"));
        objectOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("src/day09_IO/student.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object o = objectInputStream.readObject();
        System.out.println(o);
        fileInputStream.close();
    }
}
