package day09_IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-13 下午8:36
 */
public class demo04_InputStram {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/day09_IO/b.txt");
        byte[] b=new byte[1024];
        int read = 0;//返回值为读取的有效字节个数
        while ((read=fileInputStream.read(b))!=-1){
            System.out.println(new String(b,0,read));
        }

        fileInputStream.close();
    }
}
