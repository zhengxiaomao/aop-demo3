package com.example.aopdemo3.controller;

import com.example.aopdemo3.annoation.History;
import com.example.aopdemo3.entity.HistoryBo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class TestController {

    /**
     * aop测试
     * @param bo
     * @param request
     * @param response
     */
    @PostMapping("/aopTest")
    @History
    public HistoryBo aopTest(@RequestBody HistoryBo bo, HttpServletRequest request, HttpServletResponse response){

        System.out.println("程序进入 aopTest");

        return bo;
    }


}
