import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-11 下午10:39
 */
public class day7_thread03 implements Runnable {
    private int tickets = 100;

    Lock lock = new ReentrantLock();


    @Override
    public void run() {
        lock.lock();
        while (tickets > 0) {
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + "---" + tickets);
                Thread.sleep(100);
                tickets--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        lock.unlock();
    }

}


class test3 {
    public static void main(String[] args) {
        day7_thread03 thread03 = new day7_thread03();
        new Thread(thread03).start();
        new Thread(thread03).start();
        new Thread(thread03).start();
    }
}
