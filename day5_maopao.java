import java.util.Arrays;

public class day5_maopao {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 4, 2, 5, 3 };
        int flag=0;
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length - 1 - j; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                    flag++;
                }
                
                System.out.println(Arrays.toString(a));
            }
            if (flag == 0) {
                System.out.println("结束了");
                break;
            }
            flag=0;
            System.out.println("=================");
        }

    }
}