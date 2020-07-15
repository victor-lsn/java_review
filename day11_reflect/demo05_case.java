package day11_reflect;

import com.sun.org.apache.bcel.internal.ExceptionConst;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-15 下午12:07
 */
public class demo05_case {
    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();

        ClassLoader classLoader = demo05_case.class.getClassLoader();

        InputStream resource = classLoader.getResourceAsStream("demo.properties");
        //配置文件需要放在与当前类类所属包的同一级目录，否则当前类的类加载器找不到

        properties.load(resource);


        Class<?> aClass = Class.forName(properties.getProperty("ClassName"));

        Method method = aClass.getMethod(properties.getProperty("method"));

        method.invoke(aClass.newInstance());


    }
}
