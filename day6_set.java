import java.util.*;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-10 下午6:40
 */
public class day6_set {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

        for (Iterator<String> iterator=list.iterator();iterator.hasNext();){
            String temp= iterator.next();
            System.out.println(temp);
        }

        Map map=new HashMap();
        map.put("11","22");
        map.put("22","44");
        Set set = map.entrySet();

        for (Iterator iterator = set.iterator();iterator.hasNext();){
            Object next = iterator.next();
            System.out.println(next);
        }
    }

}
