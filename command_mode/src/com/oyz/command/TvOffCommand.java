package com.oyz.command;
//电视开机的命令类
public class TvOffCommand implements Command{
    //电视关机命令的接受者   也就是电视
    public Receiver receiver;

    public TvOffCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.trunOff();
    }

    @Override
    public void fallback() {//也可以变成一个回退的函数
        this.receiver.trunOn();
    }
}
