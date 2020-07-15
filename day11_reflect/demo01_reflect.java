package day11_reflect;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-15 上午9:41
 */
public class demo01_reflect {

    public static void main(String[] args) throws ClassNotFoundException {
        //1.
        Class cls = Class.forName("day11_reflect.Person");
        System.out.println(cls);

        //2
        Class<Person> cls2 = Person.class;
        System.out.println(cls2);

        //3
        Person person = new Person();
        Class<? extends Person> cls3 = person.getClass();
        System.out.println(cls3);

    }
}
