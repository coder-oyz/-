package com.oyz.normal;

public class Phone {
    public void openTv(Tv tv){
        tv.turnOn();
    }
    public void closeTv(Tv tv){
        tv.turnOff();
    }
    public void openLight(Light light){
        light.turnOn();
    }
    public void closeLight(Light light){
        light.turnOff();
    }
}
