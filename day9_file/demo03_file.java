package day9_file;

import java.io.File;
import java.io.FileFilter;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-13 上午11:46
 */
public class demo03_file {
    public static void main(String[] args) {
        File victor = new File("/home/victor/victor");
        files(victor);
    }

    public static void files(File file) {
        /*for (File file1 : file.listFiles(new demo())) {
            if (file1.isDirectory()) {
                files(file1);
            } else {
                System.out.println(file1.getName());
            }

        }*/

        /*for (File file1 : file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()){
                    return true;
                }
                return pathname.getName().endsWith(".html");
            }
        })) {
            if (file1.isDirectory()) {
                files(file1);
            } else {
                System.out.println(file1.getName());
            }

        }*/


        for (File file1 : file.listFiles((File pathname)->{
            if (pathname.isDirectory()){
                return true;
            }
            return pathname.getName().endsWith(".html");
        })) {
            if (file1.isDirectory()) {
                files(file1);
            } else {
                System.out.println(file1.getName());
            }

        }
    }
}


class demo implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()){
            return true;
        }
        return pathname.getName().endsWith(".html");
    }
}