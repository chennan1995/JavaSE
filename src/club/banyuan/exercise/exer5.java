package club.banyuan.exercise;

import java.util.Scanner;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/12 4:49 下午
 */
public class exer5 {
    public static void main(String[] args) {

/*
    1.你的程序要读入一系列正整数数据，输入-1表示输入结束，
    -1本身不是输入的数据。程序输出读到的数据中的奇数和偶数的个数。
	输入格式:一系列正整数，整数的范围是（0,100000）。如果输入-1则表示输入结束。
	输出格式：两个整数，第一个整数表示读入数据中的奇数的个数，
	第二个整数表示读入数据中的偶数的个数。两个整数之间以空格分隔。
 */
//        Scanner scan = new Scanner(System.in);
//        int[] arr = new int[99999];
//        int i = 0;
//        while(true){
//            System.out.println("请输入0-100000之间的正整数：");
//            arr[i] = scan.nextInt();
//            if(arr[i]==-1){
//                break;
//            }
//            i++;
//        }
//        int odd = 0;
//        int even = 0;
//        for (int j = 0; j < i; j++) {
//            if(arr[j]%2!=0){
//                odd++;
//            }else{
//                even++;
//            }
//        }
//        System.out.println(odd+" "+even);



/*
    2:数据加密问题
    某个公司采用公用电话传递数据信息，数据是小于8位的整数(默认8位)，
    为了确保安全，在传递过程中需要加密，加密规则如下：
    首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，
                87654321   8+5=13%10=3
    最后将第一位和最后一位数字交换。
    请任意给定一个小于8位的整数，然后，把加密后的结果在控制台打印出来
 */
        Scanner scan2 = new Scanner(System.in);
        System.out.println("请输入一个小于8位的整数：");
        int num = scan2.nextInt();
        String strNum = num+"";
        String encryNum = "";
        for(int i = 0; i<strNum.length();i++){
            if(num!=0) {
                int remainder = num % 10;
                int re = (remainder+5)%10;
                encryNum = encryNum+re;
                num = num / 10;
            }
        }
        System.out.println(encryNum);












    }
}
