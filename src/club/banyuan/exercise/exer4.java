package club.banyuan.exercise;

import java.util.Scanner;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/12 4:49 下午
 */
public class exer4 {
    public static void main(String[] args) {

/*
    任意输入 n行 n列的乘法口诀表
 */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入n的值：");
//        int n =sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+"*"+i+"="+(i*j)+'\t');
//            }
//            System.out.print('\n');
//        }




/*
    输入三个班，每班10个学生的成绩，求每个班的总分和平均分
 */

//        Scanner scan5 = new Scanner(System.in);
//        System.out.println("请输入第一个班学生的成绩：");
//        int[] arr1 = new int[10];
//        for (int i = 0; i < 10; i++) {
//            arr1[i] = scan5.nextInt();
//        }
//        int total1 = 0;
//        double aver1 = 0;
//        for (int i = 0; i < 10; i++) {
//            total1 = total1 + arr1[i];
//        }
//        aver1 = total1/10.0;
//
//        System.out.println("请输入第二个班学生的成绩：");
//        int[] arr2 = new int[10];
//        for (int i = 0; i < 10; i++) {
//            arr2[i] = scan5.nextInt();
//        }
//        int total2 = 0;
//        double aver2 = 0;
//        for (int i = 0; i < 10; i++) {
//            total2 = total2 + arr2[i];
//        }
//        aver2 = total2/10.0;
//
//        System.out.println("请输入第三个班学生的成绩：");
//        int[] arr3 = new int[10];
//        for (int i = 0; i < 10; i++) {
//            arr3[i] = scan5.nextInt();
//        }
//        int total3 = 0;
//        double aver3 = 0;
//        for (int i = 0; i < 10; i++) {
//            total3 = total3 + arr3[i];
//        }
//        aver3 = total3/10.0;
//
//        System.out.println("第一个班总分为："+total1+"，"+"平均分为："+aver1);
//        System.out.println("第二个班总分为："+total2+"，"+"平均分为："+aver2);
//        System.out.println("第三个班总分为："+total3+"，"+"平均分为："+aver3);


/*
    5.打印出下面的图案
    54321
    5432
    543
    54
    5
 */
//        for(int i=0;i<5;i++){
//            int j = 0;
//                for(;j<=4-i;j++){
//                    System.out.print(5-j);
//                }
//        System.out.println('\n');
//        }



/*
    定义一个数组,数组成员10个,找出数组中最大数连同下标一起输出
 */
//        int[] arr = {12,24,53,98,98,3,12,5,43,98};
//        for(int i=0;i<arr.length;i++){
//            boolean flag = true;
//            for(int j=0;j<arr.length;j++){
//                if(arr[i]<arr[j]){
//                    flag = false;
//                    break;
//                }
//            }if(flag){
//                System.out.println("数组最大数为"+"arr["+i+"]"+arr[i]);
//            }
//        }





/*
     输入10个整数存入数组，然后复制到b数组中输出
 */
//        int[] arr1 = new int[10];
//        Scanner sc2 = new Scanner(System.in);
//        for(int i=0;i<10;i++){
//            System.out.println("请输入第"+(i+1)+"个整数：");
//            arr1[i] = sc2.nextInt();
//        }
//        int[] arr2 = new int[10];
//        for(int i=0;i<10;i++){
//            arr2[i]=arr1[i];
//        }
//        for(int i=0;i<10;i++){
//            System.out.print(arr2[i]+" ");
//        }





/*
    声明一个int型的数组，循环接收8个学生的成绩，计算这8个学生的总分及平均分、最高分和最低分
 */
//            int[] arr = new int[8];
//            Scanner scan = new Scanner(System.in);
//            for(int i = 0; i<8; i++){
//                System.out.println("请输入第"+(i+1)+"个学生的成绩：");
//                arr[i] = scan.nextInt();
//            }
//            int sum = 0;
//            for (int i = 0; i < 8; i++) {
//                    sum = sum+arr[i];
//            }
//            System.out.println("8个学生的总分为："+sum);
//            System.out.println("8个学生的平均分为："+(sum/8));
//            for (int i = 0; i < 8;) {
//                boolean flag = true;
//                for (int j = 0; j < 8; j++) {
//                    if(arr[i]<arr[j]){
//                        flag = false;
//                        i++;
//                        break;
//                    }
//                }if(flag){
//                    System.out.println("最高分为" + arr[i] + "分");
//                    break;
//                }
//            }
//        for (int i = 0; i < 8; i++) {
//            boolean flag = true;
//            for (int j = 0; j < 8; j++) {
//                if(arr[i]>arr[j]){
//                    flag = false;
//                    break;
//                }
//            }if(flag) {
//                System.out.println("最低分为" + arr[i] + "分");
//                break;
//            }
//        }



/*
    定义一个长度为10的整型数组，循环输入10个整数。
    然后将输入一个整数，查找此整数，找到 输出下标，没找到给出提示。
 */
//        int[] arr = new int[10];
//        Scanner sc3 = new Scanner(System.in);
//        for(int i=0;i<10;i++){
//            System.out.println("请输入第"+(i+1)+"个整数：");
//            arr[i] = sc3.nextInt();
//        }
//        System.out.println("请输入一个整数：");
//        int num = sc3.nextInt();
//        boolean flag = false;
//        for(int i = 0;i<10;i++){
//            if(num==arr[i]){
//                System.out.println("此数是"+"arr["+i+"]");
//                flag = true;
//            }
//        }
//        if(flag==false){
//            System.out.println("此数不存在于数组中");
//        }




/*
    在一个数组中找出最大和最小值，并输出它们的位置
 */
//        int[] arr = {24,74,54,67,34,74,24,42,48,65,74,44};
//        for(int i=0;i<arr.length;i++){
//            boolean flag = true;
//            for(int j=0;j<arr.length;j++){
//                if(arr[i]<arr[j]){
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag){
//                System.out.println("最大值为"+"arr["+i+"]："+arr[i]);
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            boolean flag = true;
//            for(int j=0;j<arr.length;j++){
//                if(arr[i]>arr[j]){
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag){
//                System.out.println("最小值为"+"arr["+i+"]："+arr[i]);
//            }
//        }





/*
    有30个0~9之间的数字，分别统计0~9这10个数字分别出现了多少次
    0  1  2  3  4  5  6  7  8  9
    随机30个数字
 */
//            int[] arr = new int[30];
//            for (int i = 0; i < 30; i++) {
//                arr[i] = (int)(Math.random()*10);
//            }
//            for (int i = 0; i < 10; i++) {
//                  int n = 0;
//                  for (int j = 0; j < 30; j++) {
//                      if(arr[j]==i){
//                          n++;
//                      }
//                  }
//                System.out.println("数字"+i+"出现了"+n+"次");
//            }

    }
}
