package day11_reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.Period;
import java.util.Arrays;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-15 上午11:50
 */
public class demo04 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;

        Person person = personClass.newInstance();


        Method eat = personClass.getMethod("eat");
        eat.invoke(person);


        Method eat1 = personClass.getMethod("eat", String.class);
        eat1.invoke(person,"龙虾");

        System.out.println("===================================");
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
