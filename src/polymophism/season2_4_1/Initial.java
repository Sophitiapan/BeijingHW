package polymophism.season2_4_1;


/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/19 10:58
 * Description:
 */
public class Initial {
    public static void main(String[] args) {
        Transportation B146 = new Transportation();
        Transportation B10 = new Buses();
        Transportation P5401 = new Transportation();
        Transportation P5402 = new Planes();
        Transportation S01 = new Transportation();
        Transportation S02 = new Ships();


        System.out.println(B146.getPassengers());
        System.out.println(B146.getWorkingEnv());
        B146.function();
        System.out.println(B146.volume);

        B10.setPassengers("20人");
        B10.setWorkingEnv("陆地");
        System.out.println(B10.getPassengers());
        System.out.println(B10.getWorkingEnv());
        B10.function();
        System.out.println();
        B146.volume = "小";
        B10.volume = "small";
        System.out.println("B146: " + B146.volume + "和" + "B10: " + B10.volume);
        B146.wheels();
        B10.wheels();
        System.out.println("以上两者应该是相同的。");

        System.out.println(P5401.getPassengers());
        System.out.println(P5401.getWorkingEnv());
        P5401.function();
        P5401.volume = "大";
        P5402.setPassengers("500人");
        P5402.setWorkingEnv("天空");
        System.out.println(P5402.getPassengers());
        System.out.println(P5402.getWorkingEnv());
        P5402.function();
        System.out.println();
        P5402.wheels();

        System.out.println(S01.getPassengers());
        System.out.println(S01.getWorkingEnv());
        S01.function();
        S02.setPassengers("500人");
        S02.setWorkingEnv("天空");
        System.out.println(S02.getPassengers());
        System.out.println(S02.getWorkingEnv());
        S02.function();
        S02.wheels();
        System.out.println("上者应该是”轮船有不起轮子。“");


    }
}
