package How_to_pack;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/12 15:15
 * Description: season2-2.6
 */
public class InClss {
    private int a = 99;

    public class Inner{
        int b = 2;
        public void test() {
            System.out.println("访问外部类的a: " + a );
            System.out.println("访问内部类的b: " + b);
        }

    }

    public static void main(String[] args){
        InClss outer = new InClss();
        Inner in = outer.new Inner();
        in.test();
    }
}
