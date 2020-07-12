import java.math.BigDecimal;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-6 上午7:54
 */
public class day2_dataType {
    public static void main(String[] args) {
        BigDecimal bigDecimal=new BigDecimal(3.1414141);
        BigDecimal bigDecimal1=new BigDecimal(2.1);
        System.out.println(bigDecimal.add(bigDecimal1));

        testChar();
        testOP2();
        System.out.println(true^false);
        System.out.println((double)(3>>1));
    }

    public static void testChar(){
        System.out.println('a'+'b');
        System.out.println(""+'a'+'b');
        System.out.println('a'+'b'+"");
    }

    public static void testOP(){
        long a=3333333333333333L;
        long b=5;

        float d=a+b;
    }

    public static void testOP2(){
        int a=3;
        int b=++a;
        System.out.println(b);
    }
}
