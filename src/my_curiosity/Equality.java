package my_curiosity;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/15 17:34
 * Description: equals V.S. ==
 */
public class Equality {
    public static void main(String[] args) {
        Equality item1 = new Equality();
        Equality item2 = new Equality();
        if (item1.equals(item2)) {
            System.out.println("两者内存中位置相等");
        } else {
                System.out.println("两者的内存位置不同");

        }


    }
}
