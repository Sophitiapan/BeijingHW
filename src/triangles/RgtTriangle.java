package triangles;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/12 11:45
 * Description:
 */
public class RgtTriangle {
    public static void main (String[] args) {
        for(int i = 0; i < 7; i++) {
            for(int a = 6 ; a > i; a--) {
                System.out.print("　");
            }
            for(int j = 2*i+1 ; j > 0 ; j--) {
                System.out.print("口");
            }
            System.out.println();
        }
    }


}
