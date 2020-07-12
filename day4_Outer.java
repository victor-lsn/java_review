/**
 * @author Victor
 * @version 1.0
 * @date 20-7-8 下午3:19
 */
public class day4_Outer {
    private int id=17;

    public void test(){
        System.out.println("外部类方法");
    }


    class inner{
        private int age=5;

        public void test(){
            System.out.println("内部类方法");
            System.out.println("外部类属性:"+day4_Outer.this.id);
            System.out.println("内部类属性:"+age);
        }
    }

    static class inner2{
        private static int age=6;
        private int height=10;
    }

    public static void main(String[] args) {
        day4_Outer day4_outer = new day4_Outer();
        inner inner = day4_outer.new inner();
        inner.test();

        inner2 i = new inner2();
        System.out.println("静态内部类非静态属性："+i.height);
        System.out.println("静态内部类属性："+day4_Outer.inner2.age);
    }
}


