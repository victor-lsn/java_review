/**
 * @author Victor
 * @version 1.0
 * @date 20-7-6 下午8:55
 */
public class day2_re {
    public static void main(String[] args) {
        System.out.println(cheng(8));
    }

    public static int cheng(int n){
        while (n>0){
            return n*cheng(n-1);
        }
        return 1;
    }
}
