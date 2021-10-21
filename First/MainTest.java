package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void methodArray1() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-8);
        arr.add(8);
        arr.add(-1);
        arr.add(7);
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        for (Integer a : arr) {
            if (a >= 0) {
                arrayList1.add(a);
            }
        }
        Collections.sort(arrayList1);
        for (int i=arrayList1.size()-1; i>=0;i--){
            arrayList2.add(arrayList1.get(i));
        }
        Assert.assertEquals(arrayList1.size(),arrayList2.size());
        //Assert.assertEquals(arrayList1,arrayList2);

    }

    @org.junit.jupiter.api.Test
    void methodArray2() {
        int[] mass = {-3, 5, 6, -9, -1, 0};
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
        Assert.assertEquals(len,index);
        //Assert.assertEquals(mass,voidArr);
    }
}