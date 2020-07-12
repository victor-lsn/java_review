/**
 * @author Victor
 * @version 1.0
 * @date 20-7-9 下午3:51
 */
public class day5_testEnum {

    enum Season {
        SPRING,SUMMER,AUTIMN,WINTER
    }

    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        Season season=Season.WINTER;

        switch (season){
            case SPRING:
                System.out.println("春天");break;
            case SUMMER:
                System.out.println("夏天");break;
            case AUTIMN:
                System.out.println("秋天");break;
            case WINTER:
                System.out.println("冬天");break;
        }

    }
}
