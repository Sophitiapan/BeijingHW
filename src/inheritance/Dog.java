package inheritance;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/13 11:14
 * Description:
 */
public class Dog extends Animal {

    public int age =15;


    public void son() {
        Animal ani = new Animal();
        System.out.println("通过父类的对象调用父类属性age： " +(ani.age));
        ani.eat();

        System.out.println("通过super.调用父类属性age： " + (super.age));
        super.eat();
        System.out.println();

        System.out.println("用父类对象调父类中带返回值eat2方法，System直接打印：" + (ani.eat2()));
        System.out.println("用super调用父类中带返回值eat2方法，System直接打印：" + (super.eat2()));


    }


    public void test2() {
        /*Dog doggy = new Dog();
        doggy.eat();*/
        System.out.println("我是Dog里的test2");
    }

    public Dog() {
        System.out.println("我是子类Dog里的构造方法。");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return age == dog.age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }

    @Override
    public String eat2() {
        return ("我是被重写的父类方法eat2： Dogs eat bones.");
    }

    public void bark() {
        System.out.println("我是Dog子类独有的方法： Dogs bark.");
    }
}

