package day9_file;

import java.io.File;
import java.io.IOException;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-13 上午10:23
 */
public class demo01_file {
    public static void main(String[] args) throws IOException {
        File f=new File("a.txt");
        System.out.println("绝对路径："+f.getAbsolutePath());
        System.out.println("构造路径："+f.getPath());
        System.out.println("文件名："+f.getName());
        System.out.println("文件长度："+f.length()+"字节");


        f.createNewFile();//创建文件
        f.delete();//删除文件
        f.mkdir();//创建文件表示的目录
        f.mkdirs();//递归创建目录


        File f1=new File("/home/victor/victor");
        System.out.println("是否存在："+f1.exists());
        System.out.println("是否是文件夹："+f1.isDirectory());
        System.out.println("是否是文件："+f1.isFile());

        String[] list = f1.list();//获取目录中文件或文件夹的名称String数组
        for (String s : list) {
            System.out.println(s);
        }


        File[] files = f1.listFiles();//获取目录中文件或文件夹的File数组
        for (File file : files) {
            System.out.println(file);
        }

        String s="1.html";
        String substring = s.substring(s.length() - 5, s.length());
        boolean b = s.endsWith(".html");
        System.out.println(substring);
        System.out.println(b);

    }
}
