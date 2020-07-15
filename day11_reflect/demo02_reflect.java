package day11_reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-15 上午10:19
 */
public class demo02_reflect {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Field[] declaredFields = personClass.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));

        Field name = personClass.getDeclaredField("name");
        System.out.println(name);
        name.setAccessible(true);
        Person person = new Person();

        name.set(person,"victor");
        System.out.println(person);
    }
}
