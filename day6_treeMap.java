import java.util.TreeMap;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-10 下午6:17
 */
public class day6_treeMap {
    public static void main(String[] args) {
        emp emp1 = new emp(1, 200);
        emp emp2 = new emp(2, 300);
        emp emp3 = new emp(1, 100);
        emp emp4 = new emp(3, 400);
        emp emp5 = new emp(2, 100);

        TreeMap<emp, Integer> map = new TreeMap<>();
        map.put(emp1, 1);
        map.put(emp2, 2);
        map.put(emp3, 4);
        map.put(emp4, 2);
        map.put(emp5, 4);

        System.out.println(map);
    }

}


class emp implements Comparable<emp> {
    int id;
    double salary;

    public emp(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "emp{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(emp o) {
        if (this.id > o.id) {
            return 1;
        } else if (this.id < o.id) {
            return -1;
        } else if (this.salary > o.salary) {
            return 1;
        } else {
            return -1;
        }
    }
}
