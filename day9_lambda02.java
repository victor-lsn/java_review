/**
 * @author Victor
 * @version 1.0
 * @date 20-7-13 上午9:20
 */
public class day9_lambda02{
    public static void main(String[] args) {
        invokeCook(()->{
            System.out.println("做饭了");
        });
    }

    private static void invokeCook(Cook cook){
        cook.makeFood();
    }

}


interface Cook{
    void makeFood();
}
