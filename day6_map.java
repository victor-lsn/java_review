import org.w3c.dom.Node;

import java.util.Arrays;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-10 下午3:18
 */
public class day6_map<T1, T2> {

    private myNode[] table;
    private int size;

    public day6_map() {
        table = new myNode[16];
    }

    public void put(T1 key, T2 value) {
        myNode<T1, T2> node = new myNode();
        node.setHash(getHash(key.hashCode()));
        node.setKey(key);
        node.setValue(value);
        node.setNext(null);
        myNode lastNode = null;

        boolean flag = true;

        myNode temp = table[node.getHash()];
        if (temp == null) {
            table[node.getHash()] = node;
        } else {
            while (temp != null) {
                if (temp.getKey().equals(key)) {
                    temp.setValue(value);
                    flag = false;
                    break;
                } else {
                    lastNode = temp;
                    temp = temp.getNext();
                }

                if (flag) {
                    lastNode.setNext(node);
                }
            }
        }
    }

    public int getHash(int hashCode) {
        return hashCode % (table.length);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("{");
        for (int i = 0; i < table.length; i++) {
            myNode node2=table[i];
            while (node2!=null){
                stringBuilder.append(node2.getKey()+"->"+node2.getValue()+"，");
                node2=node2.getNext();
            }
        }
        stringBuilder.replace(stringBuilder.length()-1,stringBuilder.length(),"}");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        day6_map<Integer, String> map = new day6_map<>();
        map.put(12, "h");
        map.put(28, "e");
        map.put(44, "l");
        map.put(60, "o");

        System.out.println(map);
    }
}
