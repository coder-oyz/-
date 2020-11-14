package com.oyz.command;
//开灯的命令类
public class LightOnCommand implements Command{
    //开灯命令的接受者   也就是电灯
    private Receiver receiver;

    public LightOnCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.trunOn();
    }

    @Override
    public void fallback() {
        receiver.trunOff();
    }
}
