package day9_file;

import java.io.File;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-13 上午11:17
 */
public class demo02_file {
    public static void main(String[] args) {
        File victor = new File("/home/victor/victor");
        files(victor);
    }

    public static void files(File file){
        for(File file1:file.listFiles()){
            if (file1.isDirectory()){
                files(file1);
            }else {
                if (file1.getName().length()>7){
                    String substring = file1.getName().substring(file1.getName().length() - 5, file1.getName().length());

                    if (substring.equals(".html")){
                        System.out.println(file1.getName());
                    }
                }

            }
        }
    }
}
