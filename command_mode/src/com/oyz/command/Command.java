package com.oyz.command;
//命令接口
public interface Command {
    /**
     * 执行操作
     */
    public void execute();

    /**
     * 操作回退
     */
    public void fallback();
}
