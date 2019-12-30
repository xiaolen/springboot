package com.springboot.test;


import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author:秦晓渊
 * @Date:2018/12/113:05
 */
@Component
public class TestTask {
    private int count = 0;

//定时任务注解详细查看注解参数

    @Scheduled(cron = "*/6****?")
    private void process() {
        Date ate = new Date();

        try {
            Thread.sleep(100L);
            //System.out.println(date+"["+Thread.currentThread().getName()+"]"+"thisisschedulertaskruning"+(count++));
//            String path = "http://localhost:8993/api/json";
            //创建对象HttpClient
            HttpClient httpclient = new HttpClient();
            //创建Get请求对象
//            GetMethod get = new GetMethod(path);
            //发送get请求，并且返回状态码
//            int st1 = httpclient.executeMethod(get);
//            System.out.println(st1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}