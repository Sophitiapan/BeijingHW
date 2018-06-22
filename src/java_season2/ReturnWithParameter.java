package java_season2;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/5/16 18:10
 * Description: 7-6
 */
public class ReturnWithParameter {
    public static void main(String[] args) {

        ReturnWithParameter hello = new ReturnWithParameter();
        String welcome = hello.show("爱慕课");
        System.out.println(welcome);
    }
    private String show(String name){
        return "欢迎您, "+name+"!";
    }
}
