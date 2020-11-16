package club.banyuan.demo;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/11 10:46 上午
 */
public class MyArray {
    public static void main(String[] args) {

        // System.out.printf("%.2f",0.1-0.09);  //保留两位小数
        printGradeTable();
    }

    public static void printGradeTable() {
        double grade = 1.0;

        for (int i = 0; i < 12; i++) {
            if (i == 0) {
                System.out.printf("%.1f\t0 ~ 49.5\n", grade);
            } else if (i == 1) {
                System.out.printf("%.1f\t50 ~ 59.5\n", grade);
            } else if (i == 11) {
                //当i==11的时候  是循环结束的一个临界点
                grade = getGrade(60 + (i - 2) * 5);
                System.out.printf("%.1f\t105 ~ 120\n", grade);
            } else {
                //当i==2的是已经走到这里
                grade = getGrade(60 + (i - 2) * 5);  //i==2的时候是一个临界点
                System.out.printf("%.1f\t" + (60 + (i - 2) * 5) + " ~ " + (60 + (i - 2) * 5 + 4.5) + "\n", grade);
            }
            grade = getGrade(60 + (i - 2) * 5);
        }
    }

    public static double getGrade(double point) {
        if (point >= 0 && point < 50) {
            return 1.0;
        }
        if (point >= 50 && point < 60) {
            return 1.3;
        }
        if (point >= 105 && point <= 120) {
            return 5.0;
        }
        int temp = (int) (point - 60) / 5;
        switch (temp) {
            case 0:
                return 1.7;
            case 1:
                return 2.0;
            case 2:
                return 2.3;
            case 3:
                return 2.7;
            case 4:
                return 3.0;
            case 5:
                return 3.3;
            case 6:
                return 3.7;
            case 7:
                return 4.0;
            case 8:
                return 4.7;
        }
        return 0.0;
    }
}