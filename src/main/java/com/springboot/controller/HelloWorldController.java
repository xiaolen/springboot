package com.springboot.controller;

import com.springboot.pojo.Bar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/receive")
@Configuration
//@PropertySource(value = {"classpath:*"},ignoreResourceNotFound = true,encoding = "utf-8")
public class HelloWorldController {

	@Autowired
	private Bar bar;
	@RequestMapping("/data")
    @ResponseBody
	public String info(@RequestBody String str) {
		String port;
		return "Hello world!";
	}

	@RequestMapping("/data1")
	@ResponseBody
	public String info() {

		String s = bar.getName();
		System.out.println(s);
		return bar.getName();
	}
}