import java.util.Random;
import java.util.Scanner;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-6 上午9:16
 */
public class day2_scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);
        System.out.println(testR());
        scanner.close();
    }

    public static int testR(){
        double random = Math.random();
        System.out.println(random);

        Random random1=new Random();
        return random1.nextInt(100);
    }
}
