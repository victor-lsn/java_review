/**
 * @author Victor
 * @version 1.0
 * @date 20-7-7 下午2:27
 */
public class day3_zhichuandi {
    public static void main(String[] args) {
        Student student = new Student(123, "victor", 23);
        testChuan(student);
        System.out.println(student.getAge());
        testChuan2(student);
        System.out.println(student.getAge());
        String a = "3";
        testChuan3(a);
        System.out.println(a);

    }

    public static void testChuan(Student s) {
        s.setAge(25);
    }

    public static void testChuan2(Student s) {
        s = new Student();
        s.setAge(20);
    }

    public static void testChuan3(String a) {
        a = "12";
    }


}
