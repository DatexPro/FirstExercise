package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(-9);
        array.add(8);
        array.add(5);
        array.add(-3);
        array.add(9);
        array.add(7);
        array.add(-5);

        int[] arr = {1, -5, 6, -9, 2, -1, 6, 8};


        System.out.println(Arrays.toString(methodArray2(arr)));
        System.out.println(methodArray1(array));
    }

    public static ArrayList<Integer> methodArray1(ArrayList<Integer> arr) {
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        for (int a : arr) {
            if (a >= 0) {
                arrayList1.add(a);
            }
        }
        Collections.sort(arrayList1);
        for (int i=arrayList1.size()-1; i>=0;i--){
            arrayList2.add(arrayList1.get(i));
        }
        return arrayList2;
    }
    public static int[] methodArray2(int[] mass){
        int len = 0;
        int index = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] >= 0) {
                len++;
            }
        }
        int[] voidArr = new int[len];

        for (int j = 0; j < mass.length; j++) {
            if (mass[j] >= 0) {
                voidArr[index] += mass[j];
                index++;
            }
        }
        for (int i = 0; i < voidArr.length - 1; i++) {
            for (int j = voidArr.length - 1; j > i; j--) {
                if (voidArr[j - 1] < voidArr[j]) {
                    int temp = voidArr[j - 1];
                    voidArr[j - 1] = voidArr[j];
                    voidArr[j] = temp;
                }
            }
        }
        return voidArr;
    }
}
