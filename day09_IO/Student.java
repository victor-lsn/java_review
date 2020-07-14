package day09_IO;

import java.io.Serializable;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-14 上午10:46
 */
public class Student implements Serializable {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
