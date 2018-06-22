package triangles;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/14 11:40
 * Description: 倒三角
 */
public class InvertedTri {
    public static void main(String[] args) {
        for(int i = 1; i <= 7; i++) {
            for(int j = 7; j >= i; j--) {
                System.out.print(" 倒 ");
            }
            System.out.println();
        }
    }

}
