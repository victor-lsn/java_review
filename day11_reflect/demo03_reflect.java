package day11_reflect;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-15 上午11:44
 */
public class demo03_reflect {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        Constructor<?>[] constructors = personClass.getConstructors();
        System.out.println(Arrays.toString(constructors));

        Constructor<Person> constructor = personClass.getConstructor(String.class, Integer.class);
        Person victor111 = constructor.newInstance("victor111", 20);
        System.out.println(victor111);

        Person person = personClass.newInstance();
        System.out.println(person);
    }
}
