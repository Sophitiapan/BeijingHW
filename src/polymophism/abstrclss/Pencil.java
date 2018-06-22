package polymophism.abstrclss;

import interfce.IDrawMinions;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/20 14:12
 * Description:
 */
public class Pencil implements IDrawMinions {
    @Override
    public void Draw() {
        System.out.println("可以用铅笔通过几何图像画一个小人。");
    }
}
