package com.thy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplateController {

    private final RestTemplate restTemplate;

    @Autowired
    public RestTemplateController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "rest-get", produces = "text/html;charset=utf-8")
    public String restTemplateGet() {
        //post请求是的方法是postForObject,第二个参数是返回值类型
        // test git
        // git
        // w awe
        return restTemplate.getForObject("http://localhost:8090/order/queryUser?userId=12",
                String.class);

    }
}
