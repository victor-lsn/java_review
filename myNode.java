/**
 * @author Victor
 * @version 1.0
 * @date 20-7-10 下午4:14
 */
public class myNode<T1,T2> {
    private int hash;
    private T1 key;
    private T2 value;
    private myNode next;

    public int getHash() {
        return hash;
    }

    public T1 getKey() {
        return key;
    }

    public T2 getValue() {
        return value;
    }

    public myNode getNext() {
        return next;
    }


    public void setHash(int hash) {
        this.hash = hash;
    }

    public void setKey(T1 key) {
        this.key = key;
    }

    public void setValue(T2 value) {
        this.value = value;
    }

    public void setNext(myNode next) {
        this.next = next;
    }
}
