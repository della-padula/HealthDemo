package com.takout.healthdemo;

public class DemoData {
    public static Fitness demoFitnessData = new Fitness();

    public static void init() {

    }

    public static void setDemoFitnessData(int size) {
        for(int i = 0; i < size; ++i) {
            int random = (int) (Math.random() * 20 + 1);
            demoFitnessData.addRowingRecordToList(new Record((int) (Math.random() * random), (int) (Math.random() * random)));
            demoFitnessData.addPressRecordToList(new Record((int) (Math.random() * random), (int) (Math.random() * random)));
        }
    }

    public static int getAverageData(int type) {
        switch(type) {
            case 1:
                break;
            case 2:
                break;
        }
        return 0;
    }

}
