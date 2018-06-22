package inheritance;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/13 10:31
 * Description: season2 3-1
 */
public class Animal {
    public int age = 12;
    public String name;

    final public void eat() {
        System.out.println("动物会吃东西。");
    }



    public String eat2(){
        return "带返回值的方法才可以在main方法中直接用System打印出来";
    }

    public void Animals(){
        System.out.println("我是父类Animal里的构造方法。");
    }

    public void test(){
        Animal wang = new Animal();
        wang.eat();
        System.out.println("我是Animal里的test。");
    }

    public Animal( ){

    }

    public void limb () {
        System.out.println("我是父类四肢。我没有被重写");
    }

    public void chunk() {
        System.out.println("我是父类躯干。我没有被重写");
    }

    public void food() {
        System.out.println("动物需要食物。");
    }

    public Animal(int age){
        this.age = age;

    }
}


