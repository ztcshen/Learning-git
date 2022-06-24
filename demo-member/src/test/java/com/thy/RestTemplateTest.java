package com.thy;

import com.thy.controller.RestTemplateController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


public class RestTemplateTest {

    @Autowired
    private RestTemplateController restTemplateController;

    @Test
    public void testGet() {

        restTemplateController = new RestTemplateController(new RestTemplate());
        restTemplateController.restTemplateGet();

    }



}
