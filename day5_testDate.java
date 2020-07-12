import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class day5_testDate {
    public static void main(String[] args) throws ParseException{
        System.out.println(System.currentTimeMillis());// 打印1970年到现在的毫秒数
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");// 定义时间格式
        String s = sd.format(new Date(System.currentTimeMillis()));
        Date d3 = sd.parse("2020-8-9");
        System.out.println(d3);

        System.out.println(s);

        Date d1 = new Date(300);
        Date d2 = new Date(400);
        System.out.println(d2.after(d1));

        SimpleDateFormat sd2 = new SimpleDateFormat("w");
        System.out.println(sd2.format(new Date()));;//今年的第多少周
    }
}
