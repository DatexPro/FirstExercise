public class SecondMethod {
    public int[] methodArray2(int[] mass) {
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
