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
public class E6_銀行帳戶 {

    public static String 帳戶名稱;
    public static int 帳戶餘額;
    public static int 存款;
    public static int 提款;
    public static double x;
    public static double y;
    public static double z;
    
    public static void 初值設定(){
        帳戶名稱 = "ET";
        x = 5000;
        y = Math.random();
        z = Math.random();
        帳戶餘額 = (int)(x);        
    }
    
    public static void 產生存款_提款() {
        存款 =(int)(y * 50000);
        提款 =(int)(z * 50000);
        帳戶餘額 = (帳戶餘額 + 存款- 提款 );
    }
    public static void 顯示() {
        System.out.println("--- 顯示帳戶資訊 ---");
        System.out.println("帳戶名稱:" + 帳戶名稱);                 
        System.out.println("帳戶初始餘額:" + x);
        System.out.println("存入金額:" + 存款);
        System.out.println("提出金額:" + 提款);
        if(帳戶餘額 >= 0 ){
        System.out.println("帳戶餘額:" + 帳戶餘額);
        }
        else{
        System.out.println("帳戶餘額不足，提款交易失敗");
        System.out.println("帳戶餘額:" + (x + 存款));
        }
    }
    public static void 跑流程(){
        初值設定();
        產生存款_提款();
        顯示();
    }   
    
}
