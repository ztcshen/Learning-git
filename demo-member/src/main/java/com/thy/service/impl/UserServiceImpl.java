package com.thy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thy.dao.UserMapper;
import com.thy.pojo.User;
import com.thy.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public User selectById(Long userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

}
