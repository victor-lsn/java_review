package day8_communication;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-12 下午3:16
 */
public class Test {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi(0);
        Consumer consumer = new Consumer(baoZi);
        Producer producer = new Producer(baoZi);
        producer.start();
        consumer.start();
    }
}
