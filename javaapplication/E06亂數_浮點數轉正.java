/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import static javaapplication.Ex03.名字;
import static javaapplication.Ex03.平均成績;
import static javaapplication.Ex03.數學成績;
import static javaapplication.Ex03.總分成績;
import static javaapplication.Ex03.英文成績;

/**
 *
 * @author user
 */
public class E06亂數_浮點數轉正 {
    public static double r;
    public static double p;
    public static int eng;
    public static int mat;
    
    
    
    public static void 初值設定() {
        r = Math.random();
        p = Math.random();
    }
    
    public static void 顯示英文結果() {
        System.out.println("英文亂數" + r);
    }
    
    public static void 產生英文成績() {
        eng = (int)(r * 101.0);
    }
    
    public static void 顯示英文成績() {
        System.out.println("英文成績" + eng);
            }
    
     public static void 顯示數學結果() {
        System.out.println("數學亂數" + p);
    }
     public static void 產生數學成績() {
        mat = (int)(p * 101.0);
    }
    
    public static void 顯示數學成績() {
        System.out.println("數學成績" + mat);
            }
    
    
    
     public static void 計算總分() {
        總分成績 = (eng + mat);
    }

    public static void 計算平均() {
        平均成績 = (eng + mat) / 2.0;
    }
    
     public static void 顯示資料() {
        System.out.println("--- 顯示資料 ---");
        System.out.println("英文成績:" + eng);
        System.out.println("數學成績:" + mat);
        System.out.println("總分成績:" + 總分成績);
        System.out.println("平均成績:" + 平均成績);
    }
    
    public static void 評語() {
        System.out.println("--- 評語 ---");

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
    public static void 跑流程(){
        初值設定();
        顯示英文結果();
        產生英文成績();
        顯示英文成績();
        顯示數學結果();
        產生數學成績();
        顯示數學成績();
        計算總分();
        計算平均();
        顯示資料();
        評語();
    }
}
