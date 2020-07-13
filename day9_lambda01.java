

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-13 上午8:58
 */
public class day9_lambda01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();


        new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        }).start();



    }
}
