package com;

import com.panshi.springBoot.listener.MyApplicationEvent;
import com.panshi.springBoot.listener.MyApplicationListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        //SpringApplication.run(App.class,args);


        //创建一个可执行的spring应用程序
        SpringApplication application = new SpringApplication(App.class);
        //配置事件监听器
        application.addListeners(new MyApplicationListener());
        //配置应用程序上下文
        ConfigurableApplicationContext context =application.run(args);
        //发布事件
        context.publishEvent(new MyApplicationEvent(new Object()));
        //关闭监视器
        context.close();
    }
}
