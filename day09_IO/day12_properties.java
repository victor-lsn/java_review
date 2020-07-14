package day09_IO;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-14 上午12:00
 */
public class day12_properties {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        /*FileReader fileReader = new FileReader("src/day09_IO/properties.txt");
        properties.load(fileReader);*/

        FileInputStream fileInputStream = new FileInputStream("src/day09_IO/properties.txt");
        properties.load(fileInputStream);

        Set<String> strings = properties.stringPropertyNames();
        for (String s : strings) {
            System.out.println(s + "=" + properties.getProperty(s));
        }

        fileInputStream.close();
        //fileReader.close();
    }
}
