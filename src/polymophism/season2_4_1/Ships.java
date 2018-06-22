package polymophism.season2_4_1;


/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/19 10:53
 * Description:
 */
public class Ships extends Transportation {

    @Override
    public void wheels() {
        System.out.println("船有不起轮子。");
    }

    public void function() {
        System.out.println("轮船可以进行跨洋运输。");
    }
}
