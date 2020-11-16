package club.banyuan.demo;

import java.util.Scanner;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/9 3:39 下午
 */
public class test01 {
    public static void main(String[] args) {
//        System.out.println("hello banyuan");
//        int a = 3;
//        char b = '一';
//        String abc = "hello";
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(abc);
//        char c = ' ';
//        String d = "";
//        System.out.println(c);
//        System.out.print(d);
//        float f = 12.00f;
//        double dou = 11.11;
//        System.out.println(f);
//        System.out.println(dou);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Short.MAX_VALUE);
//        byte byt1 = 127;
//        byte byt2 = 3;
//        System.out.println(byt1+byt2);
//        byte byt3 = (byte)(byt1+byt2);
//        System.out.println(byt3);
//
//        String x = "";
//        System.out.println(x);
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
////        System.out.println(num);
//        Phone iPhone = new Phone();
//        iPhone.sendEmail();
//        System.out.println(iPhone);
//        new Phone().sendEmail();

//       int sum = getSum(100);
//        System.out.println(sum);

        /*
         * 101101+11011  -->2  8  16
         * 二进制 1000000
         * 八进制 2673
         * 十六进制 5BB
         *
         */
//        System.out.println(Integer.toOctalString(0B101_1011_1011));
//        System.out.println(Integer.toHexString(0B101_1011_1011));


//       int a = 7896;
//       int a1 = a%10;
//       int a2 = a/10%10;
//       int a3 = a/100%10;
//       int a4 = a/1000;
//        System.out.println(a1+a2+a3+a4);
//        int x = 2;
//        x= x++ + --x + x-- + ++x;
//        System.out.println(x);
//          int a = 1;
//        System.out.println(a++);
//        System.out.println(a);
//        System.out.println(++a);
//        System.out.println(a);
//        int i = 1;
//        int j = 2;
//
//        int k = (++i) + (i++) + (--j) + (j--);
//
//        System.out.println(i);//3
//        System.out.println(j);//0
//        System.out.println(k);//6
//          int m =0B1011;
//          int n =1100;
//        System.out.println(~n);
//        System.out.println(-8<<3);
        // 1000 1000
        // 1111 0111
        // 1111 1000
        // 1100 0000
//        System.out.println(-8>>3);
        // 1111 1000
        // 1111 1111
        // 1111 1110
        // 1000 0001

//        System.out.println(-8>>>3);
        // 1000 0000 0000 0000 0000 0000 0000 1000
        // 1111 1111 1111 1111 1111 1111 1111 0111
        // 1111 1111 1111 1111 1111 1111 1111 1000
        // 0001 1111 1111 1111 1111 1111 1111 1111

//        int a=2>1?3>5?6:8:4;
//        System.out.println(a);

//        System.out.println(~7);
        // 0000 0111
        // 1111 1000
        // 1111 0111
        // 1000 1000
//        System.out.print("请输入月份：");
//        Scanner scan = new Scanner(System.in);
//        int m = scan.nextInt();
//        if(m==11|m==12|m==1){
//            System.out.println("该月在冬季");
//        }else if(m==2|m==3|m==4){
//            System.out.println("该月在春季");
//        }else if(m==5|m==6|m==7){
//            System.out.println(("该月在夏季"));
//        }else if(m==8|m==9|m==10){
//            System.out.println("该月在秋季");
//        }else{
//            System.out.println("输入数据有误");
//        }

//            Scanner scan = new Scanner(System.in);
//            System.out.print("请输入数据:");
//            int num = scan.nextInt();
//            switch(num)
//            {
//                case 1:
//                    System.out.println("第一");
////                    break;
//                case 2:
//                    System.out.println("第二");
////                    break;
//                case 3:
//                    System.out.println("第三");
////                    break;
//                default:
//                    System.out.println("no");
//                    break;
//
//            }

//        System.out.print("请输入月份：");
//        Scanner scan = new Scanner(System.in);
//        int m = scan.nextInt();
//        switch(m){
//            case 2:
//            case 3:
//            case 4:
//                System.out.println("春季");
//                break;
//            case 5:
//            case 6:
//            case 7:
//                System.out.println("夏季");
//                break;
//            case 8:
//            case 9:
//            case 10:
//                System.out.println("秋季");
//                break;
//            case 11:
//            case 12:
//            case 1:
//                System.out.println("冬季");
//                break;
//        }
//
//        System.out.println("请输入年份");
//        int year = scan.nextInt();
//        System.out.println("请输入月份");
//        int month = scan.nextInt();
//        System.out.println("请输入日期");
//        int date = scan.nextInt();
//        int sum = 0;
//        switch(month){
//            case 12:
//                sum = sum +30;
//            case 11:
//                sum = sum +31;
//            case 10:
//                sum = sum +30;
//            case 9:
//                sum = sum +31;
//            case 8:
//                sum = sum +31;
//            case 7:
//                sum = sum +30;
//            case 6:
//                sum = sum +31;
//            case 5:
//                sum = sum +30;
//            case 4:
//                sum = sum +31;
//            case 3:
//                sum = sum +29;
//            case 2:
//                sum = sum +31;
//            case 1:
//                sum = sum;
//
//        }
//        System.out.println("今天是今年的第"+(sum+date)+"天");

//        int n = 11;
//        for(int i = 1; i < n; i++){
//            for(int j = 1; j <= i;j++){
//                System.out.print(j+"*"+i+"="+(j*i)+" ");
//            }
//            System.out.println('\n');
//        }
//
//        int k =1;
//        for(int i = 1; i <= 4; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print(k++%10);
//            }
//            System.out.println('\n');
//        }

//        int number = (int) (Math.random() * 50);
//        int i = 1;
//        Scanner scan = new Scanner(System.in);
//        while (i<=5) {
//            System.out.print("您剩下"+(6-i)+"次机会，请输入0至50之间的整数：");
//            int num = scan.nextInt();
//            if(num>50||num<0){
//                System.out.println("输入数据超出规定范围");
//            }
//            else if(num>number){
//                System.out.println("大了");
//            }else if(num<number){
//                System.out.println("小了");
//            }else{
//                System.out.println("猜对了");
//                break;
//            }
//            i++;
//        }
//        System.out.println(number);







    }
}

