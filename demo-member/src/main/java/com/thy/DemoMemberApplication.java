package com.thy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.thy.dao")
@EnableFeignClients  //启用Feign
public class DemoMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMemberApplication.class, args);
	}

}
