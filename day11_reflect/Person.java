package day11_reflect;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-15 上午9:41
 */
public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat() {
        System.out.println("吃大餐。。。");
    }

    public void eat(String food) {
        System.out.println("吃大餐。。。" + food);
    }
}
