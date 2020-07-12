public class day5_testStringBuilder{
    public static void main(String[] args) {
        StringBuilder sBuilder=new StringBuilder("123456");
        System.out.println(sBuilder);
        sBuilder.setCharAt(0, '0');
        System.out.println(sBuilder);


        sBuilder.append('a').append('b');
        System.out.println(sBuilder);
    }
}