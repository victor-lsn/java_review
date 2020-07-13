import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-13 上午9:28
 */
public class day9_lambda03 {
    public static void main(String[] args) {
        Student[] students={
                new Student(1,"q",12),
                new Student(2,"w",23),
                new Student(3,"x",14)
        };

       /* Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/


        Arrays.sort(students,(Student o1,Student o2) -> {
            return o1.getAge()-o2.getAge();
        });

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
