/**
 * @author Victor
 * @version 1.0
 * @date 20-7-11 下午9:41
 */
public class day7_thread02 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }
}

class test2 {
    public static void main(String[] args) {
        day7_thread02 thread02 = new day7_thread02();
        Thread thread = new Thread(thread02);
        thread.start();


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    System.out.println(Thread.currentThread().getName() + "---" + i);
                }
            }
        });
        thread1.start();


        for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }
}