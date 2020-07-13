package day09_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-13 下午9:08
 */
public class demo05_testCopy {
    public static void main(String[] args) throws IOException {
        String pathCopy = "src/day09_IO/b.txt";
        String pathWrite = "src/day09_IO/c.txt";

        copy(pathCopy, pathWrite);
    }


    public static void copy(String pathCopy, String pathWrite) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(pathCopy);
        FileOutputStream fileOutputStream = new FileOutputStream(pathWrite);
        byte[] bytes = new byte[2];

        int len = 0;

        while ((len = fileInputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, len);
        }

        fileOutputStream.close();
        fileInputStream.close();
    }
}


