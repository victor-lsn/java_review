package day09_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-14 上午9:09
 */
public class demo15_bufferedReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/day09_IO/c.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String len=null;
        while ((len=bufferedReader.readLine())!=null){
            System.out.println(len);
        }

        bufferedReader.close();
    }
}
