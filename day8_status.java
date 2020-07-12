/**
 * @author Victor
 * @version 1.0
 * @date 20-7-12 上午11:35
 */
public class day8_status {
    public static void main(String[] args) {
        Object o = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o) {
                    System.out.println("需要包子");
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("开吃");
                }
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o) {
                    System.out.println("做好包子了");
                    o.notify();
                }
            }
        }).start();
    }
}
