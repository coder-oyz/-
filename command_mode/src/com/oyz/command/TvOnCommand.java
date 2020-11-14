package com.oyz.command;
//电视关机的命令类
public class TvOnCommand implements  Command{
    //电视开机命令的接受者   也就是电视
    public Receiver receiver;

    public TvOnCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.trunOn();
    }

    @Override
    public void fallback() {//也可以变成一个回退的函数
        this.receiver.trunOff();
    }
}
