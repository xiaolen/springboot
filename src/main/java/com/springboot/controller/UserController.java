package com.springboot.controller;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.pojo.User;
import com.springboot.service.UserService;

@Controller
@RequestMapping("/user")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;
	

	@PostMapping("/regist")
	public String saveUser(User user){
		System.out.println(user);
		userService.saveUser(user);
		return "/success";
		
	}
	@RequestMapping("/temp")
	public String file() {
		System.out.print("================请求路径===跳转file页面=====" + "\n");
		return "/temp";
	}
	
	/*
	 * http://localhost:8080/user/list
	 * POST
	 * 返回值：List<User> json格式
	 */
	@RequestMapping("/list")
	@ResponseBody
	public List<User> queryAll(){
		List<User> list = this.userService.queryUserList();
		log.info(list.toString());
//		System.out.println(list.toString());
		return list;
	}
	

}
