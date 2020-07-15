package day11_Annotation;

import java.lang.annotation.*;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-15 下午4:10
 */
//              作用于方法上         成员变量上              类上
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)//保留到源码阶段,自定义注解一般保留在Runtime阶段
@Documented
@Inherited
public @interface demo01 {

    int num();

    String name();

    Season season();

    demo02 d();

    String[] name2();

    int age() default 18;

}
