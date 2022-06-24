package com.thy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thy.common.ReturnData;
import com.thy.service.UserService;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/query")
	public ReturnData query(Long userId) {
		return ReturnData.success(userService.selectById(userId));
	}
	
	@GetMapping("/loadBalance")
	public ReturnData loadBalance() {
		return ReturnData.success("loadBalance:8080");
	}

}
