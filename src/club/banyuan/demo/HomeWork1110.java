package club.banyuan.demo;

import java.util.Scanner;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/10 6:22 下午
 */
public class HomeWork1110 {
    public static void main(String[] args) {
        // 1########################################
        float f = 3000000000f;
        int h = (int)f;
        System.out.println(h);//输出2147483647



        // 2########################################
        int n = 11;
        int m = 12;
        if(n>m|++n==m){
            System.out.println(n);//n=12
        }
        int x = 18;
        int y = 19;
        if(x<y||++x==y){
            System.out.println(x);//x=18
        }





        // 3########################################

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入三个数：");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        if(a>b&&a>c){
            System.out.println("最大值为:"+a);
        }else if(b>a&&b>c){
            System.out.println("最大值为:"+b);
        }else if(c>a&&c>b){
            System.out.println("最大值为:"+c);
        }else{
            System.out.println("最大值为"+a);
        }

    }
}
