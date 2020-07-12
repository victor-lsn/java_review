/**
 * @author Victor
 * @version 1.0
 * @date 20-7-11 下午4:38
 */
public class day7_thread01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println("run" + i+getName());
        }
    }
}

class test {
    public static void main(String[] args) {
        day7_thread01 thread01 = new day7_thread01();
        thread01.start();

        for (int i = 0; i < 300; i++) {
            System.out.println("main" + i);
        }
        System.out.println(Thread.currentThread().getName());
    }
}
