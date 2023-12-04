package com.epam.rd.autotasks;


class LoopStatements {
    public static int sumOfBinary(int n) {
        int count=0, num=n;
        while (num>0){
            if (num%2==1) {
                count++;
            }
            num=num/2;
        }
        return count;
    }
}
