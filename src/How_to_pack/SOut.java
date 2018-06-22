package How_to_pack;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/12 16:43
 * Description: 静态内部类
 */
public class SOut{
    private int a = 9;
    static int b = 1;

    public static class SInner {
        int b = 2;
        public void test(){
            System.out.println("访问外部类中的b: " + SOut.b);
            System.out.println("访问内部类中的b: " + b);
        }
    }

    public static void main(String[] args){
        SInner hello = new SInner();
        hello.test();
    }
}
