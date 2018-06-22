package polymophism.abstrclss;

import interfce.IDrawMinions;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/20 10:05
 * Description:
 */
public class Circle extends Shapes implements IDrawMinions{


    @Override
    public void perimeter() {
        System.out.println("圆的周长等于2πr");
    }

    @Override
    public void area() {
        System.out.println("圆的面积等于πr²");
    }

    @Override
    public void Draw() {
        System.out.println("可以用圆形画人的脑袋。");
    }
}
