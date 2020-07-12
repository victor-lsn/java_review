import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-5 下午9:57
 */

public class day1 {
    public static void main(String[] args) {
        System.out.println("hello world");
        Integer a=15;
        Integer b=15;
        System.out.println(a==b);

        String s1="hello"+"java";
        String s2="hellojava";
        System.out.println(s1==s2);

        String s3="hello";
        String s4="java";
        String s5=s3+s4;
        System.out.println(s5==s2);
    }

    public static void test() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String test = scanner.nextLine();
            System.out.println(test);
        }
        scanner.close();
    }
}
