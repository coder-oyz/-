package com.oyz.command;

public class Light implements Receiver{
    @Override
    public void trunOn() {
        System.out.println("开灯");
    }

    @Override
    public void trunOff() {
        System.out.println("关灯");
    }
}
