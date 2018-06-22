package inheritance;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/21 11:52
 * Description:
 */
public class Cat extends Animal {
    public void scratch () {
        System.out.println("我是猫独有的抓。");
    }

    @Override
    public void food() {
       System.out.println("猫需要鱼才能活下去。");
    }
}
