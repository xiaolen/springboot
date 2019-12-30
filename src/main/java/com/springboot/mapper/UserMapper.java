package com.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.pojo.User;

@Mapper
public interface UserMapper {

	void saveUser(User user);
	
	List<User> queryUserList();

	
}
