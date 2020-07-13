package day09_IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-13 下午10:10
 */
public class demo08_Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("src/day09_IO/b.txt", true);
        fileWriter.write("hello\n");//把数据写入到内存缓冲区中
        fileWriter.flush();//把内存缓冲区中的数据刷新到文件中
        fileWriter.close();
    }
}
