package com.oyz.command;

public class Tv implements Receiver{
    @Override
    public void trunOn() {
        System.out.println("智能电视开机");
    }
    @Override
    public void trunOff() {
        System.out.println("智能电视关机");
    }
}
