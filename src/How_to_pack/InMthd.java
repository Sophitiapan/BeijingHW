package How_to_pack;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/12 15:30
 * Description: 外部类需要通过内部类对象去访问内部类成员变量和方法
 */
public class InMthd {

        public class Inner {
            public void show(){
                System.out.println("Welcome to imooc!");
            }
        }



        public void print(){
            InMthd outr = new InMthd();
            Inner inn = outr.new Inner();
            inn.show();
        }

        public static void main(String[] args){
            InMthd mnout = new InMthd();
            mnout.print();
        }
}

