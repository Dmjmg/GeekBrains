package ru.geekbrains.lesson3;

public class Main {
    public static void main(String [] args){
        System.out.println("Задание 1");
        int[] Arr = new int[] {0,1,1,0,0,0,0,1,1,0};
        for (int i = 0; i<10; i++){
            if (Arr[i] == 0){
                Arr[i] = 1;

            }
            else{
                Arr[i] = 0;
            }
        }
        for (int i = 0; i<10; i++) {
            System.out.print(Arr[i]+ " ");
        }
        System.out.println();
        System.out.println("Задание 2");

        int[] Arr1 = new int[100];
        for (int i = 0; i<100; i++){
            Arr1[i] = i+1;
            System.out.print(Arr1[i]+ " ");
        }
        System.out.println();
        System.out.println("Задание 3");
        int[] Arr2 = new int[]{1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i<Arr2.length; i++){
            if (Arr2[i]<6){
                Arr2[i] *= 2;
            }
            System.out.print(Arr2[i]+ " ");
        }
        System.out.println();
        System.out.println("Задание 4");
        int[][] Arr3 = new int[8][8];
        for (int i = 0; i<8; i++){
            for (int j = 0; j<8; j++){
                if (i == j){
                    Arr3[i][j] = 1;
                } else if (i+j == 7) {
                    Arr3[i][j] = 1;
                }else {
                    Arr3[i][j] = 0;
                }
                System.out.print(Arr3[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("Задание 5");
        n5(5,8);
        System.out.println();
        System.out.println("Задание 6");
        n6();
        System.out.println();
        System.out.println("Задание 7");
        if (n7() == true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
    public static void n5(int len, int intialValue){
        int[] Arr = new int[len];
        for (int i = 0; i<len; i++){
            Arr[i] = intialValue;
            System.out.print(Arr[i]+" ");
        }
    }
    public static void n6(){
        int[] Arr = new int[]{1,5,3,2,11,4,5,2,4,8,9,16};
        int min = Arr[0];
        int max = Arr[0];
        for (int i = 1; i<Arr.length; i++){
            if(Arr[i] < min){
                min = Arr[i];
            }
            if(Arr[i]>max){
                max = Arr[i];
            }

        }
        System.out.println();
        System.out.println("min = "+min+" max = "+max);
    }
    public static boolean n7(){
        int Arr[] = new int[]{2,2,2,1,2,2,10,1};
        int sumF = 0;
        int sumS = 0;
        for (int i = 0; i<Arr.length; i++){
            sumF += Arr[i];
            for (int j = i+1; j<Arr.length; j++){
                sumS += Arr[j];
            }
            if(sumF == sumS){
                return true;
            }
            sumS=0;
        }
        return false;
    }
}
