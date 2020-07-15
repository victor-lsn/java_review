package day11_Annotation;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-15 下午4:14
 */
@demo01(num = 1,name="victor",season = Season.SPRING,d=@demo02,name2 = {"123","456"})
public class Test {
    public static void main(String[] args) {
        demo01 annotation = Test.class.getAnnotation(demo01.class);
        String name = annotation.name();
        int num = annotation.num();
        int age = annotation.age();
        Season season = annotation.season();
        demo02 d = annotation.d();

        System.out.println(num+" "+name+" "+age+" "+season+" "+d.ggg());
    }
}

