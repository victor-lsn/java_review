package day09_IO;

import java.util.Properties;
import java.util.Set;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-13 下午11:40
 */
public class demo10_Properties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("111","victor");
        properties.setProperty("222","flank");



        Set<String> strings = properties.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string+"===="+properties.getProperty(string));
        }
    }
}

