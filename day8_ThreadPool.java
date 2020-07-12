
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-12 下午4:01
 */
public class day8_ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());//使用完自动归还
    }
}


class RunnableImpl implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
