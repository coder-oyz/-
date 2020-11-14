package com.oyz.normalPlus;

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


    //新加
    public void openFan(Fan fan){
        fan.turnOn();
    }
    public void closeFan(Fan fan){
        fan.turnOff();
    }

}
