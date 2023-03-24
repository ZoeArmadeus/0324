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
public class Ex04 {
    
    public static double cm;
    public static double kgw;
    public static double m;
    public static double bmi;
    
    public static void 初值設定() {
        System.out.println("--- 設定初值 ---" );
        cm = 174.2;
        kgw = 126.4;
        m = cm /100.0;
        bmi = kgw / (m * m);
    }
    
    public static void 顯示資料() {
        System.out.println("--- 設定初值 ---");
        
        System.out.println("cm:" + cm);
        System.out.println("kgw:" + kgw);
        System.out.println("m:" + m);
        System.out.println("bmi:" + bmi);        
    }
   
    public static void 評語3() {
        if(bmi < 27){
            System.out.println("過重");
        } else if(bmi < 24){
            System.out.println("正常");
        }
    }
}
