package day09_IO;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-13 下午11:49
 */
public class demo11_properties {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("111", "victor");
        properties.setProperty("222", "flank");
        properties.setProperty("333", "赵丽颖");

        /*FileOutputStream fileOutputStream = new FileOutputStream("src/day09_IO/properties.txt");
        properties.store(fileOutputStream, "save data");*/

        FileWriter fileWriter = new FileWriter("src/day09_IO/properties.txt");
        properties.store(fileWriter, "save data2");


        //fileOutputStream.close();

        fileWriter.close();
    }
}
