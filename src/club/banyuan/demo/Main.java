package club.banyuan.demo;


public class Main {

    public static void main(String[] args){
        //6#############################
        int total = 0;
        for(int i = 1; i<=100;i++){
            for(int j =1; j<=100-i; j++) {
                int k = 100 - i - j;
                if (k >= 1) {
                    if ((i + 2 * j + 5 * k) == 150) {
                        System.out.println("1.5元可兑换成" + i + "枚1分硬币，" + j + "枚2分硬币，" + k + "枚5分硬币");
                        total += 1;
                    }
                }
            }
        }
        System.out.println("兑换方案总数为"+total+"种");


    }
}
