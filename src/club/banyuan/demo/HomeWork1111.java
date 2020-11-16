package club.banyuan.demo;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/11 4:21 下午
 */
public class HomeWork1111 {
    public static void main(String[] args) {
        //1
        int[] arr = {13,43,54,12,1,6,8,22};
        sort(arr, false);
        printArray(arr);
        //2
        sort(arr);
        printArray(arr);
        //3
            int[] arr2 = {13,26,-3,4,54,26,37,18,69,-10};
            print(arr2);


        //4
        int p = multiply(7,8);
        System.out.println(p);

        //5


        //6
        convert(3456789);


        //7
            int[] arr3 = {11,22,11,22,22,11,43,43,43,44,56,43,22};
        printArray(filtArray(arr3));




        //一

//            printGradeTable();

        //二
//        formateByte(15320031l);

    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    //1####################################

    public static void sort(int[] arr, boolean isAsc){
        if(isAsc){
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j <arr.length-i-1; j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }else{
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j <arr.length-i-1; j++){
                    if(arr[j] < arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }

        }

    }


    //2##############################
        public static void sort(int[] arr){
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j <arr.length-i-1; j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }



        //3################################
            public static void print(int[] arr){
                for(int i=0;i< arr.length;i++) {
                    System.out.print("["+i+"]="+arr[i]+" ");
                    if(i%5==4){
                        System.out.println('\n');
                    }
                }
            }





        //4################################

        public static int multiply(int n1, int n2){
            int product = 0;
            for(int i = 0; i < n1; i++){
                product = product+n2;
            }
            return product;
        }


         //5################################

            public static void convert(long minute){
               int year = (int)minute/(24*60*365);
               int date = (int)minute/(24*60);
               int day = (int)date%365;
                System.out.println(minute+"分钟是"+year+"年"+day+"天");
            }

          //6################################
//            int f = 150;
//            int f1 = 1;
//            int f2 = 2;
//            int f3 = 5;
//            int total = 0;
//            for(int i = 1; i <= 100;i++){
//                for(int j =1; j<=100-i; j++){
//                    int k = 100-i-j;
//                        if((i+2*j+5*k)==150){
//                            System.out.println("1.5元可兑换成"+i+"枚1分硬币，"+j+"枚2分硬币，"+k+"枚5分硬币");
//                            total+=1;
//                        }
//                }
//            }
//            System.out.println("兑换方案总数为"+total+"种");





          //7################################
//            public static int[] filtArray(int[] arr){
//                for(int i = 0; i<arr.length; i++){
//                    for(int j=i+1;j<arr.length;){
//                        if(arr[i]==arr[j]){
//                            arr = remove(arr,j);
//                            continue;
//                        }else {
//                            j++;
//                        }
//                    }
//                }
//                return arr;
//            }
//
//            public static int[] remove(int[] arr, int index){
//                    int[] tempArr = new int[arr.length-1];
//                    for(int i=0;i<index;i++){
//                        tempArr[i] = arr[i];
//                    }
//                    for(int i=index+1;i< tempArr.length;i++){
//                        tempArr[i] = arr[i+1];
//                    }
//                    return tempArr;
//            }

                //{11,22,11,22,22,11,43,43,43,44,56,43,22}
                public static int[] filtArray(int[] arr){
                        int[] newArray = new int[arr.length];
                        int k = 0;
                        for(int i = 0; i <arr.length; i++){
                            boolean flag = true;
                            for(int j=i+1; j<arr.length;j++){
                                if(arr[i]==arr[j]){
                                    flag = false;
                                    break;
                                }
                            }
                            if(flag){
                                newArray[k++] = arr[i];
                            }
                        }
                        int[] infoArray = new int[k];
                        for(int i =0; i<infoArray.length;i++){
                            infoArray[i]=newArray[i];
                        }
                        return infoArray;
                }



            //一##############################



                public static void printGradeTable(){
                    System.out.println("grade"+"\t"+"points");
                    System.out.println(1.0+"\t"+"\t"+"0-49.5");
                    System.out.println(1.3+"\t"+"\t"+"50-59.5");
                    System.out.println(1.7+"\t"+"\t"+"60-64.5");
                    System.out.println(2.0+"\t"+"\t"+"65-69.5");
                    System.out.println(2.3+"\t"+"\t"+"70-74.5");
                    System.out.println(2.7+"\t"+"\t"+"75-79.5");
                    System.out.println(3.0+"\t"+"\t"+"80-84.5");
                    System.out.println(3.3+"\t"+"\t"+"85-89.5");
                    System.out.println(3.7+"\t"+"\t"+"90-94.5");
                    System.out.println(4.0+"\t"+"\t"+"95-99.5");
                    System.out.println(4.7+"\t"+"\t"+"100-104.5");
                    System.out.println(5.0+"\t"+"\t"+"105-120");






                }



                public static double getGrade(double point){
                    if(point>=0&&point<=49.5){
                        return 1.0;
                    }else if(point>=50&&point<=59.5){
                        return 1.3;
                    }else if(point>=60&&point<=64.5){
                        return 1.7;
                    }else if(point>=65&&point<=69.5){
                        return 2.0;
                    }else if(point>=70&&point<=74.5){
                        return 2.3;
                    }else if(point>=75&&point<=79.5){
                        return 2.7;
                    }else if(point>=80&&point<=84.5){
                        return 3.0;
                    }else if(point>=85&&point<=89.5){
                        return 3.3;
                    }else if(point>=90&&point<=94.5){
                        return 3.7;
                    }else if(point>=95&&point<=99.5){
                        return 4.0;
                    }else if(point>=100&&point<=104.5){
                        return 4.7;
                    }else if(point>=105&&point<=120){
                        return 5.0;
                    }
                    return 0;
                }

                public static boolean isPass(double point){
                        if(point>=65){
                            return true;
                        }else{
                            return false;
                        }
                }







            //二##############################

            public static String formateByte(long bytes){

                if(bytes<0){
                    System.out.println("输入数据有误");
                    return "0";
                }else if(bytes<1024){
                    System.out.println(bytes+"B");
                    return bytes+"B";
                }else if(bytes<1024*1024){
                    System.out.println(bytes/1000.0+"KB");
                    return bytes/1000.0+"KB";
                }else if(bytes<1024*1024*1024){
                    System.out.println(bytes/(1000*1000.0)+"MB");
                    return bytes/(1000*1000.0)+"MB";
                }else{
                    System.out.println(bytes/(1000*1000*1000.0)+"GB");
                    return bytes/(1000*1000*1000.0)+"GB";
                }

            }








}
