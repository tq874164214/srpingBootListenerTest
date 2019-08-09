package com.panshi.springBoot.listener;

import org.springframework.context.ApplicationEvent;

public class MyApplicationEvent extends ApplicationEvent {

    /**
     * Created by Administrator on 2018\11\13 0013.
     * 自定义事件继承ApplicationEvent
     */
    public MyApplicationEvent(Object source) {
        super(source);
    }
}
