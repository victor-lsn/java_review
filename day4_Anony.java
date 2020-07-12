import java.util.Arrays;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-8 下午3:32
 */
public class  day4_Anony {

    public static void test(A a){
        a.test();
    }

    public static void main(String[] args) {
        test(new A() {
            @Override
            public void test() {
                System.out.println("匿名内部类");
            }
        });
    }

}

interface A{
    void test();
}