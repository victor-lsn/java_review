package day09_IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-14 上午8:48
 */
public class demo12_bufferedInput {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/day09_IO/b.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream,1024);
        int len = 0;
        while ((len = bufferedInputStream.read()) != -1) {
            System.out.println(len);
        }

        bufferedInputStream.close();
    }
}
