package com.takout.healthdemo;

/**
 * @date 2019. 07. 02.
 * @author Della Kim
 */

public class Record {
    // power : 강도 or 무게
    private int power;
    private int count;

    public Record() {
        this.power = 0;
        this.count = 0;
    }

    public Record(int power, int count) {
        this.power = power;
        this.count = count;
    }

    public void addCount() {
        this.count++;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
