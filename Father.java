
/**
 * @author Victor
 * @version 1.0
 * @date 20-7-7 下午3:53
 */
public class Father {
    int age=30;

    public Father(){
        System.out.println("Father");
    }

    static {
        System.out.println("Father static");
    }

    public void getAge(){
        System.out.println("Father"+age);
    }
}
