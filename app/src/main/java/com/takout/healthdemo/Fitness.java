package com.takout.healthdemo;

import java.util.ArrayList;

public class Fitness {

    private int fitnessCount;
    private ArrayList<Record> rowingRecordList;
    private ArrayList<Record> pressRecordList;

    public Fitness() {
        this.fitnessCount = 0;
        this.rowingRecordList = new ArrayList<>();
        this.pressRecordList = new ArrayList<>();
    }

    public void addRowingRecordToList(Record item) {
        this.rowingRecordList.add(item);
    }

    public void addPressRecordToList(Record item) {
        this.pressRecordList.add(item);
    }

    public void calcFitnessCount() {
        int sum = 0;

        for(int i = 0; i < rowingRecordList.size(); ++i) {
            sum += rowingRecordList.get(i).getCount();
        }

        for(int i = 0; i < pressRecordList.size(); ++i) {
            sum += pressRecordList.get(i).getCount();
        }

        this.fitnessCount = sum;
    }

    public int getFitnessCount() {
        return fitnessCount;
    }

    public void setFitnessCount(int fitnessCount) {
        this.fitnessCount = fitnessCount;
    }

    public ArrayList<Record> getRowingRecordList() {
        return rowingRecordList;
    }

    public void setRowingRecordList(ArrayList<Record> rowingRecordList) {
        this.rowingRecordList = rowingRecordList;
    }

    public ArrayList<Record> getPressRecordList() {
        return pressRecordList;
    }

    public void setPressRecordList(ArrayList<Record> pressRecordList) {
        this.pressRecordList = pressRecordList;
    }
}
