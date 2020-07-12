import java.util.Random;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-6 上午9:36
 */
public class day2_switch {
    public static void main(String[] args) {
        int a = new Random().nextInt(6);
        System.out.println("原值："+a);
        test6();
    }

    public static void shai(int a){
        switch (a){
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
            case 5:
                System.out.println("5");
            default:
                System.out.println("6");
        }
    }

    public static void testFor(){
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }


    public static void test99(){
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+j*i+" ");
            }
            System.out.println();
        }
    }

    public static void test5(){
        int sum=0;
        for (int i = 1; i <=1000 ; i++) {
            if (i%5==0){
                System.out.print(i+"   ");
                sum++;
                if (sum%5==0){
                    System.out.println();
                }
            }
        }
    }

    public static void test6(){
        int jsum=0;
        int osun=0;
        int i=1;
        while (i<=100){
            if (i%2==0){
                jsum+=i;
            }else {
                osun+=i;
            }
            i++;
        }
        System.out.println("奇数和："+jsum+"  "+"偶数和："+osun);
    }
}
