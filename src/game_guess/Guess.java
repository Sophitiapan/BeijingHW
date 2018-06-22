package game_guess;


import java.util.Scanner;

/**
 * Information
 * Author: ZhangLifan
 * Time: 2018/6/14 13:58
 * Description: 猜大小游戏
 */
public class Guess {
    public static void main(String[] args) {
        System.out.println("========== 我 们 来 玩《猜大小》吧 =========");
        int stochastic = (int) (Math.random() * 100);
        System.out.println("请输入一百以内你乱猜的一个数字，一共有5次机会。");

        for (int i = 1; i <= 5; i++) {
            Scanner input = new Scanner(System.in);
            int guess = input.nextInt();
            if (guess > stochastic) {
                System.out.print("大了！换个~~");
            } else if (guess < stochastic) {
                System.out.print("小了！再试...");
            } else if (guess == stochastic) {
                System.out.println("6666~给你蒙对了~~为你打call！！！");
                break;
            }

            int chance = i;
            if (chance < 5) {
                System.out.println("你还有" + (5 - i) + "次机会");
                System.out.println("请再输入一个数字：");
            } else {
                System.out.println("也白给！GAME OVER!");
                break;
            }
        }
        System.out.println();
        System.out.println("==============================================");
        System.out.println("给再玩次呢？");
        System.out.println("还想再玩一次请输入“ 玩 ”；不想玩了就输“ 滚 ”");
        Scanner input3 = new Scanner(System.in);
        String choice = input3.next();
        String ans1 = "玩";
        String ans2 = "滚";

        if(choice.equals(ans1)) {
            System.out.println("我欣赏你~");
        }else if(choice.equals(ans2)) {
            System.out.println("从心");
        }else {
            System.out.println("文盲一朵");
        }
    }

}








