package polymophism.abstrclss;

import interfce.IDrawMinions;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/20 10:04
 * Description:
 */
public class Initial {
    public static void main(String[] args) {
        Shapes sc = new Circle();
        sc.perimeter();
        sc.area();
        Shapes sr = new Rectangle();
        sr.perimeter();
        sr.area();

        IDrawMinions drC = new Circle();
        drC.Draw();
        IDrawMinions drR = new Rectangle();
        drR.Draw();
        IDrawMinions drP = new Pencil();
        drP.Draw();

        IDrawMinions Annm = new IDrawMinions() {
            @Override
            public void Draw() {
                System.out.println("在接口上使用匿名内部类。");
            }
        };
        Annm.Draw();

        new IDrawMinions(){

            @Override
            public void Draw() {
                System.out.println("或者说，同过匿名内部类来实现接口。");
            }
        }.Draw();
    }
}
