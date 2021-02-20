package com.example.demo.controller;

import com.example.demo.entity.tTumorData;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname TestController
 * @Description TODO
 * @Date 2021-02-02 15:10
 * @Author by qgc
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public String test(){
        List<tTumorData> list = testService.query();
        System.out.println(list);
        return "test";
    }
}
