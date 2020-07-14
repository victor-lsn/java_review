package day09_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-14 上午9:09
 */
public class demo14_bufferedWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("src/day09_IO/c.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("你好，哈哈哈哈");
        bufferedWriter.newLine();//换行
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
