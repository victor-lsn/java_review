/**
 * @author Victor
 * @version 1.0
 * @date 20-7-13 上午9:37
 */
public class day9_lambada04 {
    public static void main(String[] args) {

        /*Calus(1, 3, new Calculator() {
            @Override
            public int caul(int a, int b) {
                return a+b;
            }
        });*/


        Calus(1, 8, (int a, int b) -> a + b);
    }


    public static void Calus(int a, int b, Calculator calculator) {
        int caul = calculator.caul(a, b);
        System.out.println("结果是：" + caul);
    }
}


interface Calculator {
    int caul(int a, int b);
}