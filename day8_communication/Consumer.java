package day8_communication;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-12 下午3:12
 */
public class Consumer extends Thread {

    private BaoZi baoZi;

    public Consumer(BaoZi baoZi) {
        this.baoZi = baoZi;
    }


    @Override
    public void run() {
        while (true){
            synchronized (baoZi) {
                if (baoZi.count==0){
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


                if (baoZi.count >=1) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    baoZi.count--;
                    System.out.println("消费者吃剩了" + baoZi.count + "个包子");
                }

                baoZi.notify();
            }
        }
    }
}
