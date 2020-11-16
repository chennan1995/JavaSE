package club.banyuan.exercise;

import java.util.Scanner;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/12 4:10 下午
 */
public class exer3 {
    public static void main(String[] args) {

        //1从键盘输入一个班5个学生的分数，求和并输出
//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入第一个学生的分数：");
//        int num1 = scan.nextInt();
//        System.out.println("请输入第二个学生的分数：");
//        int num2 = scan.nextInt();
//        System.out.println("请输入第三个学生的分数：");
//        int num3 = scan.nextInt();
//        System.out.println("请输入第四个学生的分数：");
//        int num4 = scan.nextInt();
//        System.out.println("请输入第五个学生的分数：");
//        int num5 = scan.nextInt();
//        System.out.println("五个学生的分数和为："+(num1+num2+num3+num4+num5));


        //2从键盘输入某个十进制整数数，转换成对应的二进制整数并输出。
//        Scanner scan2 = new Scanner(System.in);
//        System.out.println("请输入一个十进制整数：");
//        int decimalNum = scan2.nextInt();
//        String binNum = "";
//        while (decimalNum!=0){
//            binNum = decimalNum%2 + binNum;
//            decimalNum = decimalNum/2;
//        }
//        System.out.println("该数二进制表示为"+binNum);





        //3输入一批整数，使用循环求出最大值与最小值，输入0时结束。
//        Scanner scan3 = new Scanner(System.in);
//        int max = 0;
//        int min = 0;
//        while(true){
//            System.out.println("请输入整数：");
//            int num = scan3.nextInt();
//            if(num>max){
//                max = num;
//            }
//            if(num<min){
//                min = num;
//            }
//            if(num==0){
//                break;
//            }
//        }
//        System.out.println("最大值为："+max+","+"最小值为"+min);




        //4	找出能被5或6整除，但不能被两者同时整除的数
//        Scanner scan4 = new Scanner(System.in);
//        System.out.println("请输入一个正整数：");
//        int m = scan4.nextInt();
//        System.out.println("请输入一个正整数：");
//        int n = scan4.nextInt();
//        for (int i = m; m<=i && i<=n; i++) {
//            if(i%5==0 && i%6==0){
//                continue;
//            }
//            if(i%5==0){
//                System.out.println(i);
//            }
//            if(i%6==0){
//                System.out.println(i);
//            }
//        }






        //5请输入一个任意年份,判断是否是闰年
//        Scanner scan4 = new Scanner(System.in);
//        System.out.println("请输入年份：");
//        int year = scan4.nextInt();
//        if(year%100==0){
//            if(year%400==0){
//                System.out.println(year+"年是闰年");
//            }else{
//                System.out.println(year+"年不是闰年");
//            }
//        }else{
//            if(year%4==0){
//                System.out.println(year+"年是闰年");
//            }
//            else{
//                System.out.println(year+"年不是闰年");
//            }
//        }




        //6  30以内的随机数,请输入任意一个数,循环10次,求这个数在随机数范围内出现的次数

//        int num = 12;
//        int count = 0;
//            for (int i = 0; i < 10; i++) {
//               int number = (int)(Math.random()*30);
//               if(number==num){
//                   count++;
//               }
//            }
//        System.out.println(count);






        //7 输入一个正整数，将该数的各位左右反转输出，即输入123，输出321。（使用while循环实现）
        Scanner scan6 = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int positive = scan6.nextInt();
        int i = 10;
        int j = 1;
        int quotient;
        while(true){
            quotient = positive/i;
            if(quotient==0){
                break;
            }
            i = i*10;
            j++;
        }

        int[] arr = new int[j];
        int l = 0;
        int remainder = 1;
        while(true){
            remainder = positive%10;
            if(true) {
                positive = positive / 10;
                arr[l] = remainder;
                l++;
            }if(l==j){
                break;
            }
        }

        int k = 0;
        while(k<j) {
            System.out.print(arr[k]);
            k++;
        }



    }
}
