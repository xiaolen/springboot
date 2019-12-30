package com.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mapper.UserMapper;
import com.springboot.pojo.User;
import com.springboot.service.UserService;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;

	@Override
	public void saveUser(User user) {
		System.out.println("service中的数据"+user);
		userMapper.saveUser(user);
		
	}

	@Override
	public List<User> queryUserList() {
		List<User> userlist= userMapper.queryUserList();
		return userlist;
	}

}
