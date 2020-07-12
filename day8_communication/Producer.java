package day8_communication;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-12 下午3:05
 */
public class Producer extends Thread {

    private BaoZi baoZi;

    public Producer(BaoZi baoZi) {
        this.baoZi = baoZi;
    }


    @Override
    public void run() {
        while (true) {
            synchronized (baoZi) {

                if (baoZi.count == 10) {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (baoZi.count <= 9) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    baoZi.count++;
                    System.out.println("生产第" + baoZi.count + "个包子");
                }

                baoZi.notify();
            }
        }
    }
}
