/**
 * @author Victor
 * @version 1.0
 * @date 20-7-7 下午3:54
 */
public class Son extends Father{
    static {
        System.out.println("Son static");
    }

    public Son(){
        System.out.println("SOn");
    }

    public void getAge(){
        System.out.println("Son"+age);
        super.getAge();
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.getAge();
        System.out.println(test(1534236469));
    }
    public static int test(int s){
        String s1 = String.valueOf(s);
        char[] chars = s1.toCharArray();
        char[] chars1=new char[chars.length];
        if (chars[0]!='-'){
            int j=chars.length-1;
            for (int i = 0; i < chars.length; i++) {
                while (j>=0){
                    chars1[j]=chars[i];
                    break;
                }
                j--;
            }
        }else {
            int j=chars.length-1;
            for (int i = 1; i < chars.length; i++) {
                while (j>=1){
                    chars1[j]=chars[i];
                    break;
                }
                j--;
            }
            chars1[0]='-';
        }

        return Integer.parseInt(String.valueOf(chars1));
    }
}
