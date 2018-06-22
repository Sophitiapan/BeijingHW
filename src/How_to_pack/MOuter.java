package How_to_pack;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/12 17:13
 * Description: 方法内部类(前不加修饰符)
 */
public class MOuter {
    public void show(){
        final int a = 25;
        int b = 13;

        class MInner{
            int c = 2;
            public void print(){
                System.out.println("访问外部类的方法中的常量a: " + a);
                System.out.println("访问内部类中的变量c: " + c );
            }
        }
        MInner mi = new MInner();
        mi.print();
    }

    public static void main(String[] args){
        MOuter mo = new MOuter();
        mo.show();
    }

}
