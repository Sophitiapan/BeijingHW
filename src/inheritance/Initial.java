package inheritance;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/13 11:18
 * Description:
 */
public class Initial {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "波比";
//        dog.eat();
//        dog.test2();
//        dog.son();

        System.out.println();
        System.out.println(dog);

        Dog a = new Dog();
        Dog b = new Dog();
        a.age = 123;
        b.age = 123;

        if (a.equals(b)) {
            System.out.println("两者内存中位置相等");
        } else {
            System.out.println("两者的内存位置不同");
        }

        Animal alfaDog = new Dog();
        Animal anim = new Animal();
        Animal cats = new Cat();
        Cat kitty = new Cat();
        alfaDog.eat2();
        dog.bark();//只能用Dog类自己的对象dog调用Dog类自己独有的非继承方法bark（）；向上转型得到的指向子类的父类引用alfaDog无法调用非继承非重写的子独有方法bark（）。
        kitty.scratch();//理同上。
        Dog forcedAlfaDog = (Dog)alfaDog;
        forcedAlfaDog.bark();//将alfaDog强制转型后，它再次指向本类对象，就可以调用本类独有方法bark（）。

        System.out.println();
        anim.food();
        kitty.food();
        cats.food();

    }


}
//        System.out.println(dog.age);
//        System.out.println(dog.name);

//        Animal canidae = new Animal();
//        canidae.age = 15;
//        canidae.name = "小乖";

//        System.out.println(canidae.age);
//        System.out.println(canidae.name);



