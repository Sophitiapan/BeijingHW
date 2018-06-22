package triangles;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/14 10:55
 * Description: 成功了的
 */
public class Triangle1 {
    public static void main(String[] args) {
        for (int i = 7; i > 0; i--) {
            System.out.println(" 图 ");
            for (int j = 8; j > i && i!=1; j--) {
                System.out.print(" 虫 ");
            }
        }
    }
}
