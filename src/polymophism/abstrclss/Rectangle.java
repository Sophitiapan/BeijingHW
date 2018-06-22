package polymophism.abstrclss;


import interfce.IDrawMinions;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/20 10:05
 * Description:
 */
public class Rectangle extends Shapes implements IDrawMinions {
    @Override
    public void perimeter() {
        System.out.println("长方形的边长是长加宽乘2");
    }

    @Override
    public void area() {
        System.out.println("长方形的面积是长乘以宽");
    }

    @Override
    public void Draw() {
        System.out.println("可以用长方形画人的胳膊和腿。");
    }
}
