package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


/**
 *@Author:秦晓渊
 *@Date:2018/11/2719:51
 */
@SpringBootApplication
//定时任务
//@EnableScheduling
public class Application extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	/**
	 * 重写该方法，然后将maven配置打包方式改为war并移除嵌入式tomcat使项目能打成war部署到服务器上
	 * @param application
	 * @return
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

}