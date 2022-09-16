package com.company;

class NumberClass {
    int[] valuesArr;
    int[] scalesArr;
    int[] rangesArr;
    int sum = 0;

    public NumberClass(int[] values, int[] scales) {
        valuesArr = values;
        scalesArr = scales;
        rangesArr = new int[valuesArr.length];

        sum = 0;

        for (int i = 0; i < scalesArr.length; i++)
            sum += scalesArr[i];

        int s = 0;
        for (int i = 0; i < rangesArr.length; i++) {
            rangesArr[i] = s;
            s += scalesArr[i];
        }
    }

    public int returnNumber() {
        int random = (int) (Math.random() * (sum - 1));

        int index = 0;
        for (int i = 0; i < rangesArr.length; i++) {
            if (rangesArr[i] > random)
                break;
            index = i;
        }
        return valuesArr[index];
    }
}

public class Main {

    public static void main(String[] args) {

        int[] values = {1, 2, 3};
        int[] scales = {1, 2, 10};

        NumberClass NumberClass = new NumberClass(values, scales);
    
        for (int i = 0; i < 10; i++){
            int returnValue = NumberClass.returnNumber();
            System.out.println("Значение № " + (i+1) + " : "+returnValue);
        }
    }
}