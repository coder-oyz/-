package com.oyz.command;
//关灯的命令类
public class LightOffCommand implements Command{
    //关灯命令的接受者   也就是电灯
    private Receiver receiver;

    public LightOffCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.trunOff();
    }

    @Override
    public void fallback() {
        receiver.trunOn();
    }
}
