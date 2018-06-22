package polymophism.abstrclss;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/20 17:14
 * Description: 通过匿名内部类实现，而不费力去写子类。优点：快捷省事；缺点：一次性。
 */
public class AnonymInit {
    public static void main(String[] args) {
        Shapes square = new Shapes(){

            @Override
            public void perimeter() {
                System.out.println("正方形的周长等于边长乘以4");
            }

            @Override
            public void area() {
                System.out.println("正方形的面积等于边长乘以边长");
            }
        };
        square.perimeter();
        square.area();

        new Shapes() {

            @Override
            public void perimeter() {
                System.out.println("匿名内部类的边长等于鬼晓得");
            }


            @Override
            public void area() {
                System.out.println("匿名内部类的面积等于天知道");

            }
        }.perimeter();



    }
}
