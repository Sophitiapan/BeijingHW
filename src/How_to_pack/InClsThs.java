package How_to_pack;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/12 15:52
 * Description: this关键字在内部类中的运用
 */
public class InClsThs {
    int b = 1;

    public class Inner{
        int b = 2;
        public void test(){
            System.out.println("访问外部类中的b: " + InClsThs.this.b);
            System.out.println("访问内部类中的b: " + b);

        }
    }


    public static void main(String[] args){
        InClsThs out = new InClsThs();
        Inner in = out.new Inner();
        in.test();

    }
}
