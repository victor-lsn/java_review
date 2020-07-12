import java.util.*;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-10 上午10:02
 */
public class day6_List<T> {
    private Object[] elementData;
    private int size;

    private static final int DEFAULT_SIZE = 10;

    public day6_List() {
        elementData = new Object[DEFAULT_SIZE];
    }

    public void add(T e) {
        if (size==elementData.length-1){
            Object[] newArray=new Object[elementData.length+(elementData.length>>1)];
            System.arraycopy(elementData,0,newArray,0,elementData.length);
            elementData=newArray;
        }
        elementData[size++] = e;
    }

    public T get(int index){
        return (T)elementData[index];
    }



    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(elementData[i]).append(",");
        }
        stringBuilder.replace(stringBuilder.length()-1,stringBuilder.length(),"]");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        day6_List<String> d1 = new day6_List<>();
        d1.add("123");
        d1.add("234");
        for (int i = 0; i < 20; i++) {
            d1.add("i");
        }
        System.out.println(d1);
        System.out.println(d1.get(0));
    }

}
