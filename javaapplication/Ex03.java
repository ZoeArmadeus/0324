/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author user
 */
public class Ex03 {

    public static String 名字;
    public static int 英文成績;
    public static int 數學成績;
    public static int 總分成績;
    public static double 平均成績;

    public static void 初值設定() {
        System.out.println("--- 設定初值 ---");
        名字 = "未命名";
        英文成績 = 0;
        數學成績 = 0;
        總分成績 = 0;
        平均成績 = 0;
    }

    public static void 顯示資料() {
        System.out.println("--- 顯示資料 ---");
        System.out.println("學生姓名:" + 名字);
        System.out.println("英文成績:" + 英文成績);
        System.out.println("數學成績:" + 數學成績);
        System.out.println("總分成績:" + 總分成績);
        System.out.println("平均成績:" + 平均成績);
    }

    public static void 修改資料() {
        System.out.println("--- 修改資料 ---");
        名字 = "Zoe";
        英文成績 = 100;
        數學成績 = 97;
    }

    public static void 計算總分() {
        總分成績 = (英文成績 + 數學成績);
    }

    public static void 計算平均() {
        平均成績 = (英文成績 + 數學成績) / 2.0;
    }

    public static void 評語1() {
        System.out.println("--- 評語1 ---");

        if (平均成績 >= 90.0) {
            System.out.println("超棒");
        }
        if (平均成績 >= 80.0) {
            System.out.println("很棒");
        }
        if (平均成績 >= 70.0) {
            System.out.println("棒");
        }
        if (平均成績 < 70.0) {
            System.out.println("不棒");
        }
    }

    public static void 評語2() {
        System.out.println("--- 評語2 ---");

        if (平均成績 >= 90.0) {
            System.out.println("超棒");
        } else if (平均成績 >= 80.0) {
            System.out.println("很棒");
        } else if (平均成績 >= 70.0) {
            System.out.println("棒");
        } else {
            System.out.println("不棒");
        }
    }

    public static void 跑流程() {
        初值設定();
        顯示資料();
        修改資料();
        計算總分();
        計算平均();
        顯示資料();
        評語1();
        評語2();
    }
}
