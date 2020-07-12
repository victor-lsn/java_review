import java.util.Arrays;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-9 下午6:02
 */
public class day5_zhichuandi {
    String str=new String("good");
    char[] chars={'1','2','3'};
    Integer i=3;
    int i2=5;

    public static void main(String[] args) {
        day5_zhichuandi d = new day5_zhichuandi();
        String a="12345667";
        d.change(d.str,d.chars,d.i,d.i2,a);
        System.out.println(d.str+"==========="+ Arrays.toString(d.chars)+"============"+d.i+"====="+a);
    }

    public void change(String str,char[] chars,Integer i,int i2,String a){
        str="1234";
        chars[0]='q';
        i=20;
        i2=8;
        a="12";
    }
}
