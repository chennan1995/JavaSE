package club.banyuan.test;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/16 10:46 上午
 */
public class test01 {
    public static void main (String args[]){

        int[] arr = {43,0,45,342,5,535,54,45,0,54,11,232,-543,534,765,3445,4,65,867,34,6767,45};


//        System.out.println(min(arr));
//        System.out.println(method(arr,12));
//        method2(arr,54);
//        sort(arr);
//        printArray(arr);
//        printArray(add(arr,9,211));
//            printArray(remove(arr,9));


//        int[] arr1 = {43,566,87,908,342,-67,-645,-234,-1,0,0,0,55,11,22,11,33,22,55,22};
//        int[] arr2 = duplicateRemoval(arr1);
//        printArray(arr2);



        }

//求最小值
        public static int min(int[] arr){
        int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]<min){
                    min = arr[i];
                }
            }
            return min;
        }

        public static int method(int[] arr, int num){
        int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if(num==arr[i]){
                    count++;
                }
            }
            if(count==0){
                System.out.println("数组中没有这个数字");
            }
            return count;
        }

        public static void method2(int[] arr, int num){
        int count =0;
            for (int i = 0; i < arr.length; i++) {
                if(num==arr[i]){
                    System.out.println(i);
                    count++;
                }
            }
            if(count==0){
                System.out.println("数组中没有这个数字");
            }
        }

        public  static void sort(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length-1; j++) {
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        public static void printArray(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+"\t");
//                System.out.print('\t');
            }
        }

        public static int[] add(int[] arr, int index, int num){
            int[] newArray = new int[arr.length+1];
            for(int i=0;i<index;i++){
                newArray[i]=arr[i];
            }
            newArray[index]=num;
            for(int i=index+1;i<newArray.length;i++){
                newArray[i]=arr[i-1];
            }
            return newArray;
        }


    public static int[] remove(int[] arr, int index){
        int[] newArray = new int[arr.length-1];
        for(int i=0;i<index;i++){
            newArray[i]=arr[i];
        }
        for(int i=index;i<newArray.length;i++){
            newArray[i]=arr[i+1];
        }
        return newArray;
    }

        public static int[] duplicateRemoval(int[] arr){
        int[] newArray = new int[arr.length];
        sort(arr);
        int count = 0;
        newArray[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                newArray[count+1]=arr[i];
                count++;
            }
        }
        int[] infoArray = new int[count+1];
        for(int i=0;i<infoArray.length;i++){
            infoArray[i]=newArray[i];
        }
        return infoArray;
        }

}
